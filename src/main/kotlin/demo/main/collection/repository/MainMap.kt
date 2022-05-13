package demo.main.collection.repository

fun main() {
    val mapName1 = mapOf<Int, String>(Pair(0, "Lia"), Pair(1, "Alex"), Pair(2, "Bia"))
    val mapName2 = mapOf<Int, String>(0 to "Lia", 1 to "Alex", 2 to "Bia"); // perda de performace com muitos dados

    println(mapName1)
    println(mapName2)

    println()
    println(mapName1[0])
    println()

    for (name in mapName1) {
        println("key: ${name.key} - value: ${name.value}")
    }

    val mapMutableName = mutableMapOf<Int, String>(Pair(0, "Lia"), Pair(1, "Alex"), Pair(2, "Bia"))
    mapMutableName[3] = "Maria"
    mapMutableName.put(4,"Bob")

    mapMutableName.putIfAbsent(5, "Marcos") //Só add se não estiver.

}