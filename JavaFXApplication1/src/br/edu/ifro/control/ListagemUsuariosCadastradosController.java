/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import br.edu.ifro.model.Usuario;
import br.edu.ifro.model.Empresa;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * FXML Controller class
 *
 * @author Bianca_
 */
public class ListagemUsuariosCadastradosController implements Initializable {

    @FXML
    private TableView<?> tbusuarios;
    @FXML
    private Button btnvoltar;
    @FXML
    private Button btnexcluir;
    @FXML
    private Button btneditar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT a FROM Usuario as a");
        List<Usuario> usuarios = query.getResultList();
        ObservableList oUsuarios = FXCollections.observableArrayList(usuarios);                                 
        tbusuarios.setItems(oUsuarios);
    }    

    @FXML
    private void voltar(ActionEvent event) {
    }

    @FXML
    private void excluir(ActionEvent event) {
    }

    @FXML
    private void editar(ActionEvent event) {
    }
    
}
