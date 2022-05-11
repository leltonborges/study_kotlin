package demo.main.list

fun main() {
    val prateleira = Prateleira(genereo = "Literetura", livros = getLivros())
    println("Organizar por Autor")
    println("-><--><--><--><--><--><--><--><-")
    val organizarPorAutor = prateleira.organizarPorAutor()

    println("\nOrganizar por Ano Publicação")
    println("-><--><--><--><--><--><--><--><-")
    val organizarPorAnoPublicacao = prateleira.organizarPorAnoPublicacao()

    organizarPorAutor.imprime()
    println("\n---------------\n")
    organizarPorAnoPublicacao.imprime()
}