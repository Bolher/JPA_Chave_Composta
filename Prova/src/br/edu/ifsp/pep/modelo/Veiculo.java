/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author bolhe
 */
@Entity
@Table(name = "veiculo")
@IdClass(VeiculoPK.class)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@NamedQueries({
    @NamedQuery(name = "Veiculo.buscarPorVeiculosDisponiveisParaLocacao", query = "SELECT v FROM Veiculo v WHERE v.alugado = :alugado"),

})
public abstract class Veiculo implements Serializable{
    @Id
    @Column(name = "numero_placa")
    private String placa;
    
    @Id
    @Column(name = "cidade")
    private String cidade;
    
    @Column(name = "modelo")
    private String modelo;
    
    @Column(name = "ano_fabricacao")
    private int anoFabricacao;
    
    @Column(name = "alugado")
    private boolean alugado = false;

    @Column(name = "data_locacao")
    private int dataDevolucao;

    public Veiculo(String placa, String cidade, String modelo, int anoFabricacao, boolean alugado, int dataDevolucao) {
        this.placa = placa;
        this.cidade = cidade;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.alugado = alugado;
        this.dataDevolucao = dataDevolucao;
    }
    
    public Veiculo() {
        
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public int getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(int dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String toString() {
        return "Veiculo{" + "placa=" + placa + ", cidade=" + cidade + ", modelo=" + modelo + ", anoFabricacao=" + anoFabricacao + ", alugado=" + alugado + ", dataLocacao=" + dataDevolucao + '}';
    }
    
    

   
    
      
    
}
