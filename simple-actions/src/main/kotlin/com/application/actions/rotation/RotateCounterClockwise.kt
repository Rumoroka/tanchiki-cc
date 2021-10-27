package com.application.actions.rotation

import com.application.models.Vector

class RotateCounterClockwise: Orientation {
    override fun invoke(currentDirection: Vector): Vector {
        return applyRotation(direction = currentDirection)
    }

    private fun applyRotation(direction: Vector): Vector {
        return when {
            direction.x == 0 && direction.y == 1 -> Vector(x = 1, y = 0)
            direction.x == 0 && direction.y == -1 -> Vector(x = -1, y = 0)
            direction.x == 1 && direction.y == 0 -> Vector(x = 0, y = -1)
            direction.x == -1 && direction.y == 0 -> Vector(x = 0, y = 1)
            else -> throw Throwable()
        }
    }
}