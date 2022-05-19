package com.inflames.hiltkotlin

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import javax.inject.Singleton

interface MyInterface {

    fun myPrintFunction(): String
}

/* Yöntem 1
@InstallIn(ActivityComponent::class)
@Module
abstract class MyModule {
    @ActivityScoped
    @Binds
    abstract fun bindingFunction(myImplementer: InterfaceImpl): MyInterface
}*/

@InstallIn(SingletonComponent::class)
@Module
class MyModule {

    @FirstImplementor
    @Singleton
    @Provides
    fun providerFunction(): MyInterface {
        return InterfaceImpl()
    }

    @SecondImplementor
    @Singleton
    @Provides
    fun secondProviderFunction(): MyInterface {
        return SecondInterfaceImplementor()
    }
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FirstImplementor()


@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class SecondImplementor()