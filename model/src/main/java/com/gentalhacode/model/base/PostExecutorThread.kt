package com.gentalhacode.model.base

import io.reactivex.Scheduler

/**
 * .:.:.:. Created by @thgMatajs on 14/01/20 .:.:.:.
 */
interface PostExecutorThread {
    val scheduler: Scheduler
}