package demo.main.functionScope

import demo.main.conta.ContaPoupanca

fun main() {
    val taxaAnual = 0.07
    val taxaMesal = taxaAnual / 12;

    val conta = ContaPoupanca("Alex")


    conta.run {
        depositar(1000.0)
        getBalanceAccount * taxaMesal
    }.let(::println)

    val redimento = run {
        var saldo = conta.getBalanceAccount
        repeat(12) { index ->
            saldo += saldo * taxaMesal
        }
        saldo
    }

    println("Redimento: $redimento")
}