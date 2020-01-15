package com.gentalhacode.model.entities


/**
 * .:.:.:. Created by @thgMatajs on 13/01/20 .:.:.:.
 */
interface Place {
    val city: String
    val state: String
    val address: String
    val addressNumber: Int
    val complement: String
    val zipCode: Int
    val coordinate: Coordinate
}