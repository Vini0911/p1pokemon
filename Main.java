import java.util.Scanner;

class Pokemon {

    public String nome;

    public String tipo;

    public Pokemon(String nome, String tipo) {
        this.nome = nome;

        this.tipo = tipo;
    }

    public void falar() {
        System.out.println("Eu sou o pokemon " + nome + " do tipo " + tipo);
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        try {
            System.out.println("Digite o nome do pokemon:");
            String nome = ler.next();

            System.out.println("Digite o nome tipo do pokemon:");
            String tipo = ler.next();

            Pokemon pokemon = new Pokemon(nome, tipo);

            System.out.println("Fale pokemon.");
            pokemon.falar();

        } finally {
            ler.close();

        }

    }
}
