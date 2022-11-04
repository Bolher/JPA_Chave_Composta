
import model.Produto;
import DAO.ProdutoDAO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bolhe
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Produto produto = new Produto("Produto1",10,100);
        ProdutoDAO produtoDAO = new ProdutoDAO();
        
        try {
            produtoDAO.inserir(produto);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        Produto produto1 = new Produto("Produto2",15,100);
        try {
            produtoDAO.inserir(produto1);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
