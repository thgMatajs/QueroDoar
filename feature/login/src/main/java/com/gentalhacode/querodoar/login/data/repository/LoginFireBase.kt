package com.gentalhacode.querodoar.login.data.repository

import android.content.Intent
import com.gentalhacode.model.entities.User
import io.reactivex.Completable
import io.reactivex.Single

/**
 * .:.:.:. Created by @thgMatajs on 15/01/20 .:.:.:.
 */
interface LoginFireBase {
    fun loginWithGoogle(data: Intent?): Single<User>
    fun logout(): Completable
}