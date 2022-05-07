package demo.main.funcionario

abstract class Funcionario(
    val name: String,
    val cpf: String,
    var salario: Double = 0.0,
    val tipoFuncionario: TipoFuncionario = TipoFuncionario.ESTAGIARIO
) {
    abstract fun getBonificacao(): Double;

    fun getSalarioTotal(): Double{
        return this.getBonificacao() + this.salario;
    }
}