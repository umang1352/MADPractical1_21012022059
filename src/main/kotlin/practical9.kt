fun findmax(a:Array<Int>){
    var max = a[0]
    var count = 0
    for (i in a) {
        println("ar[$count] = $i")
        if (i > max) {
            max = i
        }
        count++
    }
    println("largest number is:")
    println(max)
}
fun main()
{
    println("Vyas Umang_21012022059")
    var a = arrayOf(13, 10, 1352, 52, 85, 114)
    findmax(a)

}