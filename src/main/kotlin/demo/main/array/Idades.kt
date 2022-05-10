package demo.main.array

fun main() {
    val idades: IntArray = intArrayOf(2, 62, 6, 14, 21, 12, 46, 34)
    println(idades.maxOrNull())
    println(idades.minOrNull())
    println(idades.average())

    val maiorDeIdade = idades.all { it >= 18 }
    println(maiorDeIdade)

    val algumMaiorDeIdade = idades.any { it >= 18 }
    println(algumMaiorDeIdade)

    val adultos: List<Int> = idades.filter { it >= 18 }
    adultos.forEach{ print("$it ") }


}