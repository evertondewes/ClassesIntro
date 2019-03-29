package aplicacaonova;

public class Cidade {

    public String nome;
    public String estado;
    public int populacao;
    public float territorio;
    public float pib;

    public static int totalCidades = 0;

    public void criar() {

        Cidade.totalCidades++;

        System.out.println("Cidade " + this.nome + ". Total:" +  Cidade.totalCidades);
    }

    public static void destruir() {
        System.out.println("Destruir Cidades");
    }

    public void alterarNome() {

    }

    public void adicionarCidade() {

    }

    public void alterarPib() {

    }

}
