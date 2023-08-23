// Inteface
abstract class Pessoa {
    String nome;
    int idade;
    void comer(){
        System.out.println("Comer");
    }
}
interface Presidente {
    void candidatarCargoPolitico();
}
class DesenvolvedorAndroid extends Pessoa {
    void programar(){}
}
class DesenvolvedorWeb extends Pessoa{

}

class Jornalista extends Pessoa implements Presidente{
    void escreverNoticia(){}

    @Override
    public void candidatarCargoPolitico() {
    }
}
class Interface {
    public static void main(String[] args) {
        DesenvolvedorWeb devAndroid = new DesenvolvedorWeb();
        //devAndroid.candidatarCargoPolitico();

        Jornalista jornalista = new Jornalista();
        jornalista.candidatarCargoPolitico();
        jornalista.comer();
    }
}