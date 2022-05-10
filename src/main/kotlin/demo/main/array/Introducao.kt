package demo.main.array

fun main() {
    val idades: IntArray = intArrayOf(23, 32,4,25,16);

    val maxOf = idades.maxOf { i: Int -> i }
    println(maxOf)

    val salarios: DoubleArray = doubleArrayOf(1610.16, 2100.20, 5000.00,6000.99);

    for (index in salarios.indices){
        println("$index: ${salarios[index]}")
    }

    val map = salarios.map { s: Double -> s * 1.1 }
    map.forEach { s: Double -> println(s) }

    salarios.forEachIndexed({index, d ->  println("index: $index == salario: $d") })
    salarios.forEachIndexed { index, salario -> println("i: $index <==> salario: $salario") } }
