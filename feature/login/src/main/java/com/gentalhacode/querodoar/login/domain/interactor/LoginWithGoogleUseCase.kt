package com.gentalhacode.querodoar.login.domain.interactor

import com.gentalhacode.model.base.PostExecutorThread
import com.gentalhacode.model.base.SingleUseCase
import com.gentalhacode.model.entities.User
import com.gentalhacode.querodoar.login.domain.repository.LoginRepository
import io.reactivex.Single

/**
 * .:.:.:. Created by @thgMatajs on 15/01/20 .:.:.:.
 */
class LoginWithGoogleUseCase(
    private val repository: LoginRepository,
    postExecutorThread: PostExecutorThread
) : SingleUseCase<User, Nothing>(postExecutorThread) {

    override fun buildUseCaseSingle(params: Nothing?): Single<User> {
        return repository.loginWithGoogle()
    }
}