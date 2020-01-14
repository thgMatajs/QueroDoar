package com.gentalhacode.model.base

import io.reactivex.Flowable
import io.reactivex.schedulers.Schedulers

/**
 * .:.:.:. Created by @thgMatajs on 14/01/20 .:.:.:.
 */
abstract class FlowableUseCase<T, in Params> constructor(
    private val postExecutorThread: PostExecutorThread
) : BaseUseCase() {

    abstract fun buildUseCaseFlowable(params: Params? = null): Flowable<T>

    fun execute(
        params: Params? = null,
        onNext: (T) -> Unit,
        onError: (e: Throwable) -> Unit,
        onComplete: (() -> Unit)? = null
    ) {
        val flowable = this.buildUseCaseFlowable(params)
            .subscribeOn(Schedulers.io())
            .observeOn(postExecutorThread.scheduler)
        addDisposable(
            flowable.subscribe(
                { t: T ->
                    onNext.invoke(t)
                },
                { error ->
                    onError.invoke(error)
                },
                {
                    onComplete?.invoke()
                })
        )
    }
}