package com.gentalhacode.querodoar.login.remote.firebase.entities

import com.gentalhacode.model.entities.Place

/**
 * .:.:.:. Created by @thgMatajs on 15/01/20 .:.:.:.
 */
data class FirebasePlace(
    override val city: String = "",
    override val state: String = "",
    override val address: String = "",
    override val addressNumber: Int = 0,
    override val complement: String = "",
    override val zipCode: Int = 0,
    override val coordinate: FirebaseCoordinate = FirebaseCoordinate()
): Place