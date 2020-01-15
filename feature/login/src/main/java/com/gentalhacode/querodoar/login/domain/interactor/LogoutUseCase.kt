package com.gentalhacode.querodoar.login.domain.interactor

import com.gentalhacode.model.base.CompletableUseCase
import com.gentalhacode.model.base.PostExecutorThread
import com.gentalhacode.querodoar.login.domain.repository.LoginRepository
import io.reactivex.Completable

/**
 * .:.:.:. Created by @thgMatajs on 15/01/20 .:.:.:.
 */
class LogoutUseCase(
    private val repository: LoginRepository,
    postExecutorThread: PostExecutorThread
) : CompletableUseCase<Nothing>(postExecutorThread) {

    override fun buildUseCaseCompletable(params: Nothing?): Completable {
        return repository.logout()
    }
}