/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import br.edu.ifro.model.Usuario;
import br.edu.ifro.model.Cliente;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
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
public class UsuarioController implements Initializable {
    
    @FXML
    private TextField txtNome;
    @FXML
    private Button btnCadastrar;
    @FXML
    private TextField txtEmail;
    @FXML
    private PasswordField pfSenha;
    @FXML
    private PasswordField pfRepetirSenha;
    @FXML
    private Button btnvoltar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void cadastrar(ActionEvent event) {
     
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();
        Usuario user = new Usuario ();
        user.setNome(txtNome.getText());
        user.setEmail(txtEmail.getText());
        user.setSenha(pfSenha.getText());
        user.setRepetirSenha(pfRepetirSenha.getText());
        
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setHeaderText("Usuario Cadastrado com sucesso!");
            alert.showAndWait();
        
        txtNome.setText("");
        txtEmail.setText("");
        pfSenha.setText("");
        pfRepetirSenha.setText("");
        txtNome.requestFocus();
    }

    @FXML
    private void voltar(ActionEvent event) throws IOException {
    Stage stage = (Stage) btnvoltar.getScene().getWindow(); stage.close();


    }
    
}
