
public class Main {

    public static void main(String[] args) {
        Pessoa titular1 = new Pessoa();
        titular1.nome = "Adelmo Menezes";
        titular1.documento = "12332112311";

        Pessoa titular2 = new Pessoa();
        titular2.nome = "Maria Abadia";
        titular2.documento = "12332112311";

        Conta minhaConta = new Conta();
        // minhaConta.nomeTitulo = "Adelmo Menezes";
        minhaConta.titular = titular1;
        minhaConta.agencia = 123;
        minhaConta.numero = 987;
        minhaConta.saldo = 10_000.00;

        Conta suaConta = new Conta();
        // suaConta.nomeTitulo = "Maria Abadia";
        suaConta.titular = titular2;
        suaConta.agencia = 222;
        suaConta.numero = 333;
        suaConta.saldo = 30_000.00;

        // System.out.println("Nome Titular: " + minhaConta.nomeTitulo);
        System.out.println("Nome Titular: " + minhaConta.titular.nome);
        System.out.println("Saldo: " + minhaConta.saldo);

        // System.out.println("Nome Titular: " + suaConta.nomeTitulo);
        System.out.println("Nome Titular: " + suaConta.titular.nome);
        System.out.println("Saldo: " + suaConta.saldo);
    }
}
