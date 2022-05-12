package demo.main.collection.repository

interface JpaRepository<T>{
    fun findAll(): List<T>
    fun findByName(name: String): T?
    fun save(entity: T)
    fun saveAll(entity: Collection<T>)
}