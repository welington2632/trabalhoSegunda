/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Class;

import java.util.Date;

/**
 *
 * @author wmartins
 */
public class Cliente extends Pessoa{
    private int numeroDeCompras;
    private Date UltimaDataCompra;

    public Cliente(int numeroDeCompras, Date UltimaDataCompra, int id, String nome, Endereco endereco) {
        super(id, nome, endereco);
        this.numeroDeCompras = numeroDeCompras;
        this.UltimaDataCompra = UltimaDataCompra;
    }

    public Cliente() {
    }

    public int getNumeroDeCompras() {
        return numeroDeCompras;
    }

    public void setNumeroDeCompras(int numeroDeCompras) {
        this.numeroDeCompras = numeroDeCompras;
    }

    public Date getUltimaDataCompra() {
        return UltimaDataCompra;
    }

    public void setUltimaDataCompra(Date UltimaDataCompra) {
        this.UltimaDataCompra = UltimaDataCompra;
    }
    
    
}
