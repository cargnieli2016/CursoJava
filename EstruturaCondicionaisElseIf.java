public class EstruturaCondicionaisElseIf {
    public static void main(String[] args) {
        double compras = 400;

        if (compras <= 200){
            System.out.println("Não tem desconto");
        } else if (compras >= 201 && compras <=400) {
            System.out.println("Desconto de 20%");
        } else if (compras >= 401 && compras <= 800) {
            System.out.println("Desonto de 30%");
        }else if(compras >= 801){
            System.out.println("Desconto de 40%");
        }
    }
}