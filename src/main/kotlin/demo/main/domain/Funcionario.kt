package demo.main.domain

open class Funcionario(
    val name: String,
    val cpf: String,
    var salario: Double = 0.0,
    val tipoFuncionario: TypeEmploee = TypeEmploee.ESTAGIARIO
) {

    fun bonificacao(): Double {
        return this.tipoFuncionario.salario(this.salario);
    }
}