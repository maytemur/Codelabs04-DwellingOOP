package com.maytemur.dwellingoopcodelabsbasicandroidkotlin

import kotlin.math.PI
import kotlin.math.sqrt

open class RoundHut(residents: Int,val radius:Double) :Dwelling(residents) {
    //başındaki open bu class'ı yeniden abstract yapılabilir hale getirir yoksa normalde
    //final class default olarak ve abstract yapılamaz bu şekilde yaparak RoundTower'ın bundan
    //türemesini sağladık
    override val buildingMaterial: String
        get() = "Straw"
    override val capacity: Int
        get() = 4

    override fun floorAlani(): Double {
        return PI*radius*radius
    }
    fun calculateMaxCarpetSize(): Double {
        val diameter= 2* radius
        return sqrt(diameter*diameter/2)
    }
}
