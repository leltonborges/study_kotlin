package demo.main.config

interface Autenticavel {
    fun autentica(senha: String): Boolean;
}