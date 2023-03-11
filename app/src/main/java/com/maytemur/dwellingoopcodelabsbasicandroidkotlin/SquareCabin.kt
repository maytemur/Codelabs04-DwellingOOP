package com.maytemur.dwellingoopcodelabsbasicandroidkotlin

class SquareCabin(residents:Int,val uzunluk:Double) : Dwelling(residents) {
    override val buildingMaterial="Wood"
    override val capacity=6
    override fun floorAlani(): Double {
        return uzunluk*uzunluk
    }
}