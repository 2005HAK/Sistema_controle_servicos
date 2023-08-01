package Model;

import DAO.ServiçoDAO;
import java.util.ArrayList;

public class Serviço {

    private int codServiço;
    private Cliente cliente;
    private String data;
    private ArrayList<ProdutoServiço> produtosserviço;
    private String descriçao;
    private float valorServiço;
    private float valorTotal;

    public Serviço(Cliente cliente, String data, ArrayList<ProdutoServiço> produtosserviço, String descriçao, float valorServiço, float valorTotal) {
        this.cliente = cliente;
        this.data = data;
        this.produtosserviço = produtosserviço;
        this.descriçao = descriçao;
        this.valorServiço = valorServiço;
        this.valorTotal = valorTotal;
    }

    public Serviço() {
        this.cliente = null;
        this.data = null;
        this.produtosserviço = null;
        this.valorServiço = 0;
        this.valorTotal = 0;
    }

    public void salvarServiço(Serviço serviço) {
        new ServiçoDAO().salvar(serviço);
    }

    public ArrayList<Serviço> recuperarServiço() {
        return (new ServiçoDAO().recuperar());
    }

    public void atualizarServiço(Serviço serviço) {
        new ServiçoDAO().atualizar(serviço);
    }

    public void deletarServiço(int cod, int codProdutos) {
        new ServiçoDAO().deletar(cod);

        if (codProdutos != 0) {
            new ProdutoServiço().deletarProdutoServiço(codProdutos);
        }
    }

    public int getCodServiço() {
        return codServiço;
    }

    public void setCodServiço(int codServiço) {
        this.codServiço = codServiço;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ArrayList<ProdutoServiço> getProdutosserviço() {
        return produtosserviço;
    }

    public void setProdutosserviço(ArrayList<ProdutoServiço> produtosserviço) {
        this.produtosserviço = produtosserviço;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }

    public float getValorServiço() {
        return valorServiço;
    }

    public void setValorServiço(float valorServiço) {
        this.valorServiço = valorServiço;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
}
