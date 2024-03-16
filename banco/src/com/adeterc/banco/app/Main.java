package com.adeterc.banco.app;

import com.adeterc.banco.modelo.*;
import com.adeterc.banco.modelo.atm.CaixaEletronico;
import com.adeterc.banco.modelo.pagamento.Boleto;
import com.adeterc.banco.modelo.pagamento.DocumentoPagavel;
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
        minhaConta.depositar(30_000.00);
        minhaConta.sacar(1_000.00);
        // minhaConta.sacar(1_000.00, 10.00);
        // minhaConta.creditarRendimentos(0.8);
        minhaConta.debitarTarifaMensal();

        ContaEspecial suaConta = new ContaEspecial(titular2, 222, 333, 1_000.00);
        suaConta.depositar(15_000.00);
        suaConta.sacar(15_500.00);
        suaConta.debitarTarifaMensal();

        Boleto boletoEscola = new Boleto(titular2, 800);
        Holerite salarioFuncionario = new Holerite(titular2, 100, 160);
        
        // System.out.println("Boleto pago: " + boletoEscola.estaPago());
        caixaEletronico.pagar(boletoEscola, minhaConta);
        caixaEletronico.pagar(salarioFuncionario, minhaConta);
        caixaEletronico.estornarPagamento(boletoEscola, minhaConta);
        boletoEscola.imprimirRecibo();
        salarioFuncionario.imprimirRecibo();
        System.out.println("-");
        
        // System.out.println("Boleto pago: " + boletoEscola.estaPago());
        // System.out.println("Salário pago: " + salarioFuncionario.estaPago());

        caixaEletronico.imprimirSaldo(minhaConta);
        System.out.println("-");
        caixaEletronico.imprimirSaldo(suaConta);

    }
}
