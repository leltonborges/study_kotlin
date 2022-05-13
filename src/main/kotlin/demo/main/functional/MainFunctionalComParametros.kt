package demo.main.functional

fun main() {
    println("\nLambda Method")
    val sumaNums: (a: Int, b: Int) -> Int = ::soma
    println(sumaNums(2, 4))
    println(sumaNums(2, 2))
    println(sumaNums(2, 0))

    println("\nLambda Class")
    val somaClassNum: (Int, Int) -> Int = Soma()
    println(somaClassNum(5, 2))
    println(somaClassNum(2, 4))
    println(somaClassNum(9, 6))

    //////////////// Lambda //////////////////

    println("\nLambda soma variable")
    val somaLambda1: (Int, Int) -> Int = { a, b -> a.plus(b) }
    val somaLambda2: (Int, Int) -> Int = { _, b -> b }
    val somaLambda3: (Int, Int) -> Int = { _, _ -> 23 }
    println(somaLambda1(4, 6))
    println(somaLambda2(0, 6))
    println(somaLambda3(0, 6))

    println("\nFunção aninima soma")
    val somaFunction1: (Int, Int) -> Int = fun(a, b): Int = a + b
    val somaFunction2: (Int, Int) -> Int = fun(a, b): Int { return a + b }
    println(somaFunction1(5, 1))
    println(somaFunction2(5, 1))
}

fun soma(a: Int, b: Int): Int = a + b

class Soma : (Int, Int) -> Int {
    override fun invoke(num1: Int, num2: Int): Int = num1 + num2;
}