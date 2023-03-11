package com.maytemur.dwellingoopcodelabsbasicandroidkotlin

abstract class Dwelling(private var residents: Int) {
    abstract val buildingMaterial: String
    abstract val capacity: Int
    fun hasRoom(): Boolean {
        return residents < capacity
    }

    abstract fun floorAlani(): Double

    fun getRoom() {
        if (capacity > residents) {
            residents++
            println("You got a room!")

        } else {
            println("Sorry , at capacity and no rooms left.")
        }
    }
}
