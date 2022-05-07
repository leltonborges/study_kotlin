package demo.main;

import demo.main.conta.CalculadoraBonificacao
import demo.main.conta.ContaPoupanca
import demo.main.funcionario.Gerente
import demo.main.funcionario.TipoFuncionario

fun main() {
    var c1 = ContaPoupanca("Alex");
    val f1 = Gerente("José", "1334", 0.0, TipoFuncionario.GERENTE_PROJETO);
    f1.salario = 1805.50;
    println("bonificação: ${f1.getBonificacao()}")

    val g1 = Gerente("Bia", "4322", 43000.00, TipoFuncionario.GERENTE);
    println("bonificação: ${g1.getBonificacao()}")

    val ca1 = CalculadoraBonificacao()

}