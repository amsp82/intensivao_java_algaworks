
public class Variaveis {

    public static void main(String[] args) {

        String nomeCompleto;
        int minhaIdade = 41;
        double meuPeso = 85.9;

        nomeCompleto = "Adelmo Menezes da Silva Protázio";
        System.out.println("Nome: " + nomeCompleto);
        System.out.println("Idade: " + minhaIdade);
        System.out.println("Peso: " + meuPeso);

        int suaIdade = 25;
        int totalIdades = minhaIdade + suaIdade;
        System.out.println(totalIdades);

        float taxa = 1294.93f;
        boolean compraAprovada = false;
        System.out.println(compraAprovada);

        boolean maiorDeIdade = minhaIdade > 18;
        System.out.println("Sou maior de idade: " + maiorDeIdade);
        /*
            tipo    tamanho(bits) Menor_valor Maior_valor
            boolean      1           false       true 
            char         16            0        2^16 - 1
            byte         8           -2^7       2^7 - 1  
            short        16          -2^15      2^15 - 1
            int          32          -2^31      2^31 - 1
            long         64          -2^63      2^63 - 1
            float        32            -           -
            double       64            -           -
         */
    }
}
