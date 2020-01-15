package com.gentalhacode.querodoar.login.data.di

import com.gentalhacode.querodoar.login.data.impl.LoginRepositoryImplementation
import com.gentalhacode.querodoar.login.data.source.LoginDataFactory
import com.gentalhacode.querodoar.login.data.source.LoginFireBaseDataSource
import com.gentalhacode.querodoar.login.domain.repository.LoginRepository
import org.koin.dsl.module

/**
 * .:.:.:. Created by @thgMatajs on 15/01/20 .:.:.:.
 */
val loginDataModule = module {
    factory<LoginRepository> { LoginRepositoryImplementation(get()) }
    factory { LoginDataFactory(get()) }
    factory { LoginFireBaseDataSource(get()) }
}