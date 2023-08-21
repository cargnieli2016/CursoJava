//Classe abstrata e Classe concreta

abstract class Animal { // Classe pai -> SUPER classe, CLASSE ABSTRATA (Não pode ser instanciada)
    String cor;
    int tamanho;
    int quantidadePatas;
    double peso;

    public Animal() { // Construtor vazio
    }

    public Animal(String cor, int tamanho, int qtdePatas, double peso) { // Construtor com parametros
        this.cor = cor;
        this.tamanho = tamanho;
        this.quantidadePatas = qtdePatas;
        this.peso = peso;
    }

    void correr() {
        System.out.println("Correndo como um ");
    }

    void dormir() {
        System.out.println("Dormindo");
    }
}

class Cachorro extends Animal { // Classe filha ou subclasse, CLASSE CONCRETA

    // Atributos específicos para o cachorro

    // Construtor
    public Cachorro() { // Construtor vazio

    }

    public Cachorro(String cor, int tamanho, int qtdePatas, double peso) { //
        super(cor, tamanho, qtdePatas, peso);
    }

    void latir() {
        System.out.println("Latir");
    }

    //Sobrecarga de método
    void latir(String pessoa) {
        System.out.println("Latir para " + pessoa);
    }

    // Sobrescrita de método -> Sobreposição
    @Override
    // Sobrescrito da classe pai
    void correr() {
        super.correr(); // Implementação padrão
        System.out.println("Cachorro com " + this.quantidadePatas + " patas.");
    }
}

class Passaro extends Animal { // Classe filha ou subclasse, CLASSE CONCRETA
    public Passaro() { // Construtor vazio
    }

    public Passaro(String cor, int tamanho, int qtdePatas, double peso) { // Construtor com parametros
        super(cor, tamanho, qtdePatas, peso);
    }

    void voar() {
        System.out.println("Voando");
    }

    // Sobrescrito da classe pai
    @Override
    void correr() {
        super.correr();
        System.out.println("Pássaro utilizando as asas e com " + this.quantidadePatas + " patas.");
    }
}

class ClasseAbstrataEConcrecta {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Preto", 8, 4, 55);
        cachorro.correr();

    }
}


