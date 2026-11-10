interface Prototype {
    Prototype clone();
}

class Guerreiro implements Prototype {
    String nome;
    int vida;
    int dano;

    Guerreiro(String nome, int vida, int dano) {
        this.nome = nome;
        this.vida = vida;
        this.dano = dano;
    }

    // Método responsável pela clonagem
    public Guerreiro clone() {
        return new Guerreiro(nome, vida, dano);
    }

    void exibir() {
        System.out.println(
            nome + " | Vida: " + vida + " | Dano: " + dano
        );
    }
}

public class Main {
    public static void main(String[] args) {

        // Criando o protótipo original
        Guerreiro original =
            new Guerreiro("Guerreiro", 100, 30);

        // Criando cópias do protótipo
        Guerreiro guerreiro1 = original.clone();
        Guerreiro guerreiro2 = original.clone();

        // Modificando apenas uma cópia
        guerreiro2.nome = "Guerreiro Clone";

        // Exibindo os personagens
        original.exibir();
        guerreiro1.exibir();
        guerreiro2.exibir();
    }
}