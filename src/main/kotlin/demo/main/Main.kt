package demo.main;

import demo.main.domain.Conta
import demo.main.domain.Funcionario
import demo.main.domain.Gerente
import demo.main.domain.TypeEmploee

fun main() {
    var c1 = Conta("Alex");
    var f1 = Funcionario("José", "1334");
    f1.salario = 1805.50;
    println("bonificação: ${f1.getBonificacao()}")

    var g1 = Gerente("Bia", "4322", 43000.00, TypeEmploee.GERENTE);
    println("bonificação: ${g1.getBonificacao()}")

}