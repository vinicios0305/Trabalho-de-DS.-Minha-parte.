/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author 04046875208
 */
public class ListagemProdutosController implements Initializable {

    @FXML
    private Button btnvisualizar;
    @FXML
    private Button btnvoltar;
    @FXML
    private Button btnexcluir;
    @FXML
    private Button btneditar;
    @FXML
    private TableView<?> tbprodutos;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void visualizar(ActionEvent event) {
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
