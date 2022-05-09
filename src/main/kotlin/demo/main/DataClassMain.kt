package demo.main

fun main() {
    val idt1 = Identidade("32", "2333");
    val cer1 = CertidaoNascimento("32", "2333");
    println(idt1)
    println(cer1)

    var (rg, cpf) = idt1

    println(cpf)

    var idt2 = idt1.copy("1111")
    println(idt1)
    println(idt2)


}

data class Identidade(override val rg: String, override val cpf: String) : CertidaoNascimento(rg, cpf) {
}

open class CertidaoNascimento(open val rg: String, open val cpf: String) {
}