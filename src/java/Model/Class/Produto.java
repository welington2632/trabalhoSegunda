
package Model.Class;


public class Produto {
    private int id;
    private String descricao;
    private float preco;
    private tipoProduto tipoProd;

    // Construtores
    public Produto() {
    }

    public Produto(int id, String descricao, float preco, tipoProduto tipoProd) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.tipoProd = tipoProd;
    }
    
    // Gets e Sets

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public tipoProduto getTipoProd() {
        return tipoProd;
    }

    public void setTipoProd(tipoProduto tipoProd) {
        this.tipoProd = tipoProd;
    }
    
    
}
