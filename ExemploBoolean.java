public class ExemploBoolean {
    public static void main(String[] args) {
        int quantidadeEstoque =10;
        int quantidadePedidoCompra = 9;

        boolean estoqueSuficiente = quantidadeEstoque >= quantidadePedidoCompra;
        System.out.println("Estoque suficiente?: " + estoqueSuficiente);
    }
}