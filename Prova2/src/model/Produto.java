package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
@NamedQueries( value = {
        @NamedQuery(name = "Produto.findByDescricao", 
                query = "SELECT p FROM Produto p WHERE UPPER(p.descricao) LIKE UPPER(:descricao)"),
    
        @NamedQuery(name = "Produto.findByValor", 
                query="SELECT p FROM Produto p where p.valor > :valor"),

})
public class Produto implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "descricao", length = 40, nullable = false)
    private String descricao;
    
    @Column(name = "valor", nullable = false)
    private double valor;
    
    @Column(name = "quantidade", nullable = false)
    private int quantidade;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto() {
    }

    public Produto(String descricao, double valor, int quantidade) {
        this.descricao = descricao;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", descricao=" + descricao + ", valor=" + valor + ", quantidade=" + quantidade + '}';
    }
    
    
}
