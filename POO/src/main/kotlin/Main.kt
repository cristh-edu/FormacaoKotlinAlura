fun main() {
    println("Bem vindo ao Bytebank!\n")

    val titular: String = "Cristhian" // Val = constante
    val numeroConta: Int = 1000
    var saldo: Double = 0.0 // var = variavel

    saldo += 200
    saldo -= 10000

    println("Titular $titular")
    println("Número da Conta $numeroConta")
    println("Saldo da Conta $saldo")
    println()

//    Aula: Utilizando estruturas condicionais
//    testaCondicoes(saldo)

//    Aula: Utilizando estrutura de repetição
//    testaRepeticao(saldo)
}

fun testaCondicoes(saldo: Double) {
    println("Testando Condições")

//    if (saldo > 0.0)
//        println("Conta é positiva")
//    else if (saldo == 0.0)
//        println("Conta é neutra")
//    else
//        println("Conta é negativa")

    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }

    println()
}

fun testaRepeticao(saldo: Double) {
    for (i in 5 downTo 1 step 2) {
        println(i)
        if(i == 1) break
        else continue
    }
    var i = 1
    while (i<5){
        i++
        println(i)
    }
}