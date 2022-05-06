package demo.main.domain

class Diretor(
    name: String,
    cpf: String,
    salario: Double = 0.0,
    tipoFuncionario: TypeEmploee = TypeEmploee.ESTAGIARIO
) : Funcionario(name, cpf, salario, tipoFuncionario) {

}