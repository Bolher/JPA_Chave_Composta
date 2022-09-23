
import br.edu.ifsp.pep.dao.VeiculoDAO;
import br.edu.ifsp.pep.modelo.Carro;
import br.edu.ifsp.pep.modelo.Moto;
import br.edu.ifsp.pep.modelo.Van;
import br.edu.ifsp.pep.modelo.Veiculo;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bolhe
 */
public class Principal {
    
    
    public static void verificarMoto(Moto m){
        List<Moto> listaMoto = new ArrayList<>();
        listaMoto.add(m);
        VeiculoDAO veiculoDAO = new VeiculoDAO();
        for (Moto moto : listaMoto) {
            if(m.getPlaca().equals(moto.getPlaca()) && m.getCidade().equals(moto.getCidade())){
                System.out.println("a moto nao pode ser enserido pois já algum carro com essa mesma placa e cidade");
            }else{
                veiculoDAO.inserir(moto);
            }
        }
    }
    
    public static void verificarVan(List<Van> van, Van v){

        VeiculoDAO veiculoDAO = new VeiculoDAO();
        for (Van van1 : van) {
            if(v.getPlaca().equals(van1.getPlaca()) && v.getCidade().equals(van1.getCidade())){
                System.out.println("a van não pode ser enserido pois já algum carro com essa mesma placa e cidade");
            }else{
                veiculoDAO.inserir(van1);
            }
        }
        
        
    }
    
    public static void alugar(List<Veiculo> lista){
        double total = 0;
        for (Veiculo veiculo : lista) {
            
            veiculo.setAlugado(true);
            
            if(veiculo instanceof Carro){
                total += 100;
            }else if(veiculo instanceof Moto){
                total += 50;
            }else if(veiculo instanceof Van){
                total +=150;
            }
        }
        
        System.out.println("o valro da locacao eh de : "+total);
    }
    
    public static void disponivel(){
        VeiculoDAO veiculoDAO = new VeiculoDAO();
        
        List<Veiculo> pessoaRetornada1 = veiculoDAO.buscarDiponibilidadeParaLocacao(false);
        System.out.println(pessoaRetornada1);
    }
    
    public static void devolucao(List<Veiculo> v, int dataDevolucao, String placa, String cidade){
        Veiculo aux = null;
        for (Veiculo veiculo : v) {
            if(veiculo.getPlaca().equals(placa) && veiculo.getCidade().equals(cidade)){
                aux = veiculo;
            }
        }
        aux.setAlugado(false);
        if(aux.getDataDevolucao() < dataDevolucao){
            System.out.println("tera que pagar uma multa no valor de 500 reais");
        }else{
            System.out.println("veiculo devolvido com sucesso");
        }
    }
    
    public static void main(String[] args) {
        Carro c = new Carro();
        Moto m = new Moto();
        Van v = new Van();
        VeiculoDAO veiculoDAO = new VeiculoDAO();
        List<Van> listaVan = new ArrayList<>();
        List<Carro> listaCarro = new ArrayList<>();
        List<Moto> listaMoto = new ArrayList<>();
        List<Veiculo> alugar = new ArrayList<>();
        
        c.setPlaca("abc-1234");
        c.setModelo("fusca");
        c.setCidade("epitacio");
        c.setAnoFabricacao(1970);
        c.setDataDevolucao(9);
        listaCarro.add(c);
        veiculoDAO.inserir(c);
        alugar.add(c);
        
        
        c.setPlaca("efg-9087");
        c.setModelo("palio");
        c.setCidade("epitacio");
        c.setAnoFabricacao(1990);
        c.setDataDevolucao(9);
        veiculoDAO.inserir(c);
        
        
        m.setPlaca("tyr-9098");
        m.setModelo("cg");
        m.setCidade("epitacio");
        m.setAnoFabricacao(1981);
        m.setDataDevolucao(9);
        veiculoDAO.inserir(m);
       
        
        m.setPlaca("hgf-6543");
        m.setModelo("yamaha");
        m.setCidade("epitacio");
        m.setAnoFabricacao(2008);
        m.setDataDevolucao(9);
        veiculoDAO.inserir(m);
        alugar.add(m);
        
        
        v.setPlaca("kjh-1234");
        v.setModelo("van1");
        v.setCidade("epitacio");
        v.setAnoFabricacao(2011);
        v.setDataDevolucao(9);
        listaVan.add(v);
        veiculoDAO.inserir(v);
        
        
        v.setPlaca("gfc-6789");
        v.setModelo("van2");
        v.setCidade("epitacio");
        v.setAnoFabricacao(2020);
        v.setDataDevolucao(9);
        veiculoDAO.inserir(v);
        
        alugar(alugar);
        
        //disponivel();
        
        devolucao(alugar, 2, "abc-1023", "epitacio");
    
    }
}
