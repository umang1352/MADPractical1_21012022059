fun main(){
    println("Vyas Umang_21012022059")
    add(111, 2222, -222)
    sub(111, 2222, -222)
    mul(111, 2222, -222)
    div(2222,111)
    mod(2222,111)
}
fun add(a:Int, b:Int, c:Int){
    println("Addition of number $a, $b, $c is ${a + b + c}")
}
fun sub(a:Int, b:Int, c:Int){
    println("Subtraction of number $a, $b, $c is ${a - b - c}")
}
fun mul(a:Int, b:Int, c:Int){
    println("Multiplication of number $a, $b, $c is ${a * b * c}")
}
fun div(a:Int, b:Int){
    println("Division of number $a, $b is ${a / b}")
}
fun mod(a:Int, b:Int){
    println("Modulus of $a, $b is ${a % b}")
}