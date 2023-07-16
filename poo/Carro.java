<<<<<<< HEAD
import java.util.Random;

public class Carro {
    int ano;
    String cor;

    public Carro() { //construtor

        Random gerador = new Random();
        int chassi = gerador.nextInt(998508956);
        System.out.println("Chassi: " + chassi);
    }
    public Carro(int ano, String cor){ // construtor com parametros
        this.ano = ano;
        this.cor = cor;
    }

    void ligar() {
        System.out.println("Engine ON .......");
    }

    void desligar() {
        System.out.println("Engine OFF.");
    }

    void acelerar() {
        System.out.println("Vrummmmmmm");
    }
}
=======
import java.util.Random;

public class Carro {
    int ano;
    String cor;

    public Carro() { //construtor

        Random gerador = new Random();
        int chassi = gerador.nextInt(998508956);
        System.out.println("Chassi: " + chassi);
    }
    public Carro(int ano, String cor){ // construtor com parametros
        this.ano = ano;
        this.cor = cor;
    }

    void ligar() {
        System.out.println("Engine ON .......");
    }

    void desligar() {
        System.out.println("Engine OFF.");
    }

    void acelerar() {
        System.out.println("Vrummmmmmm");
    }
}
>>>>>>> b419de8553d1acc0d48da96bfa6580130a701fab
