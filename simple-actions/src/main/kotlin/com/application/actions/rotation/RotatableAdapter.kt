package com.application.actions.rotation

import com.application.models.UObject
import com.application.models.Vector

class RotatableAdapter(
    private val obj: UObject
): IRotatable {
    override var direction: Vector
        get() = obj.getProperty("position") as Vector
        set(value) = obj.setProperty("position", value)
}