package com.gentalhacode.model.entities

/**
 * .:.:.:. Created by @thgMatajs on 14/01/20 .:.:.:.
 */
interface Institution {
    val name: String
    val place: Place
    val cnpj: Int
    val segment: String
    val photoUrls: List<String>
    val phoneNumbers: List<Int>
    val contactsName: List<String>
}