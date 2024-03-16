package com.adeterc.banco.modelo;

public class ContaInvestimento extends Conta {
    
    public ContaInvestimento(Pessoa titular, int agencia, int numero) {
        super(titular, agencia, numero);
    }
    
    public void creditarRendimentos(double percentualJuros) throws IllegalAccessException {
        double valorRendimentos = getSaldo() * percentualJuros / 100;
        depositar(valorRendimentos);
    }
}
