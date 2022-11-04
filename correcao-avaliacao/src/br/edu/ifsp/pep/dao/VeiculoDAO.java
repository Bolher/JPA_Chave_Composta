package br.edu.ifsp.pep.dao;

import br.edu.ifsp.pep.modelo.TipoVeiculo;
import br.edu.ifsp.pep.modelo.Veiculo;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

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
    
    public List<Veiculo> buscarVeiculosDisponiveisParaLocacao() {
        return getEntityManager()
                .createNamedQuery("Veiculo.buscarDisponiveisParaLocacao", Veiculo.class)
                .getResultList();
    }
    
    public List<Veiculo> buscarModelo(String modelo) {
        return getEntityManager()
                .createNamedQuery("Veiculo.findByModelo", Veiculo.class)
                .setParameter("modelo", "%" + modelo + "%")
                .getResultList();
    }
    
    
    public List<Veiculo> buscarModeloTipo(String modelo, TipoVeiculo id) {
        return getEntityManager()
                .createNamedQuery("Veiculo.findByModeloAndTipo", Veiculo.class)
                .setParameter("modelo", "%" + modelo + "%")
                .setParameter("id", id)
                .getResultList();
    }
    
    public List<Veiculo> buscarTipo(TipoVeiculo id) {
        return getEntityManager()
                .createNamedQuery("Veiculo.findByTipo", Veiculo.class)
                .setParameter("id", id)
                .getResultList();
    }

    @Override
    public void inserir(Veiculo veiculo) throws Exception {

        EntityManager em = getEntityManager();
        em.getTransaction().begin();

        List<Veiculo> veiculos = em.createNamedQuery(
                "Veiculo.buscarPorPlacaECidade",
                Veiculo.class)
                .setParameter("placa", veiculo.getPlaca())
                .setParameter("cidade", veiculo.getCidade())
                .getResultList();
        if (veiculos == null || veiculos.isEmpty()) {
            em.persist(veiculo);
        } else {
            throw new Exception(
                    "Já existe um Veículo com a placa "
                    + veiculo.getPlaca()
                    + " na cidade " + veiculo.getCidade());
        }

        em.getTransaction().commit();
        em.close();
    }

}
