
import br.edu.ifsp.pep.DAO.ProdutoDAO;
import br.edu.ifsp.pep.model.Produto;
import java.math.BigDecimal;

public class Principal {
    
    private static ProdutoDAO produtoDAO = new ProdutoDAO();
    
    public static void main(String[] args) {
       adicionarProdutos();
    }
    
    private static void adicionarProdutos(){
        for (int i = 0; i < 10; i++) {
            Produto p = new Produto("Produto"+i, i*10, new BigDecimal((i + 1) * 100));
            
            produtoDAO.inserir(p);
        }
    }
}
