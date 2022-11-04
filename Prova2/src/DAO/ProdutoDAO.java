package DAO;

import br.edu.ifsp.pep.dao.AbstractDAO;
import java.util.List;
import javax.persistence.EntityManager;
import model.Produto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bolhe
 */
public class ProdutoDAO extends AbstractDAO<Produto>{

    @Override
    public void remover(Produto entity) {
        super.remover(entity); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void alterar(Produto entity) {
        super.alterar(entity); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void inserir(Produto entity) throws Exception {
        super.inserir(entity); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected EntityManager getEntityManager() {
        return super.getEntityManager(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    public List<Produto> findByDescricao(String descricao) {
        return getEntityManager()
                .createNamedQuery("Produto.findByDescricao", Produto.class)
                .setParameter("descricao", "%" + descricao + "%")
                .getResultList();
                
    }
    
    public List<Produto> findByValor(double valor) {
        return getEntityManager()
                .createNamedQuery("Produto.findByValor", Produto.class)
                .setParameter("valor",  valor)
                .getResultList();
                
    }
    
    
}
