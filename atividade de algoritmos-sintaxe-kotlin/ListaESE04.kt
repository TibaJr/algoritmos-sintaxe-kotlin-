@file:JvmName("JDoodle")
fun main(args: Array<String>) {
    var total: Int = 0
    for (x in 1..4){
        print("Digite a nota do bimestre $x :")
        var numero = readln()!!.toInt()
        total = (total + numero)
    }
    println("A média é: ${total /4}")
}
