package com.adeterc.banco.app;

import com.adeterc.banco.modelo.Banco;
import com.adeterc.banco.modelo.Conta;
import java.util.Comparator;
import java.util.function.ToIntFunction;

public class Principal {

    public static void main(String[] args) {
        Banco banco = new Banco();

        // ToIntFunction<Conta> function = (Conta conta) -> {
        //    return conta.getNumero();
        // };
        // banco.getContas().sort(Comparator.comparingInt(new NumeroContaFunction()));
        // banco.getContas().sort(Comparator.comparingInt(function));
        // banco.getContas().sort(Comparator.comparingInt((Conta conta) -> conta.getNumero()));
        // banco.getContas().sort(Comparator.comparingInt(conta -> conta.getNumero()));
        
        banco.getContas().sort(Comparator.comparingInt(Conta::getNumero));
        for (Conta conta : banco.getContas()) {
            System.out.println(conta.getAgencia() + "/" + conta.getNumero());
        }
    }
}
