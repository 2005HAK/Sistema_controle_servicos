package Model;

import DAO.UsuarioDAO;
import java.util.ArrayList;

public class Usuario 
{
    private int cod;
    private String nome;
    private String email;
    private String fone;
    private String senha;

    public Usuario(String nome, String email, String fone, String senha) 
    {
        this.nome = nome;
        this.email = email;
        this.fone = fone;
        this.senha = senha;
    }
    
    public Usuario() 
    {
        this.nome = null;
        this.email = null;
        this.fone = null;
        this.senha = null;
    }
    
    public void cadastrarUsuario(Usuario usuario)
    {
        UsuarioDAO usuariodao = new UsuarioDAO();
        usuariodao.cadastrar(usuario);
    }
    
    public ArrayList<Usuario> entrar()
    {
        UsuarioDAO usuariodao = new UsuarioDAO();
        return (usuariodao.recuperar());        
    }
    
    public int getCod()
    {
        return cod;
    }
    
    public void setCod(int cod)
    {
        this.cod = cod;
    }

    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getSenha() 
    {
        return senha;
    }

    public void setSenha(String senha)
    {
        this.senha = senha;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getFone() 
    {
        return fone;
    }

    public void setFone(String fone) 
    {
        this.fone = fone;
    }
    
}
