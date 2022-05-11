package demo.main.list

fun main() {
    val livrosComNulos = getLivrosComNulos()

    livrosComNulos.imprime()

    val livros = getLivros()
    livros.groupBy { it.editora }
        .forEach { (editora: String?, livros: List<Livro>)
            -> println("$editora: ${livros.joinToString { it.titulo }}")
        }

    println()

    livros.groupBy { it.editora ?: "Sem editora" }
        .forEach{(editora, livros)
            -> println("$editora: ${livros.joinToString { it.titulo }}")
        }
}