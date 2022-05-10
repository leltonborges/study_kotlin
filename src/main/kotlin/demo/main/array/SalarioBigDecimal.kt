package demo.main.array

import java.math.BigDecimal

fun main() {
    val salarios = bigDecimalArrayOf("1500.55", "2050.60", "2549.99", "5000.00", "7000.00", "1000.00")
    println(salarios.contentToString())

    val aumentoSalarial: Array<BigDecimal> = salarios.mapNotNull { sla -> calcAumentoRelativo(sla) }.toTypedArray()
    println(aumentoSalarial.contentToString())
    val gastoInicial = aumentoSalarial.somatoria()
    println("Somatório $gastoInicial")

    val meses = "6".toBigDecimal()
    val gastosEmSeisMeses = aumentoSalarial.fold(gastoInicial) { acumulador, salario -> acumulador.add(salario.multiply(meses)) }
    println("Gastos em 6 meses:  $gastosEmSeisMeses")
}

private fun calcAumentoRelativo(sla: BigDecimal): BigDecimal? {
    return if (sla < "5000".toBigDecimal())
        sla.add("500".toBigDecimal())
    else
        sla.multiply(1.1.toBigDecimal())
}

fun bigDecimalArrayOf(vararg values: String): Array<BigDecimal> {
    return Array(values.size) { i -> values[i].toBigDecimal() }
}

fun Array<BigDecimal>.somatoria(): BigDecimal{
    return this.reduce { acumulador, valor -> acumulador.add(valor) }
}
