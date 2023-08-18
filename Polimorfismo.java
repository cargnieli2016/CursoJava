class Animal { // Classe pai ou Super Classe
    String cor;
    int tamanho;
    int quantidadePatas;
    double peso;

    void correr() {
        System.out.println("Correr como um ");
    }

    void dormir() {
        System.out.println("Dormir");
    }
}

class Cachorro extends Animal { // Classe filha ou subclasse

    void latir() {
        System.out.println("Latir");
    }

    //Sobrecarga de método
    void latir(String pessoa) {
        System.out.println("Latir para " + pessoa);
    }

    // Sobrescrita de método -> Sopreposição
    @Override
    // Sobrescrito da classe pai
    void correr() {
        super.correr(); // Implementação padrão
        System.out.println("cachorro com " + this.quantidadePatas + " patas.");

    }
}
class Passaro extends Animal { // Classe filha ou subclasse

    void voar() {
        System.out.println("Voar");
    }

    @Override
        // Sobrescrito da classe pai
    void correr() {
        super.correr(); // Implementação padrão
        System.out.println("pássaro utilizando as asas e com " + this.quantidadePatas + " patas.");
    }
}
class Polimorfismo {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.cor = "preto";
        System.out.println("Cor do cachorro: " + cachorro.cor);
        cachorro.latir();
        cachorro.latir("Fifi");
        cachorro.quantidadePatas = 4;
        cachorro.correr();
        cachorro.dormir();
        cachorro.latir();

        System.out.println("-------------------");

        Passaro passaro = new Passaro();
        passaro.cor = "azul";
        passaro.quantidadePatas = 2;
        passaro.cor = "Vermelho";
        System.out.println("Cor do pássaro: " + passaro.cor);
        passaro.correr();
        passaro.dormir();
        passaro.voar();

    }
}

