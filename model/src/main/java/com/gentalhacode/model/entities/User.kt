package com.gentalhacode.model.entities

/**
 * .:.:.:. Created by @thgMatajs on 13/01/20 .:.:.:.
 */
interface User {
    val id: String
    val fullName: String
    val photoUrl: String
    val phoneNumber: String
    val email: String
    val cpf: Int
    val place: Place
}