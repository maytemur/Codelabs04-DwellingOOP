package com.maytemur.dwellingoopcodelabsbasicandroidkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.maytemur.dwellingoopcodelabsbasicandroidkotlin.R

class MainActivity : AppCompatActivity() {override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val squareCabin= SquareCabin(5,50.0)
        println("\nSquare Cabin\n")
//        println("Capacity: ${squareCabin.capacity}")
//        println("Material: ${squareCabin.buildingMaterial}")
//        println("Has Room? ${squareCabin.hasRoom()}")
        with(squareCabin){
            println("Capacity: ${capacity}")
            println("Material: ${buildingMaterial}")
            println("Has Room? ${hasRoom()}")
            println("Floor area: ${(floorAlani())}")
        }
        val roundHut= RoundHut(3,16.0)

        with(roundHut){
            println("****\nRound Hut\n****")
            println("Capacity: ${capacity}")
            println("Material: ${buildingMaterial}")
            println("Has Room? ${hasRoom()}")
            println("Floor area: ${(floorAlani())}")
            println("Has room? ${hasRoom()}")
            getRoom()
            println("Has room? ${hasRoom()}")
            getRoom()
            println("Carpet size: ${calculateMaxCarpetSize()}")
        }

        val roundTower= RoundTower(4,3,15.5)
        with(roundTower){
            println("****\nRound Hut\n****")
            println("Capacity: ${capacity}")
            println("Material: ${buildingMaterial}")
            println("Has Room? ${hasRoom()}")
            println("Floor area: ${(floorAlani())}")
            println("Carpet size: ${calculateMaxCarpetSize()}")
        }


    }
}