package br.edu.ifro.control;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.edu.ifro.model.Produto;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * FXML Controller class
 *
 * @author 04014985229
 */
public class ProdutoController implements Initializable {

    @FXML
    private TextField txtcodigo;
    @FXML
    private TextField txtprecovenda;
    @FXML
    private TextField txtnomedoproduto;
    @FXML
    private TextField txtfornecedor;
    @FXML
    private TextField txtprecocompra;
    @FXML
    private Button btnBuscarfoto;
    @FXML
    private Button btnAdicionar;
    @FXML
    private Button btncadastrar;
    @FXML
    private Button btnVoltar;
    @FXML
    private Button btnLimpar;
    @FXML
    private DatePicker txtdata;
    @FXML
    private TextField txtdescricaodoproduto;
    @FXML
    private Button btnsalvar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buscar(ActionEvent event) {
    }

    @FXML
    private void adicionar(ActionEvent event) {
    }

  
    @FXML
    private void cadastrar(ActionEvent event) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();
        Produto cadProd = new Produto ();
        cadProd.setId(Integer.parseInt(txtcodigo.getText()));
        cadProd.setNome_produto(txtnomedoproduto.getText());
        cadProd.setDescricao(txtdescricaodoproduto.getText());
        cadProd.setPreco_compra(Double.parseDouble(txtprecocompra.getText()));
        cadProd.setPreco_venda(Double.parseDouble(txtprecovenda.getText()));
        cadProd.setFornecedor(txtfornecedor.getText());
        em.getTransaction().begin();
        em.persist(cadProd);
        em.getTransaction().commit();
    }

    @FXML
    private void voltar(ActionEvent event) {
        Stage stage = (Stage) btnVoltar.getScene().getWindow(); stage.close();
    }

    @FXML
    private void limpar(ActionEvent event) {
    txtcodigo.setText("");
    txtprecovenda.setText("");
    txtnomedoproduto.setText("");
    txtdescricaodoproduto.setText("");
    txtfornecedor.setText("");
    txtprecocompra.setText("");
    }
    
    @FXML
    private void salvar(ActionEvent event) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager ();
        
        Produto produto = new Produto();
        

        produto.setId(Integer.parseInt(txtcodigo.getText()));
        produto.setNome_produto(txtnomedoproduto.getText());
        produto.setDescricao(txtdescricaodoproduto.getText());
        produto.setFornecedor(txtfornecedor.getText());
        produto.setPreco_compra(Double.parseDouble(txtprecocompra.getText()));
        produto.setPreco_venda(Double.parseDouble(txtprecovenda.getText()));

    }
    
}
