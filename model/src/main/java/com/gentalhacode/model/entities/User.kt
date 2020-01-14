package com.gentalhacode.model.entities

import com.gentalhacode.model.entities.Place

/**
 * .:.:.:. Created by @thgMatajs on 13/01/20 .:.:.:.
 */
interface User {
    val fullName: String
    val photoUrl: String
    val phoneNumber: Int
    val email: String
    val cpf: Int
    val place: Place
}