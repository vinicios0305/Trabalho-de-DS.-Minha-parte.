/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import br.edu.ifro.model.Usuario;
import br.edu.ifro.model.Fornecedor;
import br.eti.diegofonseca.MaskFieldUtil;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
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
public class FornecedorController implements Initializable {

    @FXML
    private TextField txtRazaoSocial;
    @FXML
    private TextField txtCNPJ;
    @FXML
    private TextField txtNomeFantasia;
    @FXML
    private TextField txtDescricao;
    @FXML
    private TextField txtnumero;
    @FXML
    private TextField txtlogradouro;
    @FXML
    private TextField txtbairro;
    @FXML
    private TextField txtpais;
    @FXML
    private TextField txtCEP;
    @FXML
    private TextField txtUF;
    @FXML
    private TextField txtresponsavel;
    @FXML
    private TextField txttelefone1;
    @FXML
    private TextField txttelefone2;
    @FXML
    private TextField txtNIRE;
    @FXML
    private TextField txtCPFresponsavel;
    @FXML
    private TextField txtTelefoneResponsavel;
    @FXML
    private Button btncancelar;
    @FXML
    private Button btnsalvar;
    @FXML
    private TextField txtcomplemento;
    @FXML
    private TextField txtRGresponsavel;
    @FXML
    private TextField txtemail;
    @FXML
    private Button btnlimpar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        MaskFieldUtil.cepField(txtCEP);
        MaskFieldUtil.foneField(txttelefone1);
        MaskFieldUtil.foneField(txttelefone2);
        MaskFieldUtil.foneField(txtTelefoneResponsavel);
        MaskFieldUtil.cnpjField(txtCNPJ);
        MaskFieldUtil.cpfField(txtCPFresponsavel);
    }    

    @FXML
    private void cancelar(ActionEvent event) {
        Stage stage = (Stage) btncancelar.getScene().getWindow(); stage.close();
    }


    @FXML
    private void salvar(ActionEvent event) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();
        Fornecedor cadFornecedor = new Fornecedor ();
        cadFornecedor.setRazaoSocial(txtRazaoSocial.getText());
        cadFornecedor.setCnpj(txtCNPJ.getText());
        cadFornecedor.setDescricao(txtDescricao.getText());
        cadFornecedor.setFone1(txttelefone1.getText());
        cadFornecedor.setFone2(txttelefone2.getText());
        cadFornecedor.setEmail(txtemail.getText());
        cadFornecedor.setLogradouro(txtlogradouro.getText());
        cadFornecedor.setNumEndereco(Integer.parseInt(txtnumero.getText()));
        cadFornecedor.setComplemento(txtcomplemento.getText());
        cadFornecedor.setPais(txtpais.getText());
        cadFornecedor.setBairroDistrito(txtbairro.getText());
        cadFornecedor.setCep(txtCEP.getText());
        cadFornecedor.setUf(txtUF.getText());
        cadFornecedor.setCpf(txtCPFresponsavel.getText());
        cadFornecedor.setRg(txtRGresponsavel.getText());
        cadFornecedor.setFone(txtTelefoneResponsavel.getText());
        cadFornecedor.setFone(txtresponsavel.getText());
           
        em.getTransaction().begin();
        em.persist(cadFornecedor);
        em.getTransaction().commit(); 
    }

    @FXML
    private void limpar(ActionEvent event) {
        txtRazaoSocial.setText("");
        txtCNPJ.setText("");
        txtNomeFantasia.setText("");
        txtDescricao.setText("");
        txtnumero.setText("");
        txtlogradouro.setText("");
        txtbairro.setText("");
        txtpais.setText("");
        txtCEP.setText("");
        txtresponsavel.setText("");
        txttelefone1.setText("");
        txttelefone2.setText("");
        txtNIRE.setText("");
        txtCPFresponsavel.setText("");
        txtTelefoneResponsavel.setText("");
        txtcomplemento.setText("");
        txtRGresponsavel.setText("");
        txtemail.setText("");
        txtRazaoSocial.requestFocus();
        
    }

    @FXML
    private void Cadastros(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/ListagemFornecedor.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),1045,535);
        Stage stage = new Stage();
        stage.setTitle("Listagem Empresas");
        stage.setScene(scene);
        stage.show(); 
    }
    
}
