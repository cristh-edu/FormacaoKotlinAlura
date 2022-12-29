abstract class FuncionarioAdmin(
     nome: String,
     cpf: String,
     salario: Double,
     val senha: Int
): Funcionario(nome, cpf, salario) {
    fun autentica(senha: Int): Boolean {
        return (senha == this.senha)
    }
}