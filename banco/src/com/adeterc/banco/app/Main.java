package com.adeterc.banco.app;

import com.adeterc.banco.modelo.*;
import com.adeterc.banco.modelo.atm.CaixaEletronico;
import com.adeterc.banco.modelo.excecao.SaldoInsuficienteException;
import com.adeterc.banco.modelo.pagamento.Boleto;
import com.adeterc.banco.modelo.pagamento.Holerite;

public class Main {

    public static void main(String[] args) {
        Pessoa titular1 = new Pessoa();
        titular1.setNome("Adelmo Menezes");
        titular1.setDocumento("12332112311");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Maria Abadia");
        titular2.setDocumento("12332112311");

        CaixaEletronico caixaEletronico = new CaixaEletronico();
        ContaInvestimento minhaConta = new ContaInvestimento(titular1, 123, 987);
        ContaEspecial suaConta = new ContaEspecial(titular2, 222, 333, 1_000.00);

        try {
            minhaConta.depositar(30_000.00);
            minhaConta.sacar(1_000.00);
            minhaConta.debitarTarifaMensal();

            suaConta.depositar(15_000.00);
            suaConta.sacar(15_500.00);
            suaConta.debitarTarifaMensal();

            Boleto boletoEscola = new Boleto(titular2, 35_000.00);
            Holerite salarioFuncionario = new Holerite(titular2, 100, 160);

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
