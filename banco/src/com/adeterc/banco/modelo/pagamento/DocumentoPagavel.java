package com.adeterc.banco.modelo.pagamento;

public interface DocumentoPagavel {

    public abstract double getValorTotal();

    public abstract boolean estaPago();

    public abstract void quitarPagamento();
    
    default void imprimirRecibo(){
        System.out.println("RECIBO.");
        System.out.println("Valor total: " + getValorTotal());
        System.out.println("Pago: " + estaPago());
    }
}
