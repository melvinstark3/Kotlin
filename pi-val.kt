val PI = 3.14 //defined var
var x = 0 //defined a var 'x'

//Increment function with Unit(Omitted) return type
fun incrementX() {
    x += 1
}

fun main() {
    println("x = $x; PI = $PI") //default values
    incrementX() //function call
    println("x = $x; PI = $PI") //new values
}
