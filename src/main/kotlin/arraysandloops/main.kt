package arraysandloops

/*
     a % b należy do zbioru <0, b-1>
     7 = 2*3 + 1  //1 - reszta z dzielenia 7 przez 3 i przez 2
 */

/* Ta funkcja dla podanej liczby całkowitej zwraca ilość zer na końcu liczby */
// f(100) -> n = 1 k=2
fun numOfZero(arg : Int) : Int {
    var k = 0
    var n = arg
    while(n % 10 == 0) {
        n /= 10    //n = n / 10
        k++
    }
    return k
}

fun digitSum(arg : Int) : Int {
    var sum = 0
    var n = Math.abs(arg)
    while(n > 0) {
        sum += n % 10
        n /= 10
    }
    return sum
}

fun prepareSequence(n : Int) : Array<String?> {
    val array = arrayOfNulls<String>(n) //to nie jest immutable
    for(i in 0 .. n-1) {
        array[i] = "word" + i
    }
    return array
}

fun main(args : Array<String>) {

    //funkcje można zagnieżdżać
  /*  fun f() {
        fun g() {

        }
    } */

    if(!args.isEmpty()) {
        println(args[0])
    }

    for(i in 10 .. 20) {
        print("$i ")
    }
    println()
    for(i in 10 downTo 2 step 2)
        print("$i ")

    println()
    println(numOfZero(3221000));
    println(numOfZero(101));

    println(digitSum(-123))
    println(digitSum(10201))
    println(digitSum(7))

    val array1 = arrayOf(12, 31, 14, 51, 16, 71) //arrayOf zwraca nam immutable array (nie mozna dodac wartosci)

    var sum = 0
    for(v in array1) {
        sum += v
    }

    println(sum)

    //println(prepareSequence(15))
    for(v in prepareSequence(15)) {
        print(v + " ")
    }
}