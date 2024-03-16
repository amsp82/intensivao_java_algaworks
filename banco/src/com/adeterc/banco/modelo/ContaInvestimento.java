package com.adeterc.banco.modelo;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ContaInvestimento extends Conta {

    public ContaInvestimento(Pessoa titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }

    public void creditarRendimentos(double percentualJuros) throws IllegalAccessException {
        double valorRendimentos = getSaldo() * percentualJuros / 100;
        depositar(valorRendimentos);
    }

    @Override
    public void debitarTarifaMensal() {
        if (getSaldo() < 10_000) {
            try {
                sacar(30);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(ContaInvestimento.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
