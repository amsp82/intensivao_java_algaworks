package com.adeterc.banco.modelo.pagamento;

import java.math.BigDecimal;

public interface DocumentoPagavel {

    public abstract BigDecimal getValorTotal();

    public abstract boolean estaPago();

    public abstract void quitarPagamento();
    
    default void imprimirRecibo(){
        System.out.println("RECIBO.");
        System.out.println("Valor total: " + getValorTotal());
        System.out.println("Pago: " + estaPago());
    }
}
