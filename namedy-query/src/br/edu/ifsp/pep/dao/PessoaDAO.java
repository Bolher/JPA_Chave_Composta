package br.edu.ifsp.pep.dao;


import br.edu.ifsp.pep.model.Pessoa;
import br.edu.ifsp.pep.model.Pessoa_;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class PessoaDAO extends AbstractDAO<Pessoa>{

    @Override
    public void alterar(Pessoa entity) {
        super.alterar(entity); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void inserir(Pessoa entity) {
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
        TypedQuery<Pessoa> query = em.createNamedQuery("Pessoa.buscraPorNome",Pessoa.class);
        
        query.setParameter("nome", "%"+nome +"%");
        
        return query.getResultList();
    }
    
    public List<Pessoa> buscarPorSalario(BigDecimal salario){
        EntityManager em = getEntityManager();
        TypedQuery<Pessoa> query = em.createNamedQuery("Pessoa.buscarPorSalario",Pessoa.class);
        
        query.setParameter("salario", salario);
        
        return query.getResultList();
    }
}
