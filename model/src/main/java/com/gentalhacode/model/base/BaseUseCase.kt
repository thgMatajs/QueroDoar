package com.gentalhacode.model.base

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

/**
 * .:.:.:. Created by @thgMatajs on 14/01/20 .:.:.:.
 */
abstract class BaseUseCase {

    private val disposables = CompositeDisposable()

    protected fun addDisposable(disposable: Disposable) {
        disposables.add(disposable)
    }

    fun dispose() = disposables.clear()
}