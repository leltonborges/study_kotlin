package demo.main.funcionario

import demo.main.config.Autenticavel

abstract class FuncionarioAdmin(
    name: String,
    cpf: String,
    salario: Double = 0.0,
    tipoFuncionario: TipoFuncionario = TipoFuncionario.ESTAGIARIO
) : Funcionario(name, cpf, salario, tipoFuncionario) , Autenticavel{

    override fun autentica(senha: String): Boolean {
        if (this.senha.equals(senha)) {
            return true;
        }
        return false;
    }
}