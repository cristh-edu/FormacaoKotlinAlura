class ContaCorrente(
    titular: String,
    numero: Int
) : Conta(
    titular,
    numero
) {
    override fun saca(valor: Double){
        val valorComTaxa = valor + 0.1
        if (saldo >= valorComTaxa) {
            saldo -= valorComTaxa
        }
    }
}