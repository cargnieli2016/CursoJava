class LoopsDoWhileEFor {
    public static void main(String[] args) {

        // inicialização; condição; incremento
        for(int numero = 1; numero <= 5; numero++){
            System.out.println("Número: " + numero);
        }
        

        for (int i = 1; i < 6; i++) {
            System.out.println("Número: " + i);

        }

        // do -> Executa pelo menos uma vez.
        int numero = 1;
        do {
            System.out.println("Número: " + numero);
            numero++;
        }while (numero <= 5);

    }
}