fun main() {
    println("Bem vindo ao Bytebank!\n")

}

class Conta{
    private var titular: String = ""
    private var numeroConta: Int = 0
    private var saldo: Double = 0.0

    fun getTitular(): String {
        return titular
    }

    fun getNumeroConta(): Int {
        return numeroConta
    }

    fun getSaldo(): Double {
        return saldo
    }

    fun setSaldo(saldo: Double){
        this.saldo = saldo;
    }

    constructor(titular:String , numeroConta: Int){
        this.titular = titular;
        this.numeroConta = numeroConta;
    }

    fun saca(valor: Double){
        if(valor> 0) {
            if(saldo >= valor) {
                this.saldo -= valor
                println("Saque feito com sucesso!")
            }else  println("Saldo insuficiente para saque!")
        }else println("Deposite um valor válido!")
    }

    fun deposita(valor: Double){
        if(valor> 0) {
            this.saldo += valor
            println("Deposito feito com sucesso!")
        }else println("Deposite um valor válido!")
    }

    fun transfere(valor: Double, destino: Conta){
        if(valor >0){
            if(this.saldo >= valor){
                this.saldo -= valor
                destino.deposita(valor)
                println("Transferência feita com sucesso!")
            }else println("Saldo insuficiente!")
        }else println("Transfira um valor válido!")
    }
}
//    Aula: Primeiros passos
fun testaPrimeirosPassos(){
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
        if(i == 1) break
        else continue
    }
    var i = 1
    while (i<5){
        i++
        println(i)
    }
}

//    Aula: Criando Classes e objetos
fun testaClasses(){
    val c1 = Conta("Cristhian", 1520)
    c1.setSaldo(200.49)
    println(c1.getTitular())
    println(c1.getNumeroConta())
    println(c1.getSaldo())

    val c2 = Conta("Eduardo",250)
    c2.setSaldo(-20.99)
    println(c2.getTitular())
    println(c2.getTitular())
    println(c2.getSaldo())
}