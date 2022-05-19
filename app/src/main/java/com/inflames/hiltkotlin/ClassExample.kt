package com.inflames.hiltkotlin

import javax.inject.Inject

class ClassExample @Inject constructor(
    @FirstImplementor
    private val myInterfaceImpl: MyInterface,
    @SecondImplementor
    private val mySecondInterfaceImplementor: MyInterface
) {

    fun myFunction(): String {
        return "Working: ${myInterfaceImpl.myPrintFunction()}"
    }

    fun mySecondFun(): String {
        return "Working: ${mySecondInterfaceImplementor.myPrintFunction()}"
    }
}