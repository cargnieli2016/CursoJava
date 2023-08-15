// Sobrecarga de métodos
class Usuario {
    String email;
    String senha;

    
    // Métodos
    void logar(String email, String senha) {
        System.out.println("Autenticação com e-mail e senha. ");
    }

    void logar(String telefone) {
        System.out.println("Autenticação com telefone ");
    }

    void verificarUsuarioLogado() {
    }

}

class Scratch {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        usuario.logar("doni@gmail.com", "199999");
        usuario.logar("11999999999");

    }
}
