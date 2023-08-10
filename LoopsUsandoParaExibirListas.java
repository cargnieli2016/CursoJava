class LoopsUsandoParaExibirListas {
    public static void main(String[] args) {
        String [] postagens = {
                "Fui à praia.",
                "Fazendo trilha.",
                "Viagem para o Nordeste.",
                "Estudando Java e Kotlin."
        };

        int numero = 0;
        while (numero < postagens.length){
            System.out.println(" - " + postagens[numero]);
            numero++;
        }


    }
}



    