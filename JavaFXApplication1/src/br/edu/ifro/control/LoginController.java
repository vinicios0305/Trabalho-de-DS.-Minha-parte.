/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import br.edu.ifro.model.Usuario;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javafx.scene.control.Alert;

/**
 * FXML Controller class
 *
 * @author natal
 */
public class LoginController implements Initializable {

    @FXML
    private TextField txtUsuario;
    @FXML
    private PasswordField pfSenha;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void logar(ActionEvent event) throws IOException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();
        
        Query query = em.createQuery("SELECT f FROM Usuario as f WHERE f.nome = :nome");
        query.setParameter("nome", txtUsuario.getText());
        query.setMaxResults(1);
        
        if(query.getResultList().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setHeaderText("Usuário ou senha inválidos!");
            alert.showAndWait();
           
        }else {
            
            Usuario f = (Usuario) query.getSingleResult();
            if(!f.getSenha().equals(pfSenha.getText())) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setHeaderText("Usuário ou senha inválidos!");
                alert.showAndWait();
            }
             else{
                Stage st = (Stage) pfSenha.getScene().getWindow();
                st.close();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/Menu.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setTitle("Menu");
                stage.setScene(scene);
                stage.show(); 
           }    
        }        
    }
}

    

