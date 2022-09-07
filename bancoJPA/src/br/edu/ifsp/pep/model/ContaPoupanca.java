package br.edu.ifsp.pep.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "conta poupanca")
@DiscriminatorValue("CONTA-POUPANCA")
public class ContaPoupanca extends ContaCorrente{
    
    @Column(name = "dia_aniversario", nullable = false)
    private int diaAniversario;

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    public ContaPoupanca() {
    }

    public ContaPoupanca(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }
}
