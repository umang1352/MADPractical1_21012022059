fun main(){
    println("Enter a number")
    var x= readln()!! .toInt()
    println(if (x % 2 == 0)
        "number $x is even"
        else
    "number $x is odd")


    /*
    if (x % 2 == 0)
        println("Entered number $x is even")
    else
        println("Entered number $x is odd")
*/
}