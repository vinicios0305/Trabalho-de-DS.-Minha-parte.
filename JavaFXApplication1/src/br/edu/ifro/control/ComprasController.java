/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import br.edu.ifro.model.Produto;
import br.edu.ifro.model.Compra;
import br.edu.ifro.model.Venda;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



/**
 * FXML Controller class
 *
 * @author 04380230210
 */
public class ComprasController implements Initializable {

    @FXML
    private TextField txtNumero;
    @FXML
    private DatePicker txtEmissao;
    @FXML
    private TextField txtFornecedor;
    @FXML
    private TextField txtRepresentante;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtFoneRepresentante;
    @FXML
    private TextField txtNumeroOrcamento;
    @FXML
    private TextField txtComprador;
    @FXML
    private TextField txtFoneComprador;
    @FXML
    private TextField txtSituacao;
    @FXML
    private Button btnAdicionarProduto;
    @FXML
    private Button btnAlterarProduto;
    @FXML
    private Button btnRemoverProduto;
    @FXML
    private TextField txtCondicaoPagamento;
    @FXML
    private DatePicker txtPrevisaoEntrega;
    @FXML
    private TextField txtCondicaoEmtrega;
    @FXML
    private TextField txtTotalOrdCompra;
    @FXML
    private TextField txtTotalIPI;
    @FXML
    private TextArea txtObs;
    @FXML
    private TextField txtCep;
    @FXML
    private TextField txtLogradouro;
    @FXML
    private TextField txtComplemento;
    @FXML
    private TextField txtBairro;
    @FXML
    private TextField txtCidade;
    @FXML
    private Button btnCancelar;
    @FXML
    private Button btnEditar;
    @FXML
    private Button btnProcurar;
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
    private void adicionarProduto(ActionEvent event) throws IOException {
    FXMLLoader fxmlLoader = new FXMLLoader();
    fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/AdicionarProduto.fxml"));
    Scene scene = new Scene(fxmlLoader.load(),670,444);
    Stage stage = new Stage();
    stage.setTitle("Adicionar Produto");
    stage.setScene(scene);
    stage.show();
    }

    @FXML
    private void alterarProduto(ActionEvent event) {
    }

    @FXML
    private void removerProduto(ActionEvent event) throws IOException { 
    FXMLLoader fxmlLoader = new FXMLLoader();
    fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/RemoverProduto.fxml"));
    Scene scene = new Scene(fxmlLoader.load(),670,444);
    Stage stage = new Stage();
    stage.setTitle("Remover Produto");
    stage.setScene(scene);
    stage.show();

    }

    @FXML
    private void cancelar(ActionEvent event) {
    Stage stage = (Stage) btnCancelar.getScene().getWindow();
    stage.close();
    }

    @FXML
    private void editar(ActionEvent event) throws IOException {
         FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/Editar.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),670,444);
        Stage stage = new Stage();
        stage.setTitle("Editar Compra");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void procurar(ActionEvent event) {
    }

    @FXML
    private void salvar(ActionEvent event) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager ();
        
        Compra compras = new Compra();
        

        compras.setNumero(Integer.parseInt(txtNumero.getText()));
        compras.setFornecedor(txtFornecedor.getText());
        compras.setRepresentante(txtRepresentante.getText());
        compras.setEmailRepresentante(txtEmail.getText());
        compras.setFoneRepresentante(txtFoneRepresentante.getText());
        compras.setComprador(txtComprador.getText());
        compras.setFoneComprador(txtFoneComprador.getText());
        compras.setSituacaoComprador(txtSituacao.getText());
        compras.setCondicaoPagto(txtCondicaoPagamento.getText());
        compras.setCondicaoEntrega(txtCondicaoEmtrega.getText());
        compras.setTotalOrdemCompra(txtTotalOrdCompra.getText());
        compras.setTotalIpi(txtTotalIPI.getText());
        compras.setObs(txtObs.getText());
        compras.setCep(txtCep.getText());
        compras.setLogradouro(txtLogradouro.getText());
        compras.setComplemento(txtComplemento.getText());
        compras.setBairro(txtBairro.getText());
        compras.setCidade(txtCidade.getText());

    }
    
}

    