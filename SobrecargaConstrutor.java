class Usuario {

    String email;
    String senha;

    // Assinatura de métodos: Nome + parametro e tipo
    Usuario(String email, String senha) {
        System.out.println("Autenticação por e-mail e senha. ");
    }


    Usuario(String telefone) {
        System.out.println("Autenticação por telefone. ");
    }

    void verificarUsuarioLogado() {
    }
    
}

class Scratch {
    public static void main(String[] args) {
        Usuario doni = new Usuario("doni@yahoo.com.br", "12345");
        Usuario carlos = new Usuario("11999999999");


    }
}