package demo.main;

import demo.main.config.Autenticavel
import demo.main.conta.CalculadoraBonificacao
import demo.main.conta.Conta
import demo.main.conta.ContaPoupanca
import demo.main.funcionario.Gerente
import demo.main.funcionario.TipoFuncionario

fun main() {
    var c1 = ContaPoupanca("Alex");
    val f1 = Gerente("José", "1334", 0.0, TipoFuncionario.GERENTE_PROJETO, "123");
    f1.salario = 1805.50;
    println("bonificação: ${f1.getBonificacao()}")

    val g1 = Gerente("Bia", "4322", 43000.00, TipoFuncionario.GERENTE, "231");
    println("bonificação: ${g1.getBonificacao()}")

    val ca1 = CalculadoraBonificacao()

    val fran = object :  Autenticavel {
        val name =  "Fran"
        val cpf = "5646"
        val senha = "215"

        override fun autentica(senha: String): Boolean  = this.senha == senha

    }

    val bob: Conta = ContaPoupanca("Bob")
    val lia: Conta = ContaPoupanca("lia")
    val bia: Conta = ContaPoupanca("bia")

    println("Nome client ${fran.name}")
    println("contas: ${Conta.total}")

}
