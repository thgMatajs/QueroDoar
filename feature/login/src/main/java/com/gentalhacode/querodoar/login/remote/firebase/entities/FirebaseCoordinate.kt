package com.gentalhacode.querodoar.login.remote.firebase.entities

import com.gentalhacode.model.entities.Coordinate

/**
 * .:.:.:. Created by @thgMatajs on 15/01/20 .:.:.:.
 */
data class FirebaseCoordinate(
    override val latitude: Double = 0.0,
    override val longitude: Double = 0.0
) : Coordinate