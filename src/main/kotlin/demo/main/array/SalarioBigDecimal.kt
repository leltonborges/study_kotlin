package demo.main.array

import java.math.BigDecimal

fun main() {
    val salarios = bigDecimalArrayOf("1500.55", "2050.60", "2549.99", "5000.00", "7000.00", "1000.00")
    println(salarios.contentToString())

    val salarioComAumento: Array<BigDecimal> = salarios.mapNotNull { sla -> calcAumentoRelativo(sla) }.toTypedArray()
    println(salarioComAumento.contentToString())
    val gastoInicial = salarioComAumento.somatoria()
    println("Somatório $gastoInicial")

    val meses = "6".toBigDecimal()
    val gastosEmSeisMeses = salarioComAumento.fold(gastoInicial) { acumulador, salario -> acumulador.add(salario.multiply(meses)) }
    println("Gastos em 6 meses:  $gastosEmSeisMeses")

    val salarioOrdenadoAsc = salarioComAumento.sorted()
    val tresUltimosSalarios = salarioOrdenadoAsc.takeLast(3).toTypedArray()
    println("Média: ${tresUltimosSalarios.average()}")

    val mediaMaioresSalarios = salarioComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
        .average()

    println("Média: $mediaMaioresSalarios")

    val mediaMenoresSalario = salarioComAumento
        .sorted()
        .take(3)
        .toTypedArray()
        .average()

    println("Média menores salarios: $mediaMenoresSalario")
}

private fun calcAumentoRelativo(sla: BigDecimal): BigDecimal? {
    return if (sla < "5000".toBigDecimal())
        sla.add("500".toBigDecimal())
    else
        sla.multiply(1.1.toBigDecimal())
}
