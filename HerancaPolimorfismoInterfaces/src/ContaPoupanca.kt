class ContaPoupanca(
    titular: String,
    numero: Int
) : Conta(
    titular,
    numero
) {
    override fun saca(valor: Double){
        if (saldo >= valor) {
            saldo -= valor
        }
    }
}