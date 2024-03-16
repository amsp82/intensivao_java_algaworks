package com.adeterc.banco.app;

import com.adeterc.banco.modelo.*;
import com.adeterc.banco.modelo.atm.CaixaEletronico;
import com.adeterc.banco.modelo.excecao.SaldoInsuficienteException;
import com.adeterc.banco.modelo.pagamento.Boleto;
import com.adeterc.banco.modelo.pagamento.Holerite;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        Pessoa titular1 = new Pessoa();
        titular1.setNome("Adelmo Menezes");
        titular1.setDocumento("12332112311");
        // titular1.setRendimentoAnual(Double.valueOf(15_000.00d));
        titular1.setRendimentoAnual(new BigDecimal("15000")); // encaixotamento
        titular1.setTipo(TipoPessoa.JURIDICA);
        // System.out.println(titular1.getTipo());
        titular1.setDataUltimaAtualizacao(LocalDateTime.parse("2024-03-15T14:20:00"));
        System.out.println(titular1.getDataUltimaAtualizacao());
        
        // double rendimento = titular1.getRendimentoAnual(); // desencaixotamento
        
        Pessoa titular2 = new Pessoa();
        titular2.setNome("Maria Abadia");
        titular2.setDocumento("12332112311");

        CaixaEletronico caixaEletronico = new CaixaEletronico();
        ContaInvestimento minhaConta = new ContaInvestimento(titular1, 123, 987);
        ContaEspecial suaConta = new ContaEspecial(titular2, 222, 333, new BigDecimal("1000"));

        try {
            minhaConta.depositar(new BigDecimal("30000"));
            minhaConta.sacar(new BigDecimal("1000"));
            minhaConta.debitarTarifaMensal();

            suaConta.depositar(new BigDecimal("15000"));
            suaConta.sacar(new BigDecimal("15500"));
            suaConta.debitarTarifaMensal();

            Boleto boletoEscola = new Boleto(titular2, new BigDecimal("5000"));
            Holerite salarioFuncionario = new Holerite(titular2, new BigDecimal("100"), 160);

            caixaEletronico.pagar(boletoEscola, minhaConta);
            caixaEletronico.pagar(salarioFuncionario, minhaConta);
            caixaEletronico.estornarPagamento(boletoEscola, minhaConta);

            boletoEscola.imprimirRecibo();
            salarioFuncionario.imprimirRecibo();

        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro ao executar operação na conta: " + e.getMessage());
        }

        System.out.println("-");
        caixaEletronico.imprimirSaldo(minhaConta);
        System.out.println("-");
        caixaEletronico.imprimirSaldo(suaConta);
    }
}
