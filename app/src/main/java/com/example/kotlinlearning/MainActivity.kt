package com.example.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap
import kotlin.collections.HashSet

@ExperimentalStdlibApi
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println()

        var x = 5

        println(x)

        val name = 5.0
        var result = name * x

        println(result)

        val myInteger: Int = 10

        x.toString().capitalize(Locale.ROOT)

        val myArray = arrayOf("James", "Kirk", "Rob", "Lars")
        myArray.size

        val numberArray = arrayOf(1, 2, 3, 4, 5);
        println(numberArray[3])

        val doubleArray = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0)

        val mixedArray = arrayOf("Yaş", 20)

        val myMusicians = ArrayList<String>();
        myMusicians.add("Lars")
        myMusicians.add(1, "Kirk")

        var myExampleArray = arrayOf(1, 1, 2, 3, 4)
        println("element 1: ${myExampleArray[0]}")
        println("element 2: ${myExampleArray[1]}")

        val mySet = setOf<Int>(1, 1, 2, 3)

        mySet.forEach {
            println(it)
        }

        val myStringSet = HashSet<String>()
        myStringSet.add("Metin")
        myStringSet.add("Metin")
        println("size: " + myStringSet.size)

        val fruitCalorieMap = hashMapOf<String, Int>()
        fruitCalorieMap.put("Apple", 100)
        fruitCalorieMap.put("Banana", 200)

        println(fruitCalorieMap.get("Apple"))

        val myHashMap = HashMap<String, String>()
        myHashMap.put("Apple", "100")

        val newMap = hashMapOf<String, Int>("Apple" to 100, "Banana" to 200)
        println(newMap.get("Apple"))

        val day = 3
        var dayString = ""
        when (day) {
            1 -> dayString = "Monday"
            2 -> dayString = "Tuesday"
            3 -> dayString = "Wednesday"
            else -> dayString = ""
        }

        val myArrayNumbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)

        for (i in myArrayNumbers.indices){
            println(myArrayNumbers[i])
        }

        for (b in 0..9){
            println(b)
        }

        Functions()
    }
}
