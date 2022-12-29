fun main() {
    println("Bem vindo ao Bytebank")

    val alex = Funcionario(
        nome = "Cristhian",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("Nome ${alex.nome}")
    println("CPF ${alex.cpf}")
    println("Salario ${alex.salario}")
    println("Bonificação ${alex.bonificacao()}")
}