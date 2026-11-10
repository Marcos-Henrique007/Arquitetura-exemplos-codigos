public class Main {
    public static void main(String[] args) {

        // Criando o primeiro guerreiro
        Guerreiro guerreiro1 = new Guerreiro();
        guerreiro1.nome = "Guerreiro";
        guerreiro1.vida = 100;
        guerreiro1.dano = 30;

        // Criando outro guerreiro igual
        Guerreiro guerreiro2 = new Guerreiro();
        guerreiro2.nome = "Guerreiro";
        guerreiro2.vida = 100;
        guerreiro2.dano = 30;

        // Exibindo os personagens
        guerreiro1.exibir();
        guerreiro2.exibir();
    }
}

class Guerreiro {
    String nome;
    int vida;
    int dano;

    void exibir() {
        System.out.println(
            nome + " | Vida: " + vida + " | Dano: " + dano
        );
    }
}