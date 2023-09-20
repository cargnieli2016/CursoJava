public class OperadoresDecremento {
    public static void main(String[] args) {
        int limiteTentativasLogin = 10;

        //limiteTentativasLogin --; // pós fixado

        int novoLimiteTentativasLogin = --limiteTentativasLogin; // pré fixada



        System.out.println("Limite de tentativas de login: " + limiteTentativasLogin);
        System.out.println("Novo limite de tentativas de login: " + novoLimiteTentativasLogin);
    }
}
