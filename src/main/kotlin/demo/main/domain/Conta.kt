package demo.main.domain

import java.util.*

class Conta(
    private val owner: String,
    private val numberAccount: Int = UUID.randomUUID().variant(),
    private var balanceAccount: Double = 0.0
) {

    public fun sacar(saque: Double): Double {

        if (this.balanceAccount < 0)
            throw Throwable("Conta esta sem saldo")

        if (this.balanceAccount < saque)
            throw Throwable("Saldo bancario insufiente")

        this.balanceAccount -= saque;
        return saque;
    }

    public fun depositar(deposita: Double) {
        this.balanceAccount += deposita;
    }

    public fun transfere(value: Double, destination: Conta): Boolean {
        if (value > this.balanceAccount) {
            this.balanceAccount -= value;
            destination.balanceAccount += value;
            return true;
        }

        return false;
    }

    override fun toString(): String {
        return "Conta(owner='$owner', numberAccount=$numberAccount, balanceAccount=$balanceAccount)"
    }
}