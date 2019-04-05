package aplicacaonova;
import rh.Pessoa;

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
            if(opcao.equals("s")) {
                Pessoa p = new Pessoa();
                System.out.println("Entre com o nome:");
                p.setNome(s.nextLine());
                System.out.println("Entre com a aultura");
                p.setAltura(Float.parseFloat(s.nextLine()));
                System.out.println("Entre com o Sexo");
                p.setSexo(s.nextLine());
                listagemPessoas.add(p);
            }
        } while (opcao.equals("s"));

        for (Pessoa p: listagemPessoas){
            System.out.println(p.getNome());
            System.out.println(p.getAltura());
            System.out.println(p.getSexo());
        }

        for(int i=0; i < listagemPessoas.size(); i++){
            System.out.println(listagemPessoas.get(i).getNome());
            System.out.println(listagemPessoas.get(i).getAltura());
            System.out.println(listagemPessoas.get(i).getSexo());
        }
    }
}
