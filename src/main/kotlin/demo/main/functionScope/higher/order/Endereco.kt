package demo.main.functionScope.higher.order

data class Endereco(var logradouro: String, var num: Int?, var uf: String) {
    var enderecoCompleto: String = ""
    var cep: Int = 0

    constructor() : this("", null, "")

    override fun toString(): String {
        return "Endereco(logradouro='$logradouro', num=$num, uf='$uf', enderecoCompleto='$enderecoCompleto')"
    }

    fun completo(): String = this.enderecoCompleto
}
