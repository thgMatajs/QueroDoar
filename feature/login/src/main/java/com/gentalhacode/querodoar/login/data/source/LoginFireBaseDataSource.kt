package com.gentalhacode.querodoar.login.data.source

import com.gentalhacode.model.entities.User
import com.gentalhacode.querodoar.login.data.repository.LoginDataSource
import com.gentalhacode.querodoar.login.data.repository.LoginFireBase
import io.reactivex.Completable
import io.reactivex.Single

/**
 * .:.:.:. Created by @thgMatajs on 15/01/20 .:.:.:.
 */
class LoginFireBaseDataSource(
    private val firebase: LoginFireBase
) : LoginDataSource.FireBase {

    override fun loginWithGoogle(): Single<User> {
        return firebase.loginWithGoogle()
    }

    override fun logout(): Completable {
        return firebase.logout()
    }
}