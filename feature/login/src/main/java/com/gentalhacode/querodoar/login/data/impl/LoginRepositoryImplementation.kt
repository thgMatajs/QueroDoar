package com.gentalhacode.querodoar.login.data.impl

import com.gentalhacode.model.entities.User
import com.gentalhacode.querodoar.login.data.source.LoginDataFactory
import com.gentalhacode.querodoar.login.domain.repository.LoginRepository
import io.reactivex.Completable
import io.reactivex.Single

/**
 * .:.:.:. Created by @thgMatajs on 15/01/20 .:.:.:.
 */
class LoginRepositoryImplementation(
    private val loginDataFactory: LoginDataFactory
) : LoginRepository {
    override fun loginWithGoogle(): Single<User> {
        return loginDataFactory.getFireBase().loginWithGoogle()
    }

    override fun logout(): Completable {
        return loginDataFactory.getFireBase().logout()
    }
}