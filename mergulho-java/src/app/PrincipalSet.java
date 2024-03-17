package app;

import java.util.HashSet;
import java.util.Set;
import modelo.Pessoa;

public class PrincipalSet {

    public static void main(String[] args) {
        Pessoa pessoa06 = new Pessoa("Adelo", "12346789");
        Pessoa pessoa07 = new Pessoa("Adelino", "98764321");
        Pessoa pessoa08 = new Pessoa("Adelermo", "12349876");

        Set<Pessoa> pessoas = new HashSet<>();
        pessoas.add(pessoa06);
        pessoas.add(pessoa07);
        pessoas.add(pessoa08);

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }
        
        Pessoa pessoa09 = new Pessoa("Adelermo", "12349876");
        boolean existe = pessoas.contains(pessoa09);
        System.out.println(existe);
    }
}
