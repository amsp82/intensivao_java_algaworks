package com.adeterc.banco.app;

import com.adeterc.banco.modelo.BancoSimulacao;
import com.adeterc.banco.modelo.Conta;
import java.math.BigDecimal;
import java.util.Optional;

public class Pri {

    public static void main(String[] args) {
        BancoSimulacao banco = new BancoSimulacao();

        // Optional<Conta> contaOptional = banco.buscar(123, 333);
        // if (contaOptional.isPresent()) {
        //    Conta contaEncontrada = contaOptional.get();
        //    System.out.println(contaEncontrada.getSaldo());
        // }
        
        // banco.buscar(123, 333).ifPresent(conta -> System.out.println(conta.getSaldo()));
        
        // Conta contaEncontrada = banco.buscar(123, 222)
        //         .orElseThrow(() -> new RuntimeException("Conta não encontrada"));
        // System.out.println(contaEncontrada.getSaldo());
        
        BigDecimal saldo = banco.buscar(123, 333)
                .map(Conta::getSaldo)
                .orElse(BigDecimal.ZERO);

        System.out.println(saldo);
    }
}
