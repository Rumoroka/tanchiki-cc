package com.application.models

class Tank(): UObject {
    var key: String? = null
    var value: Any? = null

    private var property: HashMap<String, Any> = hashMapOf()

    override fun getProperty(key: String): Any = property[key]!!

    override fun setProperty(key: String, value: Any) {
        property[key] = value
    }
}