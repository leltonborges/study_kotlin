package demo.main.functionScope

import demo.main.config.Autenticavel

fun main() {
    soma(1, 4) { total ->
        println("it#1: $total")
    }

    soma(1, 4, result = {
        println("it#2: $it")
    })

    somaReceiver(1, 4, result = {
        println("This#1: $this")
    })

    ////////////////////////////////////

    val autenticavel = object : Autenticavel {
        val senha = "123"
        override fun autentica(senha: String): Boolean = this.senha == senha;
    }

    val sistema = SistemaInterno()

    println("\n=============== #1")
    sistema.entra(autenticavel, "123"){
        println("#2 -> Teste pagamento")
    }
    println("\n=============== #2")
    sistema.entraReceiver(autenticavel, "123"){
        pagamento()
    }

}

fun somaReceiver(num1: Int, num2: Int, result: Int.() -> Unit) {
    val total = num1 + num2
    total.result()
}
