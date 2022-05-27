package Control;

import Model.Cliente;
import java.util.ArrayList;

public class ClienteControle 
{
    public boolean cadastrarCliente(String nomeCliente, String foneCliente, String cpfCliente) 
    {
        if(nomeCliente.isEmpty() || foneCliente.isEmpty() || cpfCliente.isEmpty())
        {
            return false;
        }
        else
        {
            Cliente cliente = new Cliente(nomeCliente, foneCliente, cpfCliente);
            cliente.cadastrar(cliente);
            return true;
        }
    }
    
    public ArrayList<Cliente> recuperarCliente()
    {
        Cliente cliente = new Cliente();
        return (cliente.recuperar());
    }
    
}
