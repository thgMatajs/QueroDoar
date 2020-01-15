package com.gentalhacode.querodoar.login.remote.firebase.impl

import android.content.Intent
import com.gentalhacode.model.entities.User
import com.gentalhacode.model.exceptions.Exceptions
import com.gentalhacode.querodoar.login.data.repository.LoginFireBase
import com.gentalhacode.querodoar.login.remote.firebase.entities.FirebaseUser
import com.gentalhacode.querodoar.login.remote.firebase.entities.toFirebase
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.FirebaseFirestore
import io.reactivex.Completable
import io.reactivex.Single

/**
 * .:.:.:. Created by @thgMatajs on 15/01/20 .:.:.:.
 */
class LoginFireBaseImplementation(
    private val fbAuth: FirebaseAuth,
    private val fireStoreCollectionRef: CollectionReference
) : LoginFireBase {

    override fun loginWithGoogle(data: Intent?): Single<User> {
        return Single.create { emitter ->
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            try {
                val account = task.getResult(ApiException::class.java)
                val credential = GoogleAuthProvider.getCredential(account?.idToken, null)
                fbAuth.signInWithCredential(credential)
                    .addOnCompleteListener {
                        if (it.isSuccessful) {
                            val currentUser = fbAuth.currentUser?.toFirebase() ?: FirebaseUser()
                            fireStoreCollectionRef.add(currentUser)
                                .continueWith { task ->
                                    val doc = task.result
                                    doc?.update(
                                        mapOf(
                                            ID_KEY to currentUser.id
                                        )
                                    )
                                }
                                .addOnSuccessListener { emitter.onSuccess(currentUser) }
                                .addOnFailureListener { error -> emitter.onError(error) }
                        } else {
                            emitter.onError(it.exception!!)
                        }
                    }
            } catch (e: ApiException) {
                emitter.onError(e)
            }
        }
    }

    override fun logout(): Completable {
        return Completable.create { emitter ->
            fbAuth.signOut()
            if (fbAuth.currentUser == null) {
                emitter.onComplete()
            } else {
                emitter.onError(Exceptions.logoutNotComplete)
            }
        }
    }

    companion object {
        const val ID_KEY = "id"
    }
}