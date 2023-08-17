class Animal { // Classe pai ou Super Classe
    String cor;
    int tamanho;
    double peso;

    void correr() {
        System.out.println("Correr");
    }

    void dormir() {
        System.out.println("Dormir");
    }
}


class Cachorro extends Animal { // Classe filha ou subclasse

    void latir() {
        System.out.println("Latir");
    }
}

class Passaro extends Animal { // Classe filha ou subclasse

    void voar() {
        System.out.println("Voar");
    }
}

class Heranca {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.cor = "Preto";
        System.out.println("Cor do cachorro: " + cachorro.cor);
        cachorro.correr();
        cachorro.dormir();
        cachorro.latir();

        System.out.println("-------------------");

        Passaro passaro = new Passaro();
        passaro.cor = "Vermelho";
        System.out.println("Cor do pássaro: " + passaro.cor);
        passaro.correr();
        passaro.dormir();
        passaro.voar();

    }
}