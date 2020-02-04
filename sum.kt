fun sum(a: Int,b: Int): Int{
    return a+b
}

fun main(){
    println("Enter 1st Number = ")
    var first = readLine()
    val mfirst: Int = first!!.toInt()
    println("Enter 2nd Number = ")
    var second = readLine()
    val msecond: Int = second!!.toInt()
    println(sum(mfirst,msecond)))
}
