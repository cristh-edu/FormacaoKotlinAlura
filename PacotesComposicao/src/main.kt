import modelo.Cliente
import teste.testaAutenticacao
import novoModelo.Cliente as NovoCliente

fun main() {
    testaAutenticacao() // ctrl + alt + o ----> remover imports desnessários

    val antCliente = Cliente("Cristhian", "111.111.111.00", 1234)
//    val novCliente = novoModelo.Cliente()
    val novCliente = NovoCliente()
}