@file:JvmName("JDoodle")
fun main() {
     print("Por favor, digite o primeiro número: ")
    val num1 = readln()!!.toInt()
    print("Por favor, digite o segundo número: ")
    val num2 = readln()!!.toInt()
    val soma = num1+num2
    println("A soma deu: $soma")
}