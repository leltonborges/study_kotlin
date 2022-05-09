package demo.main.funcionario

import demo.main.config.Autenticavel

class Diretor(
    name: String,
    cpf: String,
    salario: Double = 0.0,
    tipoFuncionario: TipoFuncionario = TipoFuncionario.DIRETOR, senha: String,
) : FuncionarioAdmin(name, cpf, salario, tipoFuncionario, senha) , Autenticavel{

    override fun getBonificacao(): Double {
        return tipoFuncionario.salario(this.salario);
    }


}