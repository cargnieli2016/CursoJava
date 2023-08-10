
public class EstruturaCondicionais {
    public static void main(String[] args) {
        double compras = 299;
        byte idade = 55;

        boolean resultado = compras >= 300 && idade >= 50; // compras >= 300 || idade >= 18;

        if (resultado){
            System.out.println("Desconto de 30%");
        }else{
            System.out.println("Não tem desconto");
        }

        if (idade >= 18) {
            System.out.println("Pode entrar no App");
        } else {
            System.out.println("Não pode entrar no App");
        }

    }
}