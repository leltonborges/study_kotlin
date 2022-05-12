package demo.main.collection.entity

import demo.main.collection.repository.JpaRepository

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