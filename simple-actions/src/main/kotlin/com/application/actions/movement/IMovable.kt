package com.application.actions.movement

import com.application.models.Vector

interface IMovable {
    var position: Vector
    val velocity: Vector
}
