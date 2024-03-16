package com.adeterc.banco.modelo.pagamento;

public interface DocumentoEstornavel extends DocumentoPagavel {

    // double getValorTotal();
    // boolean estaPago();
    void estornarPagamento();
}
