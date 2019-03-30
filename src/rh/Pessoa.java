package rh;

public class Pessoa {

    String nome;
    private String sobrenome;
    public String dataDeNascimento;
    public String sexo;
    private float altura;
    public String ocupacao;

    public static int totalPessoas = 0;

    public void setSexo(String sexo){
        if(sexo.equals("m") || sexo.equals("f") || sexo.equals("o") ) {
            this.sexo = sexo;
        } else {
            System.out.println("Erro, sexo inválido");
        }
    }

    public void setAltura(float altura){
        if(altura > 0.1) {
            this.altura = altura;
        } else {
            System.out.println("Altura Inválida");
        }
    }

    public boolean setNome(String nome) {
        if(nome.length() < 5) {
            System.out.println("Não é permitido nome menor 20 carteres");
            return  false;
        } else {
            this.nome = nome;
        }
        return true;
    }

    public boolean setNome(String nome, String sobrenome){
        if(this.setNome(nome)){
            if(sobrenome.length() < 5) {
                System.out.println("Não é permitido sobrenome menor 10 carteres");
                return false;
            } else {
                this.sobrenome = sobrenome;
                this.nome = nome;
            }
        }
        return true;
    }

    public void morrer() {

    }

    public void andar() {

    }

    public void comer() {

    }

    public void preferenciasDeCompras() {

    }

    public void trabalhar() {

    }

    public static void incrementar() {

        Pessoa.totalPessoas++;
    }

}
