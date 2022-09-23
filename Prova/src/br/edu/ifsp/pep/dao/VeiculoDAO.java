/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Veiculo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author bolhe
 */
public class VeiculoDAO extends AbstractDAO<Veiculo>{

    @Override
    public void remover(Veiculo entity) {
        super.remover(entity); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void alterar(Veiculo entity) {
        super.alterar(entity); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void inserir(Veiculo entity) {
        super.inserir(entity); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected EntityManager getEntityManager() {
        return super.getEntityManager(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public List<Veiculo> buscarDiponibilidadeParaLocacao(boolean numero){
        EntityManager em = getEntityManager();
        TypedQuery<Veiculo> query = em.createNamedQuery("Veiculo.buscarPorVeiculosDisponiveisParaLocacao",Veiculo.class);
        
        query.setParameter("alugado", numero);
        
        return query.getResultList();
    }

   
    
}
