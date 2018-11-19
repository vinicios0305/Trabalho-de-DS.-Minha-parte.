/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import br.edu.ifro.model.Funcionario;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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
public class ListagemFuncionarioController implements Initializable {

    private TableView<?> tbfuncionario;
    private TableColumn ID;
    private TableColumn NOME;
    private TableColumn CPF;
    private TableColumn RG;
    private TableColumn RUA;
    private TableColumn BAIRRO;
    private TableColumn Nº;
    private TableColumn CEP;
    private TableColumn CELULAR;
    private TableColumn EMAIL;
    private TableColumn CARGO;


    
    @FXML
    private Button btnvoltar;
    @FXML
    private Button btnvisualizar;
    @FXML
    private Button btnexcluir;
    @FXML
    private Button btneditar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT a FROM CadastroFuncionario as a");
        List<Funcionario> historico = query.getResultList();
        ObservableList oFuncionario = FXCollections.observableArrayList(historico);                                 
        tbfuncionario.setItems(oFuncionario);    
    }    
    @FXML
    private void editar(ActionEvent event) {
       
     
    }

    @FXML
    private void excluir(ActionEvent event) {
        
    
    }

    @FXML
    private void voltar(ActionEvent event) {
        Stage stage = (Stage) btnvoltar.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void visualizar(ActionEvent event) {
        
        Funcionario f = (Funcionario) tbfuncionario.getSelectionModel().getSelectedItem();
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        
                        a.setHeaderText("ID: " + f.getId() 
                        + "\n" + "NOME: " + f.getNome()
                        + "\n" + "CPF: " + f.getCPF()
                        + "\n" + "RG: " + f.getRG()
                        + "\n" + "Data Nascimento: " + f.getDataNascimento()
                        + "\n" + "Estado Civil: " + f.getEstadoCivil()
                        + "\n" + "Sexo: " + f.getSexo()
                        + "\n" + "Nacionalidade: " + f.getNacionalidade()
                        + "\n" + "Nome do Pai: " + f.getNomedoPai()
                        + "\n" + "Nome da Mãe: " + f.getNomedaMae()
                        + "\n" + "Rua: " + f.getRua()
                        + "\n" + "Nº: " + f.getNumero()
                        + "\n" + "Bairro: " + f.getBairro()
                        + "\n" + "UF: " + f.getUF()
                        + "\n" + "Cidade: " + f.getCidade()
                        + "\n" + "CEP: " + f.getCEP()
                        + "\n" + "Telefone: " + f.getTelefone()
                        + "\n" + "CELULAR: " + f.getCelular()
                        + "\n" + "Fone Emergencial: " + f.getFoneEmergencial()
                        + "\n" + "Email: " + f.getEmail()
                        + "\n" + "Email Empresarial: " + f.getEmailEmpresarial()
                        + "\n" + "Cargo: " + f.getCargo()
                        + "\n" + "DATA DE ADMISSÃO: " + f.getDataDemissão()
                        + "\n" + "DATA DE DEMISSÃO: " + f.getDataDemissão()
                        );
                        a.showAndWait();
    }
    
}    

 
    

