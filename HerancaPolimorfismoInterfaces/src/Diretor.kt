class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int,
    val plr: Double
) : Funcionario(nome, cpf, salario) {
    fun autentica(senha: Int): Boolean {
        return (senha == this.senha)
    }

    override val bonificacao: Double get() = super.bonificacao + plr + salario
}