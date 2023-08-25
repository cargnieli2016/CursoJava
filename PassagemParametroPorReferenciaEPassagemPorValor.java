// Passagem de Parâmetros
// Quanto o tipo é primitivo passa referencia do parametro como valor e objetos utiliza a própria referencia.

class Endereco {
    String rua;

}
class Usuario {
    void finalizarCompra(Endereco endereco){
        System.out.println("Antes: " + endereco.rua);
        endereco.rua = "Rua 02";
    }
}
class Scratch {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.rua = "Rua 01";

        Usuario usuario = new Usuario();
        usuario.finalizarCompra(endereco); // passando referencia do objeto
        System.out.println("Depois: " + endereco.rua);
    }
}




class Usuario1 {
    void finalizarCompra(String endereco){
        System.out.println("Antes: " + endereco);
        endereco = "Rua 02";
    }
}
class Scratch1 {
    public static void main(String[] args) {
        
        String endereco = "Rua 01";

        Usuario usuario = new Usuario();
        usuario.finalizarCompra(endereco); // passagem por valor do tipo primitivo (String)
        System.out.println("Depois: " + endereco);
    }
}