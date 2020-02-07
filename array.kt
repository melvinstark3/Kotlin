fun main(args: Array<String>)
{
    var students= arrayOf("Mike","Cody","Jimmy")
    var counter = 0
    println("Total number of students are "+students.size)
    println("Name of students are : ")
    //1st loop with be executed without checking any condition
    do {
        println(students[counter])
        counter++
    }
    while(counter < students.size)
}
