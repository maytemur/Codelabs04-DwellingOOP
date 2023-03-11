package com.maytemur.dwellingoopcodelabsbasicandroidkotlin

import kotlin.math.PI

class RoundTower(residents: Int, val floors: Int=2,radius:Double) : RoundHut(residents,radius) {
    override val buildingMaterial: String
        get() = "Stone"
    override val capacity: Int
        get() = 4*floors

    override fun floorAlani(): Double {
        return PI*radius*radius*floors
    }

}