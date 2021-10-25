package com.application.actions.rotation

import com.application.models.Command

class Rotate(
    private val rotatable: IRotatable,
    private val rotateStrategy: Orientation
) : Command {
    override fun execute(){
        val currentDirection = rotatable.direction
        val newDirection = rotateStrategy(currentDirection = currentDirection)
        rotatable.direction = newDirection
    }
}
