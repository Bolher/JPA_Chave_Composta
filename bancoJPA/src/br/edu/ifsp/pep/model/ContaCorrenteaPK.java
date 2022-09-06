package br.edu.ifsp.pep.model;

import java.io.Serializable;
import java.util.Objects;


public class ContaCorrenteaPK implements Serializable{
    private String numeroConta;
    private String NumeroAgencia;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.numeroConta);
        hash = 47 * hash + Objects.hashCode(this.NumeroAgencia);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ContaCorrenteaPK other = (ContaCorrenteaPK) obj;
        if (!Objects.equals(this.numeroConta, other.numeroConta)) {
            return false;
        }
        return Objects.equals(this.NumeroAgencia, other.NumeroAgencia);
    }
}
