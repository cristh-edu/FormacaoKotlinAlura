class SistemaInterno {

    fun entra(funcionario: FuncionarioAdmin, senha:Int){
        if(funcionario.autentica(senha))
            println("Login feito com sucesso!")
        else
            println("Falha ao fazer Login!")
    }
}