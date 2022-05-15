package demo.main.functionScope

fun main() {
    val minhaFuncao: () -> Unit = ::test

    println(minhaFuncao())

    val minhaClasse: (Int, Int) -> Unit = Teste()
    println(minhaClasse(2,3))

    /////////////////////////////////////////////////

    val myFunctionLambda1: () -> Unit = { // Lambda expression
        println("Executa com um lambda")
    }

    println(myFunctionLambda1) // só mostra a funcao
    println(myFunctionLambda1()) // Execulta

    /////////////////////////////////////////////////
    println()

    val myFunctionLambda2: () -> Unit = fun() { // Função anonimas
        println("Executa com um lambda")
    }

    println(myFunctionLambda2) // só mostra a funcao
    println(myFunctionLambda2()) // Execulta
}

fun test(){
    println("Executa test")
}
