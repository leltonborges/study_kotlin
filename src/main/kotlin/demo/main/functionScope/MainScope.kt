package demo.main.functionScope

import demo.main.functionScope.higher.order.Endereco

fun main() {
    val end1 = Endereco(logradouro = "Rua A Acular", num = 23, uf = "DF")
    val end2 = Endereco(logradouro = "Rua A Acular", num = 23, uf = "DF")

    end1.apply {
        logradouro = this.logradouro.uppercase();
    }.let(::println)

    println()

    end2.run {
        "$logradouro, $num".uppercase()
    }.let(::println)
}