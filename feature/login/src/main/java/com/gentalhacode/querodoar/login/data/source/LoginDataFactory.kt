package com.gentalhacode.querodoar.login.data.source

/**
 * .:.:.:. Created by @thgMatajs on 15/01/20 .:.:.:.
 */
class LoginDataFactory(
    private val loginFireBaseDataSource: LoginFireBaseDataSource
) {
    fun getFireBase() = loginFireBaseDataSource
}