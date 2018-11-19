/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import br.com.parg.viacep.ViaCEP;
import br.com.parg.viacep.ViaCEPException;
import br.edu.ifro.model.Funcionario;
import br.eti.diegofonseca.MaskFieldUtil;
import com.jfoenix.controls.JFXButton;
import static java.awt.SystemColor.control;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import static sun.util.calendar.CalendarUtils.mod;

/**
 * FXML Controller class
 *
 * @author 04380230210
 */
public class FuncionarioController implements Initializable {
    
    @FXML
    private DatePicker dpNascimento;
    @FXML
    private ComboBox<?> cbSexo;
    @FXML
    private TextField txtID;
    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtCpf;
    @FXML
    private TextField txtRg;
    @FXML
    private TextField txtPai;
    @FXML
    private TextField txtMae;
    @FXML
    private ComboBox<?> cbEstadoCivil;
    @FXML
    private TextField txtRua;
    @FXML
    private TextField txtBairro;
    @FXML
    private TextField txtCidade;
    @FXML
    private TextField txtNumero;
    @FXML
    private TextField txtUf;
    @FXML
    private TextField txtCep;
    @FXML
    private TextField txtFone;
    @FXML
    private TextField txtCelular;
    @FXML
    private TextField txtTelefone;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtEmailEmpresarial;
    @FXML
    private ComboBox<?> cbNacionalidade;
    @FXML
    private ImageView imgImagem;
    @FXML
    private TextField txtCargo;
    @FXML
    private DatePicker dpAdmissao;
    @FXML
    private DatePicker dpDemissao;
    @FXML
    private Button btnLimpar;
    @FXML
    private Button btnCancelar;
    @FXML
    private Button btnEditar;
    @FXML
    private Button btnProcurar;
    @FXML
    private Button btnSalvar;
    @FXML
    private Label lblId;
    @FXML
    private Button btnAlterar;
    private Funcionario funcionario;

    

    public void CadastroFuncionarioController (DatePicker dpNascimento, ComboBox<?> cbSexo, TextField txtID, TextField txtNome, TextField txtCpf, TextField txtRg, TextField txtPai, TextField txtMae, ComboBox<?> cbEstadoCivil, TextField txtRua, TextField txtBairro, TextField txtCidade, TextField txtNumero, TextField txtUf, TextField txtCep, TextField txtFone, TextField txtCelular, TextField txtTelefone, TextField txtEmail, TextField txtEmailEmpresarial, ComboBox<?> cbNacionalidade, ImageView imgImagem, TextField txtCargo, DatePicker dpAdmissao, DatePicker dpDemissao, Button btnAlterar, Button btnLimpar, Button btnCancelar, Button btnEditar, Button btnProcurar, Button btnSalvar) {
        this.dpNascimento = dpNascimento;
        this.cbSexo = cbSexo;
        this.txtID = txtID;
        this.txtNome = txtNome;
        this.txtCpf = txtCpf;
        this.txtRg = txtRg;
        this.txtPai = txtPai;
        this.txtMae = txtMae;
        this.cbEstadoCivil = cbEstadoCivil;
        this.txtRua = txtRua;
        this.txtBairro = txtBairro;
        this.txtCidade = txtCidade;
        this.txtNumero = txtNumero;
        this.txtUf = txtUf;
        this.txtCep = txtCep;
        this.txtFone = txtFone;
        this.txtCelular = txtCelular;
        this.txtTelefone = txtTelefone;
        this.txtEmail = txtEmail;
        this.txtEmailEmpresarial = txtEmailEmpresarial;
        this.cbNacionalidade = cbNacionalidade;
        this.imgImagem = imgImagem;
        this.txtCargo = txtCargo;
        this.dpAdmissao = dpAdmissao;
        this.dpDemissao = dpDemissao;
        this.btnLimpar = btnLimpar;
        this.btnCancelar = btnCancelar;
        this.btnEditar = btnEditar;
        this.btnProcurar = btnProcurar;
        this.btnSalvar = btnSalvar;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        MaskFieldUtil.cpfField(txtCpf);
        MaskFieldUtil.foneField(txtTelefone);
        MaskFieldUtil.foneField(txtCelular);
        MaskFieldUtil.foneField(txtFone);
        txtCpf.setDisable(true);
        txtTelefone.setDisable(true);
        txtCelular.setDisable(true);
        txtFone.setDisable(true);
    }  
    
    
   
