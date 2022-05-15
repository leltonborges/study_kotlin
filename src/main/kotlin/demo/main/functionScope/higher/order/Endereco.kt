package demo.main.functionScope.higher.order

data class Endereco(var logradouro: String, val num: Int?, val uf: String){
    var enderecoCompleto: String = ""

    override fun toString(): String {
        return "Endereco(logradouro='$logradouro', num=$num, uf='$uf', enderecoCompleto='$enderecoCompleto')"
    }
}
