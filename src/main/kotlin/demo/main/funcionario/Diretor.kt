package demo.main.funcionario

import demo.main.config.Autenticavel

class Diretor(
    name: String,
    cpf: String,
    salario: Double = 0.0,
    tipoFuncionario: TipoFuncionario = TipoFuncionario.DIRETOR,
    override val senha: String
) : FuncionarioAdmin(name, cpf, salario, tipoFuncionario) , Autenticavel{

    override fun getBonificacao(): Double {
        return tipoFuncionario.salario(this.salario);
    }

    override fun autentica(senha: String): Boolean {
        return super<FuncionarioAdmin>.autentica(senha)
    }
}