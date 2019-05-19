/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Class;

/**
 *
 * @author wmartins
 */
public abstract class Pessoa {
    private int cpf;
    private String nome;
    private Endereco endereco;

    public Pessoa(int id, String nome, Endereco endereco) {
        this.cpf = id;
        this.nome = nome;
        this.endereco = endereco;
    }

    public Pessoa() {
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int id) {
        this.cpf = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
}
