package com.application.models

interface UObject {
    fun <T> getProperty(key: Any): T
    fun <T> setProperty(key: Any, value: T)
}
