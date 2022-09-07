
import br.edu.ifsp.pep.dao.ContaCorrenteDAO;
import br.edu.ifsp.pep.dao.ContaPoupancaDAO;
import br.edu.ifsp.pep.model.ContaCorrente;
import br.edu.ifsp.pep.model.ContaPoupanca;
import java.math.BigDecimal;



public class Principal {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.setNumeroAgencia("1");
        cc.setNumeroConta("2");
        cc.setSaldo(new BigDecimal(5000));
        
        ContaCorrenteDAO contaCorrenteDAO= new ContaCorrenteDAO();
        contaCorrenteDAO.inserir(cc);
        
        ContaPoupanca cp = new ContaPoupanca();
        cp.setNumeroAgencia("03");
        cp.setNumeroConta("04");
        cp.setSaldo(new BigDecimal (1000));
        cp.setDiaAniversario(7);
        
        ContaPoupancaDAO contaPoupancaDAO = new ContaPoupancaDAO();
        contaPoupancaDAO.inserir(cp);
    }
}
