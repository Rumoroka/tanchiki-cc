package com.application.actions.movement

import com.application.models.Command

class Move(
    private val movable: IMovable
): Command {
    override fun execute() {
        movable.position += movable.velocity
    }
}
