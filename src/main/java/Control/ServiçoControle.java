package Control;

import Model.Cliente;
import Model.Produto;
import Model.ProdutoServiço;
import Model.Serviço;
import java.util.ArrayList;

public class ServiçoControle 
{  
    //verifica se o cliente ja existe, e se não e possuir dados suficientes, cria um cliente 
    public Cliente verificaCliente(String nomeCliente, String foneCliente, String cpfCliente) 
    {            
        Cliente retorno;
 
        retorno = this.clientesCadastrados(nomeCliente, foneCliente, cpfCliente);

        if(retorno == null)
        {
            if(nomeCliente.isEmpty() || foneCliente.isEmpty() || cpfCliente.isEmpty())
            {
                retorno = null;
            }
            else
            {
                Cliente cliente = new Cliente(nomeCliente, foneCliente, cpfCliente);
                cliente.cadastrar(cliente);
                retorno = this.clientesCadastrados(nomeCliente, foneCliente, cpfCliente);
            }
            
        }
        return (retorno);
    }
    //verifica os clientes ja cadastrados no BD
    private Cliente clientesCadastrados(String nomeCliente, String foneCliente, String cpfCliente)
    {
        Cliente Cliente = null;
        ClienteControle clientecontrole = new ClienteControle();
        
        for(Cliente cliente : clientecontrole.recuperarCliente())
        {
            if(cliente.getNomeCliente().equals(nomeCliente) || cliente.getFoneCliente().equals(foneCliente) || cliente.getCpfCliente().equals(cpfCliente))
            {
                Cliente = cliente;
            }
        }
        
        return (Cliente);
    }

    public void atualizaServiços(Cliente cliente, String data, ArrayList<ProdutoServiço> produtosserviço, int codProdutos, String descriçaoServiço, String valorServiço, String valorTotal)
    {
        ProdutoServiço produtoserviço = new ProdutoServiço();
        
        if(produtosserviço.isEmpty())
        {
            produtoserviço.setCodProduto(0);
            produtosserviço.add(produtoserviço);
        }
        else
        {
            int linha = 0;
            
            for(ProdutoServiço produtoServiço : produtosserviço)
            {
                this.atualizarProduto(produtoServiço);
                produtoServiço.setDataUso(data);
                produtoServiço.setCodProduto(codProdutos);
                produtoServiço.salvar(produtoServiço);
                produtosserviço.set(linha, produtoServiço);
                linha++;
            }
        }
        
        Serviço serviço = new Serviço(cliente, data, produtosserviço, descriçaoServiço, Float.parseFloat(valorServiço), Float.parseFloat(valorTotal));
        serviço.atualizarServiço(serviço);
    }
    
    public boolean salvar(Cliente cliente, String data, ArrayList<ProdutoServiço> produtosserviço, String descriçaoServiço, String valorServiço, String valorTotal) 
    {
        if(data.isEmpty() || valorServiço.isEmpty())
        {
            return false;
        }
        else
        {
            ProdutoServiço produtoserviço = new ProdutoServiço();

            int linha = 0;
            
            if(produtosserviço.isEmpty())
            {
                produtoserviço.setCodProduto(0);
                produtosserviço.add(produtoserviço);
            }
            else
            {
                int cod = produtoserviço.verificaCod();
                
                for(ProdutoServiço produtoServiço : produtosserviço)
                {
                    this.atualizarProduto(produtoServiço);
                    produtoServiço.setDataUso(data);
                    produtoServiço.setCodProduto(cod);
                    produtoServiço.salvar(produtoServiço);
                    produtosserviço.set(linha, produtoServiço);
                    linha++;
                }
            }
            
            Serviço serviço = new Serviço(cliente, data, produtosserviço, descriçaoServiço, Float.parseFloat(valorServiço), Float.parseFloat(valorTotal));
            serviço.salvarServiço(serviço);
            
            return true;
        }
    }
    
    public ArrayList<Serviço> recuperar()
    {
        Serviço serviços = new Serviço();
        return(serviços.recuperarServiço());
    }

    private void atualizarProduto(ProdutoServiço produtoServiço) 
    {
        Produto produto = new Produto(produtoServiço.getNomeProduto(), (produtoServiço.getQtdeProduto() - produtoServiço.getQtde()), (produtoServiço.getValorProduto()/produtoServiço.getQtde()), produtoServiço.getDescriçaoProduto());
        produto.setCodProduto(produtoServiço.getCodProduto());
        produto.atualizar(produto);
    }
    
    public void deletarServiço(int cod, int codProdutos)
    {
        Serviço serviço = new Serviço();
        serviço.deletarServiço(cod, codProdutos);
    }
}
