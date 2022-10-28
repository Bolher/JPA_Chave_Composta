import br.edu.ifsp.pep.dao.PessoaDAO;
import br.edu.ifsp.pep.model.Pessoa;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws Exception {
        PessoaDAO pessoaDAO = new PessoaDAO();
        for (int i = 0; i < 10; i++) {
            Pessoa p = new Pessoa("pessoa"+i, new Date(), new BigDecimal(1000 * ++i));
            
            pessoaDAO.inserir(p);
        }
        
        List<Pessoa> pessoas = pessoaDAO.buscarPorNome("Pessoa");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
        
        pessoaDAO.remover(pessoas.get(0));
        //pessoaDAO.verificarEstadoDoCicloDeVida();
    }
    
    private static void testeNamedQueries() throws Exception{
       PessoaDAO pessoaDAO = new PessoaDAO();
        
        for (int i = 0; i < 10; i++) {
            Pessoa p = new Pessoa("pessoa"+i, new Date(), new BigDecimal(1000 * ++i));
            
            pessoaDAO.inserir(p);
        }
        
        Pessoa pessoaRetornada = pessoaDAO.buscarPorId(5);
        System.out.println(pessoaRetornada);
        
        List<Pessoa> pessoaRetornada1 = pessoaDAO.buscarPorNome("pessoa0");
        System.out.println(pessoaRetornada1);
        
        List<Pessoa> pessoaRetornada2 = pessoaDAO.buscarPorSalario(new BigDecimal(8000));
        System.out.println(pessoaRetornada2); 
    }
}
