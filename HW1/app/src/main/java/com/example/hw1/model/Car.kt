package com.example.hw1.model

import com.example.hw1.utilities.Constants


class Car(var row: Int, var column: Int) {
    var lives: Int = 3




    fun loseLife() {
        if (lives > 0) {
            lives--
        }
    }

    fun isAlive(): Boolean {
        return lives > 0
    }
    fun moveLeft() {
        if (column > -1) {
            column--
        }  }

    fun moveRight() {
        if (column < Constants.COLUMNS - 1) {
            column++
        }  }
    fun reset() {

        lives = 3

    }
}
