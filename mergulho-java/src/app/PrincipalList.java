package app;

import java.util.ArrayList;
import java.util.List;
import modelo.Pessoa;

public class PrincipalList {

    public static void main(String[] args) {
        Pessoa pessoa01 = new Pessoa("Adelo", "12346789");
        Pessoa pessoa02 = new Pessoa("Adelino", "98764321");
        Pessoa pessoa03 = new Pessoa("Adelermo", "12349876");

        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(pessoa01);
        pessoas.add(pessoa02);
        pessoas.add(pessoa03);

        System.out.println(pessoas);

        System.out.println("======");

        Pessoa pessoa04 = pessoas.get(2);
        System.out.println(pessoa04);

        System.out.println("======");

        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println(pessoas.get(i).getNome());
        }

        System.out.println("======");

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }
        
        System.out.println("======");
        
        Pessoa pessoa05 = new Pessoa("Adelermo", "12349876");
        boolean existe = pessoas.contains(pessoa05);
        System.out.println(existe);
        
        System.out.println("======");
        
        System.out.println(pessoa03 == pessoa05);
        System.out.println(pessoa03 == pessoa03);
        System.out.println(pessoa03.equals(pessoa05));
        
    }
}
