package demo.main.functional.higher.order

fun main() {
    val end1 = Endereco(logradouro = "Rua A", num = 23, uf = "DF")
    println("${end1.logradouro.uppercase()}, ${end1.uf.uppercase()}")

    val end1Up = end1.let { e ->
        "${end1.logradouro.uppercase()}, ${end1.uf.uppercase()}"
    }
    println(end1Up)

    println()
    end1.let { e ->
        "${e.logradouro.uppercase()}, ${e.uf.uppercase()}"
    }.let(::println)

    val enderecos = listOf(
        Endereco("Rua A", 23, "GO"),
        Endereco("Rua B", 1, "TO"),
        Endereco("Rua C", null, "AM"),
        Endereco("Rua D", 41, "GO"),
        Endereco("Rua E", null, "DF"),
    )

    enderecos.filter { e -> e.num != null }
        .let(::println)

}