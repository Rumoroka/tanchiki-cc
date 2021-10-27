package com.application.movement

import com.application.actions.movement.MovableAdapter
import com.application.actions.movement.Move
import com.application.models.Tank
import com.application.models.Vector
import org.junit.Test
import kotlin.test.assertEquals

class MovementTests {

    @Test
    fun oneStepTest() {

        val actualPosition = Vector(12,5)
        val expectedPosition = Vector(5,8)
        val velocity = Vector(-7,3)

        val tank = Tank()
        tank.setProperty("velocity",velocity)

        val movableTank = MovableAdapter(tank)
        movableTank.position = actualPosition

        val move = Move(movableTank)
        move.execute()

        assertEquals(expectedPosition,movableTank.position)
    }

    @Test
    fun severalStepsTest() {

        val actualPosition = Vector(12,5)
        val expectedPosition = Vector(-16,17)
        val velocity = Vector(-7,3)

        val tank = Tank()
        tank.setProperty("velocity",velocity)

        val movableTank = MovableAdapter(tank)
        movableTank.position = actualPosition

        val move = Move(movableTank)
        move.execute()
        move.execute()
        move.execute()
        move.execute()

        assertEquals(expectedPosition,movableTank.position)

    }
}