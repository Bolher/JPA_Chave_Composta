package br.edu.ifsp.pep.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name = "produto")
public class Produto implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private int id;
    
    @Column (name = "descricao", length = 45)
    private String descricao;
    
    @Column (name = "quantidade")
    private int quantidade;
    
    @Column (name = "preco", nullable = false, precision = 8, scale = 2)
    private BigDecimal preco;

    public Produto(String descricao, int quantidade, BigDecimal preco) {
        
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Produto() {
    }

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

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", descricao=" + descricao + ", quantidade=" + quantidade + ", preco=" + preco + '}';
    }
}
