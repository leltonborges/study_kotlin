package demo.main

import demo.main.conta.Conta
import demo.main.conta.ContaPoupanca

fun main() {
    println("Hello");
    val titular = "Lelton";
    var nome: String = "José";

    nome = "Bob";
    val nomeSobrenome = lelton(nome);

    val accountNumber = 10023;
    val balance: Double = 100.0;
    coditionStructures(titular, nomeSobrenome, balance)
    repeatStructure()
    var c1 = ContaPoupanca("João", 2323, 4.2);
}

private fun repeatStructure() {

    // for with range
    for (i in 1..10) {
        println(i);
    }

    println("\nfor with step")
    // for with range step
    for (i in 1..10 step 2) {
        println(i);
    }

    println("\nfor with downTo 'Desc'")
    for (i in 10 downTo 0 step 3)
        println(i)

    println("\nfor with iterator")
    main@ for (i in 0..30){
        println(i)
        subloo@ for (j in 1..20) {
            if(i == 2 ) continue@main
            if(j == 2) continue@main
            if(i == 5) break@main
            println(j)
        }

    }
}

private fun coditionStructures(titular: String, nomeSobrenome: String, balanceAccount: Double) {

    println("Titular: $titular")
    println("Nome completo: $nomeSobrenome")

    var balance = balanceAccount;

    if (balance > 0.0) {
        println("Saldo positivo")
    } else if (balance.equals(0.0)) {
        println("Sem saldo")
    } else {
        println("Saldo da conta esta negativado")
    }

    balance -= balance;

    when {
        balance > 0.0 -> println("Saldo positivo")
        balance == 0.0 -> println("Sem saldo")
        else -> println("Saldo da conta esta negativado")
    }

    balance -= 312;

    when {
        balance > 0.0 -> println("Saldo positivo")
        balance == 0.0 -> println("Sem saldo")
        else -> println("Saldo da conta esta negativado")
    }
}

fun lelton(nome: String): String {
    return "$nome Borges";
}