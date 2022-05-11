package demo.main.list

fun getLivros(): List<Livro> {
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val livro5 = Livro(
        titulo = "Test A",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val livro6 = Livro(
        titulo = "Pix TED Test",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val livro7 = Livro(
        titulo = "Test Abc",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val livro8 = Livro(
        titulo = "Pix TED TEST",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val livros: MutableList<Livro> =
        mutableListOf(
            livro1,
            livro2,
            livro3,
            livro4,
            livro5,
            livro6,
            livro7,
            livro8,
            livro1,
            livro2,
            livro3,
            livro4,
            livro5,
            livro6,
            livro7,
            livro8,
            livro1,
            livro2,
            livro3,
            livro4,
            livro5,
            livro6,
            livro7,
            livro8
        )
    livros.add(Livro("Sagarana", "João Guimarẽs Rosa", 1946))

    return livros;
}

fun getLivrosComNulos(): List<Livro?> {
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val livro5 = Livro(
        titulo = "Test A",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val livro6 = Livro(
        titulo = "Pix TED Test",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val livro7 = Livro(
        titulo = "Test Abc",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val livro8 = Livro(
        titulo = "Pix TED TEST",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val livros: MutableList<Livro?> =
        mutableListOf(
            livro1,
            livro2,
            livro3,
            null,
            livro4,
            livro5,
            null,
            livro6,
            livro7,
            livro8,
            null,
            livro1,
            null,
            livro2,
            livro3,
            null,
            livro4,
            livro5,
            livro6,
            null,
            livro7,
            livro8,
            livro1,
            livro2,
            livro3,
            livro4,
            livro5,
            livro6,
            livro7,
            null,
            livro8
        )
    livros.add(Livro("Sagarana", "João Guimarẽs Rosa", 1946))

    return livros;
}


fun List<Livro?>.imprime() {
    val joinToString = this.filterNotNull()
        .joinToString(separator = "\n") { l: Livro -> "- ${l.titulo} de ${l.autor}" }
    println(joinToString)
}