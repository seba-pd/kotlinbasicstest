package arraysandloops

/* Ta funkcja dla podanej jliczby całkowitej  */
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

fun main(args : Array<String>) {

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
}