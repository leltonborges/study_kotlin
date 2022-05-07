package demo.main.funcionario

class Diretor(
    name: String,
    cpf: String,
    salario: Double = 0.0,
    tipoFuncionario: TipoFuncionario = TipoFuncionario.ESTAGIARIO
) : Funcionario(name, cpf, salario, tipoFuncionario) {

    override fun getBonificacao(): Double {
        return tipoFuncionario.salario(this.salario);
    }

}