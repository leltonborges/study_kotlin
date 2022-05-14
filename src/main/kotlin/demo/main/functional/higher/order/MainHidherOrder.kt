package demo.main.functional.higher.order

fun main() {
    test { }
    "".let(::testRecebeString)

    test2({}, 1)
    test3(1, {})
    test4{}
}

fun test(bloco: () -> Unit) {}
fun test2(bloco: () -> Unit, test: Int) {}
fun test3(num: Int, bloco: () -> Unit) {}
fun test4(bloco: () -> Unit): () -> Unit {
    return {
        println("")
    }
}

fun testRecebeString(value: String) {}

