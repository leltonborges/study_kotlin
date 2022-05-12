package demo.main.collection

import demo.main.collection.entity.DataService

fun main() {
    val names: MutableList<String> = mutableListOf("lia", "bia", "bob", "Alex", "Maria", "Clara");
    val nameService = DataService();
    nameService.save("Luan")
    nameService.saveAll(names)

}