fun main() {
    println("Bem vindo ao Bytebank!\n")
    testaClasses()
}

class Conta(var titular: String, var numero: Int) {
    var saldo: Double = 0.0
        private set

    fun saca(valor: Double) {
        if (valor > 0) {
            if (saldo >= valor) {
                this.saldo -= valor
                println("Saque feito com sucesso!")
            } else println("Saldo insuficiente para saque!")
        } else println("Deposite um valor válido!")
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
            println("Deposito feito com sucesso!")
        } else println("Deposite um valor válido!")
    }

    fun transfere(valor: Double, destino: Conta) {
        if (valor > 0) {
            if (this.saldo >= valor) {
                this.saldo -= valor
                destino.deposita(valor)
                println("Transferência feita com sucesso!")
            } else println("Saldo insuficiente!")
        } else println("Transfira um valor válido!")
    }
}

//    Aula: Primeiros passos
fun testaPrimeirosPassos() {
    val titular: String = "Cristhian" // Val = constante
    val numeroConta: Int = 1000
    var saldo: Double = 0.0 // var = variavel

    saldo += 200
    saldo -= 10000

    println("Titular $titular")
    println("Número da Conta $numeroConta")
    println("Saldo da Conta $saldo")
    println()

}

//    Aula: Utilizando estruturas condicionais
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

//    Aula: Utilizando estrutura de repetição
fun testaRepeticao(saldo: Double) {
    for (i in 5 downTo 1 step 2) {
        println(i)
        if (i == 1) break
        else continue
    }
    var i = 1
    while (i < 5) {
        i++
        println(i)
    }
}

//    Aula: Criando Classes e objetos
fun testaClasses() {
    val c1 = Conta("Cristhian", 1520)
    c1.deposita(200.49)
    println(c1.titular)
    println(c1.numero)
    println(c1.saldo)
    c1.saca(100.0)

    val c2 = Conta("Eduardo", 250)
    c2.deposita(20.99)
    println(c2.titular)
    println(c2.numero)
    println(c2.saldo)
    c1.transfere(50.0, c2)
}