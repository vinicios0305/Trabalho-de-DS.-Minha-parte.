/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import br.com.parg.viacep.ViaCEP;
import br.com.parg.viacep.ViaCEPException;
import br.edu.ifro.model.Cliente;
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
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author 03689560241
 */
public class ClienteController implements Initializable {

    @FXML
    private TextField txtDataCadastro;
    @FXML
    private TextField txtComplemento;
    @FXML
    private TextField txtBairro;
    @FXML
    private TextField txtCidade;
    @FXML
    private TextField txtUf;
    @FXML
    private TextField txtCep;
    @FXML
    private TextField txtCliente;
    @FXML
    private TextField txtOrdem;
    @FXML
    private TextArea txtObs;
    @FXML
    private TextField txtRua;
    @FXML
    private TextField txtFoneA;
    @FXML
    private TextField txtFoneB;
    @FXML
    private TextField txtFax;
    @FXML
    private TextField txtCelular;
    @FXML
    private TextField txtCnpj;
    @FXML
    private TextField txtRg;
    @FXML
    private TextField txtContato;
    @FXML
    private TextField txtApelido;
    @FXML
    private TextField txtAniversario;
    @FXML
    private TextField txtEmail;
    @FXML
    private Button btnVoltar;
    @FXML
    private Button btnLimpar;
    @FXML
    private MenuButton txttipocliente;
    @FXML
    private Button txtEditar;
    @FXML
    private Button txtSalvar;

    /**
     * Initializes the controller class.
     * @param url
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    private void Editar(ActionEvent event) throws IOException {
         FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/CadastroCliente.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),670,444);
        Stage stage = new Stage();
        stage.setTitle("Cadastrar Cliente");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void salvar(ActionEvent event) {
          EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager ();
        
        Cliente cliente = new Cliente();
       
        cliente.setOrdem(Integer.parseInt(txtOrdem.getText()));
        cliente.setCliente(txtCliente.getText());
        cliente.setEndereco(txtRua.getText());
        cliente.setDataCadastro(txtDataCadastro.getText());
        cliente.setBairro(txtBairro.getText());
        cliente.setCidade(txtCidade.getText());
        cliente.setCEP(txtCep.getText());
        cliente.setUF(txtUf.getText());
        cliente.setTelefoneA(txtFoneA.getText());
        cliente.setTrefoneB(txtFoneB.getText());
        cliente.setFax(txtFax.getText());
        cliente.setCelular(txtCelular.getText());
        cliente.setComplemento(txtComplemento.getText());
        cliente.setCNPJ(txtCnpj.getText());
        cliente.setRGInsc(txtRg.getText());
        cliente.setContato(txtContato.getText());
        cliente.setApelido(txtApelido.getText());
        cliente.setAniversario(txtAniversario.getText());
        cliente.setEmail(txtEmail.getText());
        cliente.setObservacoes(txtObs.getText());

        
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
    }

    @FXML
    private void limpar(ActionEvent event) {
    txtDataCadastro.setText("");
    txtBairro.setText("");
    txtCidade.setText("");
    txtUf.setText("");
    txtCep.setText("");
    txtCliente.setText("");
    txtOrdem.setText("");
    txtObs.setText("");
    txtRua.setText("");
    txtFoneA.setText("");
    txtFoneB.setText("");
    txtFax.setText("");
    txtCelular.setText("");
    txtCnpj.setText("");
    txtRg.setText("");
    txtContato.setText("");
    txtApelido.setText("");    
    txtAniversario.setText("");
    txtEmail.setText(""); 
    
    }

    @FXML
    private void editar(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/Editar.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),670,444);
        Stage stage = new Stage();
        stage.setTitle("Editar Cliente");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void voltar(ActionEvent event) {
    Stage stage = (Stage) btnVoltar.getScene().getWindow(); stage.close();

    }

    @FXML
    private void buscarCep(ActionEvent event) {
        ViaCEP viaCep = new ViaCEP();
    
        try {
            viaCep.buscar(txtCep.getText());
            
            txtBairro.setText(viaCep.getBairro());
            txtRua.setText(viaCep.getLogradouro());
            txtUf.setText(viaCep.getUf());
            txtCidade.setText(viaCep.getLocalidade());
            
        } catch (ViaCEPException ex) {
            JOptionPane.showMessageDialog(null, "O CEP digitado é inválido!");
        }
    }
}