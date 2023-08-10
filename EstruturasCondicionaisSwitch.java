public class EstruturasCondicionaisSwitch {
    public static void main(String[] args) {

        int opção = 4;

        switch (opção){
            case 1:
                System.out.println("Saldo Atual");
                break;
            case 2:
                System.out.println("Extrato");
                break;
            case 3:
                System.out.println("Cartões de crédito");
                break;
            default:
                System.out.println("Opção inválida");
        }

    }
}