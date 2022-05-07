package demo.main.conta

import java.util.*

class ContaSalario(
    private val owner: String,
    private val numberAccount: Int = UUID.randomUUID().variant(),
    private var balanceAccount: Double = 0.0
): Conta(owner, numberAccount, balanceAccount) {

    override fun isSaldoSuficiente(value: Double): Boolean {
        return this.balanceAccount >= value;
    }

    override fun calcImpostoSaque(): Double {
        return 1.05304;
    }
}