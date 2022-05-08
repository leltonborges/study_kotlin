package demo.main.funcionario

import demo.main.config.Autenticavel

abstract class Funcionario(
    val name: String,
    val cpf: String,
    var salario: Double = 0.0,
    val tipoFuncionario: TipoFuncionario = TipoFuncionario.ESTAGIARIO
) : Autenticavel {
    abstract fun getBonificacao(): Double;

    fun getSalarioTotal(): Double {
        return this.getBonificacao() + this.salario;
    }

    override fun autentica(senha: String): Boolean {
        if (this.senha.equals(senha)) {
            return true;
        }
        return false;
    }
}