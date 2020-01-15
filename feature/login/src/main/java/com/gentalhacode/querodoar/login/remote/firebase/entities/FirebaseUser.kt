package com.gentalhacode.querodoar.login.remote.firebase.entities

import com.gentalhacode.model.entities.User
import com.google.firebase.auth.FirebaseUser

/**
 * .:.:.:. Created by @thgMatajs on 15/01/20 .:.:.:.
 */
data class FirebaseUser(
    override val id: String = "",
    override val fullName: String = "",
    override val photoUrl: String = "",
    override val phoneNumber: String = "",
    override val email: String = "",
    override val cpf: Int = 0,
    override val place: FirebasePlace = FirebasePlace()
) : User

fun FirebaseUser?.toFirebase(): com.gentalhacode.querodoar.login.remote.firebase.entities.FirebaseUser {
    return FirebaseUser(
        id = this?.uid ?: "",
        phoneNumber = this?.phoneNumber ?: "",
        email = this?.email ?: "",
        fullName = this?.displayName ?: "",
        photoUrl = this?.photoUrl.toString()
    )
}