//Percorrendo um Array

public class PercorrendoArray {
    
    public static void main(String[] args) {

        String[] pessoas = {"Maria", "João", "Francisca", "Benedito"};

        for (String nomes : pessoas) {
            System.out.println(nomes);
        }
        
        
        System.out.println(" ");
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println(pessoas[i]);
        }
    }
}