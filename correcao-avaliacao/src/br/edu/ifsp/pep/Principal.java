package br.edu.ifsp.pep;

import br.edu.ifsp.pep.dao.ClienteDAO;
import br.edu.ifsp.pep.dao.LocacaoDAO;
import br.edu.ifsp.pep.dao.TipoVeiculoDAO;
import br.edu.ifsp.pep.dao.VeiculoDAO;
import br.edu.ifsp.pep.modelo.Cliente;
import br.edu.ifsp.pep.modelo.Locacao;
import br.edu.ifsp.pep.modelo.TipoVeiculo;
import br.edu.ifsp.pep.modelo.Veiculo;
import br.edu.ifsp.pep.modelo.VeiculoLocado;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author aluno
 */
public class Principal {

    private static VeiculoDAO veiculoDAO = new VeiculoDAO();
    private static TipoVeiculoDAO tipoVeiculoDAO = new TipoVeiculoDAO();
    private static ClienteDAO clientedao = new ClienteDAO();
    private static LocacaoDAO locacaoDAO = new LocacaoDAO();

    public static void main(String[] args) {
        adicionarVeiculos();
    }
    
    private static void adicionarCliente(){
        for (int i = 0; i < 10; i++) {
            try{
                clientedao.inserir(new Cliente("cliente" + i));
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
    }
    
    private static void locarVeiculo(){
        //localizar cliente
        Cliente cliente = clientedao.findById(1);
        //localizar veiculo
        List<Veiculo> veiculos = veiculoDAO.buscarTodos();
        //criar um objeto do tipo locado
        List<VeiculoLocado> veiculosLocado = new ArrayList<>();
        VeiculoLocado veiculoLocado = new VeiculoLocado(veiculo);
        
        veiculosLocado.add(veiculoLocado);
        Locacao locacao = new Locacao(new Date(), cliente);
       
    }

    private static void adicionarVeiculos() {

        TipoVeiculo tipoCarro = new TipoVeiculo("Carro", new BigDecimal(100));
        TipoVeiculo tipoMoto = new TipoVeiculo("Moto", new BigDecimal(80));
        TipoVeiculo tipoVan = new TipoVeiculo("Van", new BigDecimal(250));
        
        try{
            tipoVeiculoDAO.inserir(tipoCarro);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        try{
            tipoVeiculoDAO.inserir(tipoMoto);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        try{
            tipoVeiculoDAO.inserir(tipoVan);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        tipoVeiculoDAO.inserir(tipoCarro);
        tipoVeiculoDAO.inserir(tipoMoto);
        tipoVeiculoDAO.inserir(tipoVan);

        Veiculo veiculo1 = new Veiculo("ABC-1234", "P. Epitácio",
                "Gol 1.0", 2010, tipoCarro);
        Veiculo veiculo2 = new Veiculo("ABC-4565", "P. Epitácio",
                "Corola", 2020, tipoCarro);
        
        try{
            veiculoDAO.inserir(veiculo1);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        try{
            veiculoDAO.inserir(veiculo2);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        veiculoDAO.inserir(veiculo1);
        veiculoDAO.inserir(veiculo2);

        Veiculo veiculo3 = new Veiculo("ABC-0000", "P. Epitácio",
                "Moto XX", 2020, tipoMoto);
        Veiculo veiculo4 = new Veiculo("ABC-0000", "P. Epitácio",
                "Moto YY", 2022, tipoMoto);
        
        try{
            veiculoDAO.inserir(veiculo3);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        try{
            veiculoDAO.inserir(veiculo4);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        veiculoDAO.inserir(veiculo3);
        veiculoDAO.inserir(veiculo4);
        
        Veiculo veiculo5 = new Veiculo("ABC-2222", "P. Epitácio",
                "VAN XX", 2020, tipoVan);
        Veiculo veiculo6 = new Veiculo("ABC-3333", "P. Epitácio",
                "VAN YY", 2022, tipoVan);
        
        try{
            veiculoDAO.inserir(veiculo5);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        try{
            veiculoDAO.inserir(veiculo6);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        veiculoDAO.inserir(veiculo5);
        veiculoDAO.inserir(veiculo6);
    }

}
