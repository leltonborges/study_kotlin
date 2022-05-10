package demo.main.array

fun main() {
    val serie: IntRange = 1.rangeTo(10);
    serie.forEach{i: Int -> println(i)}

    val otherRange = 0..100 step 2 // 100 incluso
    otherRange.forEach{i: Int -> print("$i ")}

    println()
    val pares = 2.until(100) step 2 // 100 não incluso
    pares.forEach{i: Int -> print("$i ")}

    println()
    val paresReversos = 100 downTo 0 step 2 // reverso
    paresReversos.forEach{i: Int -> print("$i ")}

    println()
    if(10 in pares) println("Esta dentro") // 10 esta dentro do intervalo?
    else println("Não esta dentro")

    val alfabeto = 'A'..'z';
    if('z' in alfabeto) println("Esta dentro") // 'z' esta dentro do alfabeto?
    else println("Não esta dentro")

    alfabeto.forEach{i: Char -> print("$i ")}


}