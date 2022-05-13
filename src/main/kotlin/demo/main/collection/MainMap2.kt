package demo.main.collection

import demo.main.collection.entity.Pedido

fun main() {

    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 234.0),
        Pedido(3, 43.0),
        Pedido(4, 10.0),
        Pedido(5, 12.0),
        Pedido(6, 61.0),
        Pedido(7, 17.0),
        Pedido(8, 72.0)
    )

    ///////////// Associate //////////////////////////
    val pedidoMap1 = pedidos.associate { pedido: Pedido -> Pair(pedido.number, pedido.value) }
    println(pedidoMap1)

    println()
    ///////////// AssociateBy //////////////////////////

    val pedidoAssociateBy = pedidos.associateBy { p -> p.number }
    println(pedidoAssociateBy)

    println()
    ///////////// Associate //////////////////////////
    val pedidoAssociateWith1 = pedidos.associateWith { p -> p.value }
    println(pedidoAssociateWith1)

    val pedidoAssociateWith2 = pedidos.associateWith { p -> p.value > 50.0 }
    println(pedidoAssociateWith2)
    println(pedidoAssociateWith2.filterValues { v -> v == true })

    println()
    ///////////// groupBy //////////////////////////

    val pedidoGroupBy = pedidos.groupBy { p -> p.value > 50.0 }
    println(pedidoGroupBy)
    println(pedidoGroupBy.get(true))

    println()
    val nomes = listOf("Ana", "Bia", "Lia", "Bob", "Marcos", "Maria", "Gui", "Lis", "ALex", "Ju")
    val namesFirstChar = nomes.groupBy { n -> n.first() }
    println(namesFirstChar)
    println(namesFirstChar['A'])

}