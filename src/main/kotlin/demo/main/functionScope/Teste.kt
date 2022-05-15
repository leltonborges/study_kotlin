package demo.main.functionScope

class Teste: (Int, Int) -> Unit {
    override fun invoke(p1: Int, p2: Int) {
        println("n1: $p1, n2: $p2")
    }

}