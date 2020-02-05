import java.util.Scanner

fun sum(a:Int,b:Int):Int{
    return(a+b)
}
fun main(args: Array<String>){
    println("Enter 1st Number = ")
    var foo = Scanner(System.`in`)
    var first = foo.nextInt()
    println("Enter 2nd Number = ")
    var second = foo.nextInt()
    println("Sum is "+sum(first,second))
}
