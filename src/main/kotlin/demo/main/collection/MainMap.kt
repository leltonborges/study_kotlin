package demo.main.collection.repository

fun main() {
    val mapName1 = mapOf<Int, String>(Pair(0, "Lia"), Pair(1, "Alex"), Pair(2, "Bia"))
    val mapName2 =
        mapOf<Int, String>(0 to "Lia", 1 to "Alex", 2 to "Bia", 3 to "Lis", Pair(4, "Bob"), Pair(5, "Bar")); // perda de performace com muitos dados

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
    mapMutableName.put(4, "Bob")

    mapMutableName.putIfAbsent(5, "Marcos") //Só add se não estiver.

    /////////////////////////////////////////////////////

    println(mapName1.get(3)) // se não existe retorna nul
//    println(mapName1.getValue(3)) // se não existe retorna Exception
    println(mapName1.getOrElse(5, { "Não existe" })) // se não existe retorna uma valor personalizado
    println(mapName1.getOrDefault(5, 0)) // se não existe retorna uma valor default

    /////////////////////////////////////////////////

    println(mapMutableName.keys) // todas as chaves
    println(mapMutableName.values) // todos os valores

    ///////////////////////////////////////////////////

    println(mapName2.filter { (key, value) -> key == 2 })
    println(mapName2.filter { (key, value) -> value.startsWith("L") })
    println(mapName2.filterValues { value -> value.startsWith("L") })
    println(mapName2.filterKeys { key -> key % 2 != 0 })

    ////////////////////// Operator ////////////////////////////

    /////////// Mais/Add
    println(mapName2 + Pair(6, "Max"))
    println(mapName2)

    /////////// Menos/Remover
    println(mapName2 - 4)
    println(mapName2)


}