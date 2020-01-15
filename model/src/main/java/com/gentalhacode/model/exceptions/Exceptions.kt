package com.gentalhacode.model.exceptions

/**
 * .:.:.:. Created by @thgMatajs on 13/01/20 .:.:.:.
 */
object Exceptions {
    val paramsIsNull = IllegalArgumentException("params cannot be null")
    val paramsIsNullOrBlank = IllegalArgumentException("params cannot be null or blank")
    val logoutNotComplete = IllegalArgumentException("logout not complete")
}