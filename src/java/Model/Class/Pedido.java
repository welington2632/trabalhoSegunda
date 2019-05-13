
package Model.Class;

import java.util.Date;
import java.util.List;

public class Pedido {
    private int id;
    private float total;
    private Date data;
    private Cliente cliente;
    private List<Produto> produtos;

    public Pedido() {
    }

    public Pedido(int id, float total, Date data, Cliente cliente, List<Produto> produtos) {
        this.id = id;
        this.total = total;
        this.data = data;
        this.cliente = cliente;
        this.produtos = produtos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    
}
