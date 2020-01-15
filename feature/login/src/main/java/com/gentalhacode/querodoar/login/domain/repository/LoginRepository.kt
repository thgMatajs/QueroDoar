package com.gentalhacode.querodoar.login.domain.repository

import com.gentalhacode.model.entities.User
import io.reactivex.Completable
import io.reactivex.Single

/**
 * .:.:.:. Created by @thgMatajs on 15/01/20 .:.:.:.
 */
interface LoginRepository {

    fun loginWithGoogle(): Single<User>
    fun logout(): Completable
}