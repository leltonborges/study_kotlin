package demo.main.functionScope

import demo.main.config.Autenticavel

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: String, autenticavel: () -> Unit = {}) {
        if (admin.autentica(senha)) {
            println("Sucesso")
            autenticavel()
        } else {
            println("Falha de autenticação")
        }
    }

    fun entraReceiver(admin: Autenticavel, senha: String, autenticando: SistemaInterno.() -> Unit = {}) {
        if (admin.autentica(senha)) {
            println("Sucesso")
            autenticando(this) // mesma coisa do de baixo
//            autenticando() // mesma coisa do de cima
        } else {
            println("Falha de autenticação")
        }
    }

    fun pagamento(){
        println("#1 -> Teste pagamento")
    }
}