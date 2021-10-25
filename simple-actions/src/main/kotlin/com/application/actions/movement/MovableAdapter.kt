package com.application.actions.movement

import com.application.models.UObject
import com.application.models.Vector

class MovableAdapter(
    private val obj: UObject
) : IMovable {
    override var position: Vector
        get() = obj.getProperty("position")
        set(value) = obj.setProperty("position", value)
    override val velocity: Vector = obj.getProperty("velocity")
}

