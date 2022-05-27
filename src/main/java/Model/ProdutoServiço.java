package Model;

import DAO.ProdutoServiçoDAO;
import java.util.ArrayList;

public class ProdutoServiço extends Produto
{
    private int qtde;
    private String dataUso;

    public ProdutoServiço(int qtde, String nomeProduto, int qtdeProduto, float valorProduto, String descriçaoProduto, String dataUso) 
    {
        super(nomeProduto, qtdeProduto, valorProduto, descriçaoProduto);
        this.qtde = qtde;
        this.dataUso = dataUso;
    }
    
    public ProdutoServiço() 
    {
        this.qtde = 0;
    }
    
    public void salvar(ProdutoServiço produtoServiço)
    {
        ProdutoServiçoDAO produtoserviçodao = new ProdutoServiçoDAO();
        produtoserviçodao.salvar(produtoServiço);
    }

    public void deletarProdutoServiço(int codProdutos)
    {
        ProdutoServiçoDAO produtoserviçodao = new ProdutoServiçoDAO();
        produtoserviçodao.deletar(codProdutos);
    }
    
    public ArrayList<ProdutoServiço> recuperarProdutoServiço()
    {
        ProdutoServiçoDAO produtoserviçodao = new ProdutoServiçoDAO();
        return(produtoserviçodao.recuperar());
    }
    
    public ArrayList<ProdutoServiço> produtosDoServiço(int codProdutos) 
    {
        ArrayList<ProdutoServiço> produtosdoserviço = new ArrayList();
        
        for(ProdutoServiço produtoserviço : this.recuperarProdutoServiço())
        {
            if(produtoserviço.getCodProduto() == codProdutos)
            {
                produtosdoserviço.add(produtoserviço);
            }
        }
        return(produtosdoserviço);
    }
    
    public int verificaCod()
    {
        int cod = 1;
        
        for(ProdutoServiço produtoserviço : this.recuperarProdutoServiço())
        {
            if(produtoserviço.getCodProduto() == cod)
            {
                cod++;
            }
        } 
        return(cod);
    }

    public int getQtde() 
    {
        return qtde;
    }

    public void setQtde(int qtde) 
    {
        this.qtde = qtde;
    }

    public String getDataUso() 
    {
        return dataUso;
    }

    public void setDataUso(String dataUso) 
    {
        this.dataUso = dataUso;
    }

    

}
