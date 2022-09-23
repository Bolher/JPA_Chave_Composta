package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.Veiculo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

/**
 *
 * @author aluno
 */
public class VeiculoDAO extends AbstractDAO<Veiculo> {

    public List<Veiculo> buscarTodos() {
        return getEntityManager()
                .createNamedQuery("Veiculo.buscarTodos", Veiculo.class)
                .getResultList();
    }

    @Override
    public void inserir(Veiculo veiculo) {

        EntityManager em = getEntityManager();
        em.getTransaction().begin();

        try {
            em.createNamedQuery("Veiculo.buscarPorPlacaECidade",
                    Veiculo.class)
                    .setParameter("placa", veiculo.getPlaca())
                    .setParameter("cidade", veiculo.getCidade())
                    .getSingleResult();
                    System.out.println("veiculo já existente com essa placa :" +veiculo.getPlaca() + "e essa cidade: "+ veiculo.getCidade());
        } catch (NoResultException nre) {
            em.persist(veiculo);
        }

        em.getTransaction().commit();
        em.close();
    }

}
