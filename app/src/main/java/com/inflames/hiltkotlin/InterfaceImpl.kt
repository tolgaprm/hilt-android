package com.inflames.hiltkotlin

import javax.inject.Inject

class InterfaceImpl @Inject constructor() : MyInterface {

    override fun myPrintFunction(): String {
        return "My Interface Implementor"
    }

}