/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.model.Pessoa;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author bolhe
 */
public class PessoaDAO extends AbstractDAO<Pessoa>{

     @Override
    public void alterar(Pessoa entity) {
        super.alterar(entity); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void inserir(Pessoa entity) throws Exception {
        super.inserir(entity); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected EntityManager getEntityManager() {
        return super.getEntityManager(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public Pessoa buscarPorId(long id){
        EntityManager em = getEntityManager();
        TypedQuery<Pessoa> query = em.createNamedQuery("Pessoa.buscarPorId",Pessoa.class);
        
        query.setParameter("id", id);
        
        return query.getSingleResult();
    }
    
    public List<Pessoa> buscarPorNome(String nome){
        EntityManager em = getEntityManager();
        TypedQuery<Pessoa> query = em.createNamedQuery("Pessoa.buscarPorNome",Pessoa.class);
        
        query.setParameter("nome", "%"+nome +"%");
        
        return query.getResultList();
    }
    
    public List<Pessoa> buscarPorSalario(BigDecimal salario){
        EntityManager em = getEntityManager();
        TypedQuery<Pessoa> query = em.createNamedQuery("Pessoa.buscarPorSalario",Pessoa.class);
        
        query.setParameter("salario", salario);
        
        return query.getResultList();
    }
    
    public void remover(Pessoa p){
        EntityManager em = getEntityManager();
        em.getTransaction().begin();
        
        Pessoa merge = em.merge(p);
        em.merge(merge);
        em.remove(merge); //espera-se que ocorra um erro
        
        em.getTransaction().commit();
        em.close();
    }
    
    public void verificarEstadoDoCicloDeVida(){
        Pessoa p = new Pessoa("ANA",new Date(), new BigDecimal(5000));
        
        EntityManager em = getEntityManager();
        //verificas se i ibjeto p está no estado gerneciado (managed)
        System.out.println("está no estado gerenciado ?" +em.contains(p));
        
        //executa o métoddo persist do entity maneger
        //o onjeto deve ir para o estado gerenciado
        em.persist(p);
        
        
        //verificas se i ibjeto p está no estado gerneciado (managed)
        System.out.println("está no estado gerenciado ?" +em.contains(p));
        
        //remover o objeto p do estado gerenciado
        em.detach(p);
        
        //verificas se i ibjeto p está no estado gerneciado (managed)
        System.out.println("está no estado gerenciado ?" +em.contains(p));
    }
}
