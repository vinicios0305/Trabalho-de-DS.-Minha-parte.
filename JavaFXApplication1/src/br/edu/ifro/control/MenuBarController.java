/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class

 */
public class MenuBarController implements Initializable {

    @FXML
    private Button btnsair;
    @FXML
    private Button btnusuarioscadastrados;
    @FXML
    private Button btncadastrarusuario;
    @FXML
    private Button btncadastrarVenda;
    @FXML
    private Button btncadastrarCompras;
    @FXML
    private Button btncadastrarproduto;
    @FXML
    private Button btncadastrarFornecedor;
    @FXML
    private Button btncadastrarEmpresas;
    @FXML
    private Button btncadastrarCliente;
    @FXML
    private Button btncadastrarFuncionario;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void Sair(ActionEvent event) {
    }

    @FXML
    private void usuariosCadastrados(ActionEvent event) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/listagemUsuariosCadastrados.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Usuarios Cadastrados");
            stage.setScene(scene);
            stage.show();
    }
    

    @FXML
    private void CadastrarUsuario(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/Usuario.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Cadastrar Usuário");
            stage.setScene(scene);
            stage.show();
    }

    @FXML
    private void cadastrarVenda(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/Venda.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Cadastrar Venda");
            stage.setScene(scene);
            stage.show();
    }

    @FXML
    private void cadastrarCompras(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/Compras.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Cadastrar Compras");
            stage.setScene(scene);
            stage.show();
    }

    @FXML
    private void cadastrarProduto(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/CadastrarProduto.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Cadastrar Produtos");
            stage.setScene(scene);
            stage.show();
    }

    @FXML
    private void cadastrarFornecedor(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/CadastroFornecedor.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Cadastrar Fornecedor");
            stage.setScene(scene);
            stage.show();
    }

    @FXML
    private void cadastrarEmpresas(ActionEvent event) throws IOException {
        Stage st = (Stage) btncadastrarEmpresas.getScene().getWindow();
                st.close();
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/Empresa.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                Stage stage = new Stage();
                stage.setTitle("Cadastrar Empresa");
                stage.setScene(scene);
                stage.show(); 
    }

    @FXML
    private void cadastrarCliente(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/Cliente.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Cadastrar Cliente");
            stage.setScene(scene);
            stage.show();
    }

    @FXML
    private void cadastrarFuncionario(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/Funcionario.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setTitle("Cadastrar Funcionário");
            stage.setScene(scene);
            stage.show();
    }
    
}
