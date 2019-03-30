package aplicacaonova;

import casa.Casa;
import rh.*;

import java.util.Scanner;

public class AplicacaoNova {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] array = new int[4];
        for(int i=0; i < 4; i++){

            String linha;

            linha = s.nextLine();

            array[i] = Integer.parseInt(linha);
        }
        for (int i: array){
            System.out.println(i);
        }
        for(int i=0; i < 4; i++){
            System.out.println(array[i]);
        }

    }

}