    private void cancelar(ActionEvent event) {
    Stage stage = (Stage) btnCancelar.getScene().getWindow();
    stage.close();
		
    }
   
     private void editarFuncionario() {
           
        this.funcionario = funcionario;
        
        txtID.setText(funcionario.getId());
        txtNome.setText(funcionario.getNome());
        txtCpf.setText(funcionario.getCPF());
        txtRg.setText(funcionario.getRG());
        txtPai.setText(funcionario.getNomedoPai());
        txtMae.setText(funcionario.getNomedaMae());
        txtRua.setText(funcionario.getRua());
        txtBairro.setText(funcionario.getBairro());
        txtCidade.setText(funcionario.getCidade());
        txtNumero.setText(funcionario.getNumero());
        txtUf.setText(funcionario.getUF());
        txtCep.setText(funcionario.getCEP());
        txtFone.setText(funcionario.getFoneEmergencial());
        txtCelular.setText(funcionario.getCelular());
        txtTelefone.setText(funcionario.getTelefone());
        txtEmail.setText(funcionario.getEmail());
        txtEmailEmpresarial.setText(funcionario.getEmailEmpresarial());
        txtCargo.setText(funcionario.getCargo());
     }

    private void editar(ActionEvent event) throws IOException {
        
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/CadastroFuncionario.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),670,444);
        Stage stage = new Stage();
        
        FuncionarioController c = fxmlLoader.getController();
        c.editarFuncionario();
        
        stage.setTitle("Editar Funcionário");
        stage.setScene(scene);
        stage.show();
    }

    private void procurar(java.awt.event.ActionEvent evt) {
    
    
    
      
    }

    private void salvar(ActionEvent event) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager ();
        
        Funcionario funcionario = null;
        if (funcionario != null){
            Query query = em.createQuery("SELECT a FROM Funcionario as a WHERE a.id = id");
            query.setParameter("id", funcionario.getId());
            
           funcionario = (Funcionario) query.getSingleResult();
        }
        else{
           funcionario = new Funcionario();
        }
        
        
        funcionario.setNome(txtNome.getText());
        funcionario.setNome(txtCpf.getText());
        funcionario.setNome(txtRg.getText());
        funcionario.setNome(txtPai.getText());
        funcionario.setNome(txtMae.getText());
        funcionario.setNome(txtRua.getText());
        funcionario.setNome(txtNumero.getText());
        funcionario.setNome(txtBairro.getText());
        funcionario.setNome(txtUf.getText());
        funcionario.setNome(txtCidade.getText());
        funcionario.setNome(txtCep.getText());
        funcionario.setNome(txtTelefone.getText());
        funcionario.setNome(txtCelular.getText());
        funcionario.setNome(txtFone.getText());
        funcionario.setNome(txtEmail.getText());
        funcionario.setNome(txtEmailEmpresarial.getText());
        funcionario.setNome(txtCargo.getText());
        
        em.getTransaction().begin();
        em.persist(funcionario);
        em.getTransaction().commit();
        
        
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmação");
        alert.setHeaderText("Sucesso!");
        alert.setContentText("Funcionário cadastrada com Sucesso!");
        alert.showAndWait();
        
        txtNome.setText("");
        txtCpf.setText("");
        txtRg.setText("");
        txtPai.setText("");
        txtMae.setText("");
        txtRua.setText("");
        txtNumero.setText("");
        txtBairro.setText("");
        txtUf.setText("");
        txtCidade.setText("");
        txtCep.setText("");
        txtTelefone.setText("");
        txtCelular.setText("");
        txtFone.setText("");
        txtEmail.setText("");
        txtEmailEmpresarial.setText("");
        txtCargo.setText("");

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
