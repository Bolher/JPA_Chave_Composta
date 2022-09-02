/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.DAO;

import br.edu.ifsp.pep.model.Produto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author bolhe
 */
public class ProdutoDAO extends AbstractDAO<Produto>{

    @Override
    public void alterar(Produto entity) {
        super.alterar(entity); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void inserir(Produto entity) {
        super.inserir(entity); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected EntityManager getEntityManager() {
        return super.getEntityManager(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public List<Produto> obterTodos(){
        TypedQuery<Produto> query = getEntityManager().createQuery("SELECT p FROM Produto p", Produto.class);
        
        return query.getResultList();
    }
    
}
