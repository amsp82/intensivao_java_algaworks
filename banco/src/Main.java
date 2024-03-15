
public class Main {

    public static void main(String[] args) throws IllegalAccessException {
        Pessoa titular1 = new Pessoa();
        titular1.setNome("Adelmo Menezes");
        titular1.setDocumento("12332112311");

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Maria Abadia");
        titular2.setDocumento("12332112311");

        Conta minhaConta = new Conta(titular1, 123, 987);
        minhaConta.depositar(15_000.00);

        Conta suaConta = new Conta(titular2, 222, 333);
        suaConta.depositar(30_000.00);

        minhaConta.sacar(1_000.00);
        minhaConta.sacar(1_000.00, 10.00);

        System.out.println("Nome Titular: " + minhaConta.getTitular().getNome());
        System.out.println("Saldo: " + minhaConta.getSaldo());

        System.out.println("Nome Titular: " + suaConta.getTitular().getNome());
        System.out.println("Saldo: " + suaConta.getSaldo());
    }
}
