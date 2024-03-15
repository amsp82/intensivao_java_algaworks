package com.adeterc.banco.modelo;

import java.util.Objects;

public class Conta {

    private Pessoa titular;
    private int agencia;
    private int numero;
    private double saldo; // variável de instância

    public Conta() {
    }

    public Conta(Pessoa titular, int agencia, int numero) {
        Objects.requireNonNull(titular);
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    // metódo de instância
    public void depositar(double valor) throws IllegalAccessException {
        if (valor <= 0) {
            throw new IllegalAccessException("Valor deve ser maior que 0");
        }
        saldo = saldo + valor;
    }

    public void sacar(double valor) throws IllegalAccessException {
        if (saldo - valor < 0) {
            throw new IllegalStateException("Saldo insuficiente");
        }

        if (valor <= 0) {
            throw new IllegalAccessException("Valor deve ser maior que 0");
        }
        saldo = saldo - valor;
    }

    // sobrecarga de método
    public void sacar(double valor, double taxaSaque) throws IllegalAccessException {
        sacar(valor + taxaSaque);
    }
}
