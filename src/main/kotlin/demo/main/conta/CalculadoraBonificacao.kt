package demo.main.conta

import demo.main.funcionario.Funcionario

class CalculadoraBonificacao {
    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.getBonificacao()
    }
}