package demo.main

fun main(){
    println("Hello");
    val titular = "Lelton";
    var nome: String = "José";

    nome = "Bob";
    val nomeSobrenome = lelton(nome);

    val accountNumber = 10023;
    var balance: Double = 100.0;
    balance += 1;

    println("Titular: $titular")
    println("Nome completo: $nomeSobrenome")
}

fun lelton(nome:String): String{
    return "$nome Borges";
}