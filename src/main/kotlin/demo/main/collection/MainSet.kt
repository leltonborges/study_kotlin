package demo.main.collection

fun main() {
    val assistiramCursoAndroid = setOf("Alex", "Bia", "Lia", "Maria", "Bob")
    val assistiramCursoKotlin = setOf("Lia", "Bob", "Max")

    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)

    println("======== União ========")
    println(assistiramAmbos)
    println()
    println(assistiramCursoAndroid + assistiramCursoKotlin)
    println()
    println(assistiramCursoAndroid union assistiramCursoKotlin)
    println()
    println(assistiramCursoAndroid.union(assistiramCursoKotlin))

    println("\n ======== Subtração ========")
    println(assistiramCursoAndroid - assistiramCursoKotlin)
    println()
    println(assistiramCursoAndroid subtract  assistiramCursoKotlin)
    println()
    println(assistiramCursoAndroid.subtract(assistiramCursoKotlin))

    println("\n ======== Intercessão ========")
    println(assistiramCursoAndroid intersect   assistiramCursoKotlin)
    println()
    println(assistiramCursoAndroid.intersect(assistiramCursoKotlin))
}