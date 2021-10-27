package com.application.models

data class Vector(val x: Int, val y: Int) {

    operator fun plus(vector: Vector): Vector {
        return Vector(x = x + vector.x, y = y + vector.y)
    }

    operator fun minus(vector: Vector): Vector {
        return Vector(x = x - vector.x, y = y - vector.y)
    }
}

