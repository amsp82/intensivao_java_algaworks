package com.adeterc.banco.app;

import com.adeterc.banco.modelo.Banco;
import java.math.BigDecimal;
import java.util.Comparator;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import com.adeterc.banco.modelo.Conta;
import com.adeterc.banco.modelo.Pessoa;
import java.util.List;

public class Appii {

    public static void main(String[] args) {
        Banco banco = new Banco();

        List<Pessoa> titulares = banco.getContas().stream()
                .map(Conta::getTitular)
                .distinct()
                .toList();
        // .collect(Collectors.toList());

        System.out.println(titulares);

        BigDecimal saldoTotal = banco.getContas().stream()
                .map(Conta::getSaldo)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        //.reduce(BigDecimal.ZERO, (subtotal, valor) -> subtotal.add(valor));

        System.out.println(saldoTotal);

        banco.getContas().stream()
                .filter(conta -> conta.getSaldo().compareTo(new BigDecimal("50")) > 0)
                .filter(conta -> conta.getNumero() > 200)
                .map(Conta::getTitular)
                .distinct()
                .forEach(System.out::println);

        // banco.getContas().stream()
        //        .filter(conta -> conta.getSaldo().compareTo(new BigDecimal("50")) > 0)
        //        .filter(conta -> conta.getNumero() > 200)
        //        .sorted(Comparator.comparingInt(Conta::getNumero))
        //        .forEach(conta -> {
        //            System.out.println(conta.getAgencia() + "/" + conta.getNumero()
        //                    + " = " + conta.getSaldo());
        //        });

        /*
        Stream<Conta> streamAll = banco.getContas().stream();
        Stream<Conta> streamFilter = streamAll.filter(
                conta -> conta.getSaldo().compareTo(new BigDecimal("130")) > 0
        );
        Stream<Conta> streamConta = streamFilter.filter(conta -> conta.getNumero() > 300);

        
        streamAll.forEach(conta -> {
            // conta.depositar(new BigDecimal("10"));
            System.out.println(conta.getAgencia() + "/" + conta.getNumero()
                    + " = " + conta.getSaldo());
        });
        streamConta.forEach(conta -> {
            System.out.println(conta.getAgencia() + "/" + conta.getNumero()
                    + " = " + conta.getSaldo());
        });
         */
    }
}
