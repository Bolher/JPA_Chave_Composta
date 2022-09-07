package br.edu.ifsp.pep.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name = "conta corrente")
@IdClass(ContaCorrenteaPK.class)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorValue(value = "CONTA CORRENTE")
public class ContaCorrente implements Serializable{
    @Id
    @Column (name = "numero_conta", nullable = false)
    private String numeroConta;
    
    @Id
    @Column (name = "numero_agencia", nullable = false)
    private String NumeroAgencia;
    
    @Column (name = "saldo",precision = 8, scale = 2)
    private BigDecimal saldo;

    public ContaCorrente(String numeroConta, String NumeroAgencia, BigDecimal saldo) {
        this.numeroConta = numeroConta;
        this.NumeroAgencia = NumeroAgencia;
        this.saldo = saldo;
    }

    public ContaCorrente() {
    }
    
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNumeroAgencia() {
        return NumeroAgencia;
    }

    public void setNumeroAgencia(String NumeroAgencia) {
        this.NumeroAgencia = NumeroAgencia;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    } 
}
