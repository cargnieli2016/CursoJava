package While;

public class While {
    public static void main(String[] args) {

        System.out.println("USO DA ESTRUTURA WHILE");
        int contador = 1;
        while (contador <= 10) {
            System.out.println(contador);
            contador++;

        }

        System.out.println("");
        System.out.println("USO DA ESTRUTURA DO WHILE");
        char novoJogo;
        do {
            System.out.println("Deseja jogar novamente (s/n)?");
            novoJogo = 'n';
        } while (novoJogo == 's');
        System.out.println("GAME OVER");

    }
}
