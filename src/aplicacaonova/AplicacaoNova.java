package aplicacaonova;

import com.sun.deploy.util.StringUtils;
import rh.Pessoa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class AplicacaoNova {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Pessoa> listagemPessoas = new ArrayList<Pessoa>();
        String opcao = "s";

        do {
            System.out.println("Deseja adicionar:");
            opcao = s.nextLine();

            if (opcao.equals("s")) {
                Pessoa p = new Pessoa();
                System.out.println("Entre com o nome:");
                p.setNome(s.nextLine());
                System.out.println("Entre com a aultura");
                p.setAltura(Float.parseFloat(s.nextLine()));
                System.out.println("Entre com o Sexo");
                p.setSexo(s.nextLine());
                listagemPessoas.add(p);
            } else {
                int indice = Integer.parseInt(opcao);

                if(indice < listagemPessoas.size()) {

                    Pessoa p = listagemPessoas.get(indice);

                    System.out.println("Nome: " + p.getNome());
                    System.out.println("Altura: " + p.getAltura());
                    System.out.println("Sexo: " + p.getSexo());

                    listagemPessoas.remove(indice);
                } else {
                    System.out.println("Tentando remover fora do intervalo");
                }
            }
        } while (opcao.equals("s"));

        for (Pessoa p : listagemPessoas) {
            System.out.println(p.getNome());
            System.out.println(p.getAltura());
            System.out.println(p.getSexo());
        }

        for (int i = 0; i < listagemPessoas.size(); i++) {
            System.out.println(listagemPessoas.get(i).getNome());
            System.out.println(listagemPessoas.get(i).getAltura());
            System.out.println(listagemPessoas.get(i).getSexo());
        }
    }
}
