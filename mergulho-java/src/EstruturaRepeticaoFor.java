
public class EstruturaRepeticaoFor {

    public static void main(String[] args) {
        double valorAcumulado = 10_000;
        double taxaJurusMensal = 0.8;
        int periodoEmMeses = 12;

        for (int mes = 1; mes <= periodoEmMeses; mes++) {
            // valorAcumulado = valorAcumulado + (valorAcumulado * taxaJurusMensal / 100);
            valorAcumulado += valorAcumulado * taxaJurusMensal / 100;
            System.out.println("Mês " + mes + " = " + valorAcumulado);
        }
    }
}
