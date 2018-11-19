/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import br.edu.ifro.model.Venda;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * FXML Controller class
 *
 * @author 04046875208
 */
public class VendaController implements Initializable {

    @FXML
    private TextField txtDataPedido;
    @FXML
    private TextField txtNumeroPedido;
    @FXML
    private TextField txtHoraPedido;
    @FXML
    private TextArea txtObsPedido;
    @FXML
    private TextField txtTotalPedido;
    @FXML
    private TextField txtDesconto;
    @FXML
    private TextField txtTotalLiquido;
    @FXML
    private Button btnLimpar;
    @FXML
    private Button btnVoltar;
    @FXML
    private Button btnEditar;
    @FXML
    private Button btnSalvar;

    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void limpar(ActionEvent event) {
        txtDataPedido.setText("");
        txtNumeroPedido.setText("");
        txtHoraPedido.setText("");
        txtObsPedido.setText("");
        txtTotalPedido.setText("");
        txtDesconto.setText("");
        txtTotalLiquido.setText("");
    }

    @FXML
    private void voltar(ActionEvent event) {
    Stage stage = (Stage) btnVoltar.getScene().getWindow(); stage.close();

    }

    @FXML
    private void editar(ActionEvent event)throws IOException  {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/Editar.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),670,444);
        Stage stage = new Stage();
        stage.setTitle("Editar Venda");
        stage.setScene(scene);
        stage.show();
     
    }

    @FXML
    private void salvar(ActionEvent event) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager ();
        
        Venda venda = new Venda();
        
        
        venda.setDataPedido(txtDataPedido.getText());
        venda.setNumPedido(Integer.parseInt(txtNumeroPedido.getText()));
        venda.setHoraPedido(txtHoraPedido.getText());
        venda.setObsPedido(txtObsPedido.getText());
        venda.setTotalPedido(Double.parseDouble(txtTotalPedido.getText()));
        venda.setDesconto(Double.parseDouble(txtDesconto.getText()));
        venda.setTotalLiquido(Double.parseDouble(txtTotalLiquido.getText()));

    }
    
}
