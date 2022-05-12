package demo.main.collection

fun main() {
    val assistiramCursoAndroid = listOf("Alex", "Bia", "Lia", "Maria", "Bob")
    val assistiramCursoKotlin = listOf("Lia","Bob", "Max")

    val assistiramAmbos = mutableListOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    println(assistiramAmbos.distinct())
}