package Model;

import DAO.ClienteDAO;
import java.util.ArrayList;

public class Cliente 
{
    private int codCliente;
    private String nomeCliente;
    private String foneCliente;
    private String cpfCliente;

    public Cliente(String nomeCliente, String foneCliente, String cpfCliente) 
    {
        this.nomeCliente = nomeCliente;
        this.foneCliente = foneCliente;
        this.cpfCliente = cpfCliente;
    }
    
    public Cliente() 
    {
        this.nomeCliente = null;
        this.foneCliente = null;
        this.cpfCliente = null;
    }
    
    public void cadastrar(Cliente cliente)
    {
        ClienteDAO clientedao = new ClienteDAO();
        clientedao.cadastrar(cliente);
    }
    
    public ArrayList<Cliente> recuperar()
    {
        ClienteDAO clientedao = new ClienteDAO();
        return (clientedao.recuperar());
    }

    public int getCodCliente() 
    {
        return codCliente;
    }

    public void setCodCliente(int codCliente) 
    {
        this.codCliente = codCliente;
    }

    public String getNomeCliente() 
    {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) 
    {
        this.nomeCliente = nomeCliente;
    }

    public String getFoneCliente() 
    {
        return foneCliente;
    }

    public void setFoneCliente(String foneCliente) 
    {
        this.foneCliente = foneCliente;
    }

    public String getCpfCliente() 
    {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) 
    {
        this.cpfCliente = cpfCliente;
    }
}
