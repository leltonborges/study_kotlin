package demo.main.collection

fun main() {
    val names: MutableList<String> = mutableListOf("lia", "bia", "bob", "Alex", "Maria", "Clara");
    val nameService = DataService();
    nameService.save("Luan")
    nameService.saveAll(names)

}

class DataService() : JpaRepository<String> {
    private var datas : MutableList<String> = mutableListOf()

    override fun findAll(): List<String> {
        return this.datas.toList();
    }

    override fun findByName(name: String): String? {
        return this.datas.find { it.equals(name) }
    }

    override fun saveAll(entity: Collection<String>) {
        this.datas.addAll(entity)
    }

    override fun save(entity: String) {
        this.datas.add(entity)
    }

}

interface JpaRepository<T>{
    fun findAll(): List<T>
    fun findByName(name: String): T?
    fun save(entity: T)
    fun saveAll(entity: Collection<T>)
}