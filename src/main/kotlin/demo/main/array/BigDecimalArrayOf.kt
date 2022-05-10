package demo.main.array

import java.math.BigDecimal

fun bigDecimalArrayOf(vararg values: String): Array<BigDecimal> {
    return Array(values.size) { i -> values[i].toBigDecimal() }
}

fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acumulador, valor -> acumulador.add(valor) }
}

fun Array<BigDecimal>.average(): BigDecimal {
    return if (this.isEmpty()) BigDecimal.ZERO
    else
        this.somatoria() / this.size.toBigDecimal()
}