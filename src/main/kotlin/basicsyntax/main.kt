package basicsyntax

import kotlin.math.PI

fun main() {
    //typy, var i val

    var number : Int = 1
    number = 2
    print(number)

    val name = "Ala"
    //name = "Kasia"

    //Zadanie 0 - wspomagając się Kotlinem, oblicz w zmiennej wartość wyrażenia 2 + 4 + 6 + .. + 96 + 98 + 100 i wypisz na ekranie wynik
    //Oczywiście nie należy użyć pętli
    val result = 25 * 102
    println(result)

    var value : Double = 28.0
    value *= PI
    println(String.format("%.4f", value))
    println(value.div(2.0).plus(0.03))

    val num2 = -0.000122
    var x = 10.01f
    var y = 0.0
    y = x.toDouble()
    val num3 = 1_000_000L

    if(num3 is Number) {
        println("$num3 is number")
    }

    val v1 = 'A'
    val v2 = 'B'

    println("v1 hashcode = ${v1.hashCode()} v2 hashcode = ${v2.hashCode()}")
    println(v1 === v2)  //za pomoca === porownujemy referencje
    println(v1 == v2)  //za pomoca == porownuje sie wartosci
    println(v1.equals(v2))
    println(v1.compareTo(v2))

    //String, Int, Double, Char, Float
    var num5 = -99.99
    var num6 = -99.99   //ze wzgledow optymalizacyjnych nie powstanie kopia wartosci (ktora juz istnieje w pamieci) tylko num6 bedzie referencja
    //na wartosc na ktora referuje num5
    println(num5 === num6)

    var v3 = "abc"
    var v4 = "abc"

    v4 += ""
    println(v3 !== v4)

    val result2 = (true || 2 < 1) && ("word".length == 5) && (false != !true)
    println(result2)

    var cityName : String = "Krakow"
    println(cityName[cityName.length - 1])
    var xy : Int = 12
//    xy = null  //w Kotlinie, domyslnie ze wzgledow bezpieczenstwa nie moge podstawic null

    var lastName : String? = "Bartnicki"  // ? poznawa podstawic null
    lastName = null
    println(lastName?.length)
    println("hello")

}