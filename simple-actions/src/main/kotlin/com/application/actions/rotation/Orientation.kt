package com.application.actions.rotation

import com.application.models.Vector

fun interface Orientation {
    operator fun invoke(currentDirection: Vector): Vector
}
