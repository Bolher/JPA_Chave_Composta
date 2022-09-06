
import br.edu.ifsp.pep.dao.ContaCorrenteDAO;
import br.edu.ifsp.pep.model.ContaCorrente;
import java.math.BigDecimal;



public class Principal {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.setNumeroAgencia("1");
        cc.setNumeroConta("2");
        cc.setSaldo(new BigDecimal(5000));
        
        ContaCorrenteDAO contaCorrenteDAO= new ContaCorrenteDAO();
        contaCorrenteDAO.inserir(cc);
        
        
    }
}
