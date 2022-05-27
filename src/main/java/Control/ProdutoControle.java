package Control;

import Model.Produto;
import java.util.ArrayList;

public class ProdutoControle 
{
    public int cadastrar(String nomeProduto, String qtdeProduto, String valorProduto, String descriçaoProduto, String codProduto)
    {
        if(nomeProduto.isEmpty() || qtdeProduto.isEmpty() || valorProduto.isEmpty() || descriçaoProduto.isEmpty())
        {
            return 1;
        }
        else
        {
            if(codProduto.isEmpty())
            {
                codProduto = "0";
            }
            
            int cont = 0;
            
            for(Produto produto : listarProdutos())
            {
                if(produto.getNomeProduto().equals(nomeProduto) || produto.getCodProduto() == Integer.parseInt(codProduto))
                {
                    cont ++;
                }    
            }
            if(cont == 0)
            {
                Produto produto = new Produto(nomeProduto, Integer.parseInt(qtdeProduto), Float.parseFloat(valorProduto), descriçaoProduto);
                produto.cadastrar(produto);
                return 2;
            }
            else
            {
                return 3;
            }
        }
    }
    
    public ArrayList<Produto> listarProdutos()
    {
        Produto produto = new Produto();
        return (produto.recuperar());
    }

    public boolean atualizarProduto(String codProduto, String nomeProduto, String qtdeProduto, String valorProduto, String descriçaoProduto) 
    {
        if(nomeProduto.isEmpty() || qtdeProduto.isEmpty() || valorProduto.isEmpty() || descriçaoProduto.isEmpty())
        {
            return false;
        }
        else
        {
            Produto produto = new Produto(nomeProduto, Integer.parseInt(qtdeProduto), Float.parseFloat(valorProduto), descriçaoProduto);
            produto.setCodProduto(Integer.parseInt(codProduto));
            produto.atualizar(produto);
            return true;
        }
    }
    
    public void excluirProduto(String codProduto)
    {
        Produto produto = new Produto();
        produto.setCodProduto(Integer.parseInt(codProduto));
        produto.deletar(produto);
    }
}
