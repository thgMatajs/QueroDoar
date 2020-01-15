package com.gentalhacode.querodoar.login.remote.di

import com.gentalhacode.querodoar.login.data.repository.LoginFireBase
import com.gentalhacode.querodoar.login.remote.firebase.impl.LoginFireBaseImplementation
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import org.koin.dsl.module

/**
 * .:.:.:. Created by @thgMatajs on 15/01/20 .:.:.:.
 */
val loginFirebaseModule = module {
    single { FirebaseAuth.getInstance() }
    factory { FirebaseFirestore.getInstance().collection("user-staging") }
    factory<LoginFireBase> { LoginFireBaseImplementation(get(), get()) }
}