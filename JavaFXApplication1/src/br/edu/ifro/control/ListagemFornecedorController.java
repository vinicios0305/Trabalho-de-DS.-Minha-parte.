/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import br.edu.ifro.model.Fornecedor;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * FXML Controller class
 *
 * @author thiag
 */
public class ListagemFornecedorController implements Initializable {

    @FXML
    private TableView<?> tbFornecedor;
    @FXML
    private TableColumn<?, ?> tbID;
    @FXML
    private TableColumn<?, ?> tbCNPJ;
    @FXML
    private TableColumn<?, ?> tbNIRE;
    @FXML
    private TableColumn<?, ?> tbRazaoSocial;
    @FXML
    private TableColumn<?, ?> tbNomeFantasia;
    @FXML
    private TableColumn<?, ?> tbTelefone1;
    @FXML
    private TableColumn<?, ?> tbTelefone2;
    @FXML
    private TableColumn<?, ?> tbResponsavel;
    @FXML
    private Button btneditar;
    @FXML
    private Button btnexcluir;
    @FXML
    private Button btnvoltar;
    @FXML
    private Button btnvisualizar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT a FROM CadastroFornecedor as a");
        List<Fornecedor> historico = query.getResultList();
        ObservableList oFornecedor = FXCollections.observableArrayList(historico);                                 
        tbFornecedor.setItems(oFornecedor);
    }    

    @FXML
    private void editar(ActionEvent event) {
    }

    @FXML
    private void excluir(ActionEvent event) {
    }

    @FXML
    private void voltar(ActionEvent event) {
    }

    @FXML
    private void visualizar(ActionEvent event) {
    }
    
}
