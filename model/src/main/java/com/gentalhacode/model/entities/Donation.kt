package com.gentalhacode.model.entities

/**
 * .:.:.:. Created by @thgMatajs on 13/01/20 .:.:.:.
 */
interface Donation {
    val photoUrls: List<String>
    val name: String
    val description: String
    val ammount: Int
    val type: String
    val donated: Boolean
}