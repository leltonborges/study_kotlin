package demo.main.conta

import java.util.*

abstract class Conta(
    private val owner: String,
    private val numberAccount: Int = UUID.randomUUID().variant(),
    private var balanceAccount: Double = 0.0
) {

    abstract fun isSaldoSuficiente(value: Double): Boolean;
    abstract fun calcImpostoSaque(): Double;

    protected fun sacar(saque: Double): Double{
        if(this.isSaldoSuficiente(saque)){
            val saque = this.calcImpostoSaque() * saque;
            this.balanceAccount -= saque;
            return saque;
        }
        throw Throwable("Saldo insuficiente");
    }

    fun depositar(deposita: Double) {
        this.balanceAccount += deposita;
    }

    fun transfere(value: Double, destination: Conta): Boolean {
        if (this.isSaldoSuficiente(value)) {
            this.balanceAccount -= value;
            destination.depositar(value);

            return true;
        }
        return false;
    }
}