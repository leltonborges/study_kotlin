package demo.main.domain

import java.util.UUID

class Conta(
    private var owner: String,
    private var numberAccount: Int,
    private var balanceAccount: Double
) {

    constructor(owner: String, numberAccount: Int) : this(owner, numberAccount, 0.0)
    constructor(owner: String,) : this(owner, UUID.randomUUID().variant())

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