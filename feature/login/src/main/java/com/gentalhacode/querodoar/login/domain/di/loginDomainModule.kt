package com.gentalhacode.querodoar.login.domain.di

import com.gentalhacode.querodoar.login.domain.interactor.LoginWithGoogleUseCase
import com.gentalhacode.querodoar.login.domain.interactor.LogoutUseCase
import org.koin.dsl.module

/**
 * .:.:.:. Created by @thgMatajs on 15/01/20 .:.:.:.
 */
val loginDomainModule = module {
    factory { LoginWithGoogleUseCase(get(), get()) }
    factory { LogoutUseCase(get(), get()) }
}