package demo.main.list

fun main() {
    val livros = getLivros();

    println()
    livros.imprime()

    println()
    val livrosOrdenadoPorAno = livros.sorted()
    livrosOrdenadoPorAno.imprime()

    println()
    val livrosOrdenadoPorTitulo = livros.sortedBy { it.titulo }
    livrosOrdenadoPorTitulo.imprime()

    println()
    val livrosOrdenadoPorAutor = livros.sortedBy { it.autor }
    livrosOrdenadoPorAutor.imprime()

    println("\nListas filter")
    println("==============")

    println()
    livros.filter { it.autor.equals("José de Alencar") }
        .imprime()

    println("\nStartsWith")
    livros.filter { it.titulo.startsWith("Pix") }.imprime()

    println("\nMap filter contains")
    livros.filter { it.titulo.contains("Test", true) }
        .map { it.titulo }
        .forEach{ println(it) }
}
