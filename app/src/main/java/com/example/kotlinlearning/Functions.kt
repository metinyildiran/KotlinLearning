package com.example.kotlinlearning

class Functions() {

    init {  //constructor
        println(mySum(10, 15))
        val homer = Simpson("Homer", 50, "Nuclear")
        println(homer.age)

        val myString: String? = null
        println(myString)

        val myInt: Int? = null
        println(myInt?.times(10))
    }

    private fun mySum(a: Int, b: Int): Int {
        return a + b
    }

}