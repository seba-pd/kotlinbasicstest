package controlsatements

import kotlin.math.max
import kotlin.random.Random

fun main() {
//    val stringInput = readLine()!!
//    print(stringInput)
//    val inputStringSize = stringInput.length
//    val result = if(inputStringSize % 2 == 0) inputStringSize + 1 else inputStringSize + 2
//    println(result)

    //when
    val temperature = Random.nextInt(0, 30)
    when {
        temperature < 10 -> println("Low")
        temperature in 10..20 -> println("Medium")
        temperature > 20 -> println("High")
    }

    val name: String = "Marysia"
    var invited: Boolean?
    when (name) {
        "Kasia" -> invited = true
        "Basia" -> invited = false
        "Marysia" -> invited = true
        else -> invited = null
    }

    println(invited)

    val num: Int = 2
    val res = when (num) {
        1 -> "one"
        2 -> "two"
        3 -> "three"
        else -> "uknown"
    }

    //when też często służy do obsługi wyjątków

    println(res)

    val array = arrayOf(150, -51, 24, 250, 105)

    fun maxModuloFive(array: Array<Int>): Int? {
        if (array.isEmpty()) {
            return null
        }
        var maximum: Int? = null
        for (v in array) {
            if (v % 5 == 0) {
                if (maximum == null || v > maximum) {
                    maximum = v
                }
            }
        }
        return maximum
    }

    val mutableList = mutableListOf(1.0, -009.0)

    mutableList.set(1, 3.0)
    println(maxModuloFive(array))

    var immutableList = listOf("abcde", "abc", "xyzv")

    val resultlist = immutableList.filter { it.length >= 4 }.map { it.reversed() }.reversed()
    val result1: Int = array.filter { it % 5 == 0 }.fold(0){acc, d -> max(acc,d) }

    println(result1)

    fun concat(list : List<String>, a : Int, b : Int ) : String? {
     return list.filter { it.length in a until (b+1) }.reduceOrNull{ acc, sum -> acc.plus(sum) }
    }

    println(concat(immutableList, 2, 2))

}
