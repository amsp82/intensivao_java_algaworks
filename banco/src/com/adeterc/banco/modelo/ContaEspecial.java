package com.adeterc.banco.modelo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ContaEspecial extends Conta {

    private double valorLimite;

    public ContaEspecial(Pessoa titular, int agencia, int numero, double valorLimite) {
        super(titular, agencia, numero);
        this.valorLimite = valorLimite;
    }

    @Override
    public double getSaldoDisponivel() {
        return getSaldo() + getValorLimite();
    }

    public double getValorLimite() {
        return valorLimite;
    }

    public void setValorLimite(double valorLimite) {
        this.valorLimite = valorLimite;
    }

    @Override
    public void debitarTarifaMensal() {
        try {
            sacar(20.00);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ContaEspecial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
