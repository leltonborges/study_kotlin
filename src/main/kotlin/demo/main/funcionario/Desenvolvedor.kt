package demo.main.funcionario

class Desenvolvedor(
    name: String,
    cpf: String,
    salario: Double = 0.0,
    tipoFuncionario: TipoFuncionario = TipoFuncionario.DESENVOLVEDOR_MD,
    senha: String
) : Funcionario(name, cpf, salario, tipoFuncionario, senha) {

    override fun getBonificacao(): Double {
        return tipoFuncionario.salario(this.salario);
    }

}