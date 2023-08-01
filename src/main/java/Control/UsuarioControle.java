package Control;

import Model.Usuario;
import java.util.ArrayList;

public class UsuarioControle {

    public int cadastrar(String nome, String email, String fone, String senha, String confirma, String administrador) {
        if (nome.isEmpty() || email.isEmpty() || fone.isEmpty() || senha.isEmpty() || confirma.isEmpty() || administrador.isEmpty()) {
            return 1;
        } else if (senha.equals(confirma)) {
            Usuario listausuarios = new Usuario();
            if (listausuarios.entrar().get(0).getSenha().equals(administrador) || listausuarios.entrar().get(1).getSenha().equals(administrador)) {
                int verifica = 0;

                for (Usuario usuario : entrar()) {
                    if (usuario.getNome().equals(nome)) {
                        verifica++;
                    }
                }
                if (verifica == 0) {
                    Usuario usuario = new Usuario(nome, email, fone, senha);
                    usuario.cadastrarUsuario(usuario);
                    return 3;
                } else {
                    return 5;
                }
            } else {
                return 4;
            }
        } else {
            return 2;
        }
    }

    public ArrayList<Usuario> entrar() {
        return (new Usuario().entrar());
    }
}
