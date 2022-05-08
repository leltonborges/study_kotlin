package demo.main.config

interface Autenticavel {
    val senha: String

    fun autentica(senha: String): Boolean{
        if (this.senha.equals(senha)){
            return true;
        }
            return false;
    }
}