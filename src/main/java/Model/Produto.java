package Model;

import DAO.ProdutoDAO;
import java.util.ArrayList;

public class Produto {

    private int codProduto;
    private String nomeProduto;
    private int qtdeProduto;
    private float valorProduto;
    private String descriçaoProduto;

    public Produto(String nomeProduto, int qtdeProduto, float valorProduto, String descriçaoProduto) {
        this.nomeProduto = nomeProduto;
        this.qtdeProduto = qtdeProduto;
        this.valorProduto = valorProduto;
        this.descriçaoProduto = descriçaoProduto;
    }

    public Produto() {
        this.nomeProduto = "";
        this.qtdeProduto = 0;
        this.valorProduto = 0;
        this.descriçaoProduto = "";
    }

    public void cadastrar(Produto produto) {
        new ProdutoDAO().cadastrar(produto);
    }

    public ArrayList<Produto> recuperar() {
        return (new ProdutoDAO().recuperar());
    }

    public void atualizar(Produto produto) {
        new ProdutoDAO().atualizar(produto);
    }

    public void deletar(Produto produto) {
        new ProdutoDAO().apagar(produto);
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQtdeProduto() {
        return qtdeProduto;
    }

    public void setQtdeProduto(int qtdeProduto) {
        this.qtdeProduto = qtdeProduto;
    }

    public float getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(float valorProduto) {
        this.valorProduto = valorProduto;
    }

    public String getDescriçaoProduto() {
        return descriçaoProduto;
    }

    public void setDescriçaoProduto(String descriçaoProduto) {
        this.descriçaoProduto = descriçaoProduto;
    }
}
