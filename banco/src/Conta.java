
import java.util.Objects;

public class Conta {

    Pessoa titular;
    int agencia;
    int numero;
    double saldo; // variável de instância

    public Conta() {
    }

    Conta(Pessoa titular, int agencia, int numero) {
        Objects.requireNonNull(titular);
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    // metódo de instância
    void depositar(double valor) throws IllegalAccessException {
        if (valor <= 0) {
            throw new IllegalAccessException("Valor deve ser maior que 0");
        }
        saldo = saldo + valor;
    }

    void sacar(double valor) throws IllegalAccessException {
        if (saldo - valor < 0) {
            throw new IllegalStateException("Saldo insuficiente");
        }

        if (valor <= 0) {
            throw new IllegalAccessException("Valor deve ser maior que 0");
        }
        saldo = saldo - valor;
    }

    // sobrecarga de método
    void sacar(double valor, double taxaSaque) throws IllegalAccessException {
        sacar(valor + taxaSaque);
    }
}
