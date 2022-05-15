package demo.main.functionScope

import demo.main.functionScope.higher.order.Endereco

fun main() {
    with(Endereco()){
        logradouro = "Rua Abc Avenida JA"
        num = 23
        cep = 23434
        uf = "gO"
        enderecoCompleto = "$logradouro, $num - $uf, $cep"

        completo()
    }. let {
        println(it)
    }

}