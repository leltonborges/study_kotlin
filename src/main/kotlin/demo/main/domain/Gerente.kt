package demo.main.domain

class Gerente(
    name: String,
    cpf: String,
    salario: Double = 0.0,
    tipoFuncionario: TypeEmploee = TypeEmploee.ESTAGIARIO
) : Funcionario(name, cpf, salario, tipoFuncionario) {

    override fun getBonificacao(): Double {
        return this.tipoFuncionario.salario(this.salario)
    }
}