/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsp.pep.DAO;

import br.edu.ifsp.pep.model.Itens;
import br.edu.ifsp.pep.model.Venda;
import javax.persistence.EntityManager;

/**
 *
 * @author bolhe
 */
public class VendaDAO extends AbstractDAO<Venda>{

    @Override
    public void alterar(Venda entity) {
        super.alterar(entity); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

//    @Override
//    public void inserir(Venda venda) {
//        EntityManager em = getEntityManager();
//       
//       em.getTransaction().begin();
//       em.persist(venda);
//       
//        for (Itens item: venda.getItens()) {
//            em.persist(item);
//        }
//       
//       em.getTransaction().commit();
//       
//       em.close();
//    }

    @Override
    protected EntityManager getEntityManager() {
        return super.getEntityManager(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
