package aplicacaonova;
import rh.Pessoa;

import java.util.Scanner;
public class AplicacaoNova {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pessoa[] array = new Pessoa[4];
        Pessoa p1;
        Pessoa p2;
        Pessoa p3;
        Pessoa p4;

        p1 = new Pessoa();
        p1.setSexo("o");

        for(int i=0; i < 4; i++){
            array[i] = new Pessoa();
            System.out.println("Entre com o nome:");
            array[i].setNome(s.nextLine());
            System.out.println("Entre com a aultura");
            array[i].setAltura(Float.parseFloat(s.nextLine()));
            System.out.println("Entre com o Sexo");
            array[i].setSexo(s.nextLine());

        }
        for (Pessoa i: array){
            System.out.println(i.getNome());
            System.out.println(i.getAltura());
            System.out.println(i.getSexo());
        }
        for(int i=0; i < 4; i++){
            System.out.println(array[i].getNome());
            System.out.println(array[i].getAltura());
            System.out.println(array[i].getSexo());
        }
    }
}
