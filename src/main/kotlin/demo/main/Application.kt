package demo.main

fun main(){
    println("Hello");
    val titular = "Lelton";
    var nome: String = "José";

    nome = "Bob";
    val nomeSobrenome = lelton(nome);

    val accountNumber = 10023;
    var balance: Double = 100.0;
    coditionStructures(titular, nomeSobrenome, balance)
}

private fun coditionStructures(titular: String, nomeSobrenome: String, balanceAccount: Double ) {

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

fun lelton(nome:String): String{
    return "$nome Borges";
}