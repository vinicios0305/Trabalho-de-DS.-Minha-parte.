/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.control;

import br.edu.ifro.model.Empresa;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * FXML Controller class
 *
 * @author 04014985229
 */
public class ListagemEmpresaController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TableView<Empresa> tbempresa;
    @FXML
    private Button btneditar;
    @FXML
    private Button btnexcluir;
    @FXML
    private Button btnvoltar;
    @FXML
    private Button btnvisualizar;
    @FXML
    private TextField txtbuscar;
    @FXML
    private Button btnbuscar;
    @FXML
    private Button btnimprimir;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listar();
    }

    @FXML
    private void editar(ActionEvent event) throws IOException {
        Stage st = (Stage) btnvoltar.getScene().getWindow();
        st.close();

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/Empresa.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();

        EmpresasController e = fxmlLoader.getController();
        e.editarEmpresa((Empresa) tbempresa.getSelectionModel().getSelectedItem());

        stage.setTitle("Cadastro de Empresa");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void excluir(ActionEvent event) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Excluir");
        alert.setHeaderText("");
        alert.setContentText("Deseja excluir esta empresa?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
            EntityManager em = emf.createEntityManager();
            Empresa empresa = (Empresa) tbempresa.getSelectionModel().getSelectedItem();
            Query query = em.createQuery("SELECT a FROM Empresa as a WHERE a.id = :id");
            query.setParameter("id", empresa.getId());
            Empresa a = (Empresa) query.getSingleResult();

            em.getTransaction().begin();
            em.remove(a);
            em.getTransaction().commit();

            Alert alerte = new Alert(Alert.AlertType.INFORMATION);
            alerte.setTitle("Excluída");
            alerte.setHeaderText("");
            alerte.setContentText("Empresa excluida com sucesso!");

            listar();

        } else {
            listar();
        }
    }

    private void listar() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT a FROM Empresa as a");
        List<Empresa> historico = query.getResultList();
        ObservableList oEmpresa = FXCollections.observableArrayList(historico);
        tbempresa.setItems(oEmpresa);
    }

    @FXML
    private void voltar(ActionEvent event) throws IOException {

        Stage st = (Stage) btnvoltar.getScene().getWindow();
        st.close();
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/Empresas.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Menu");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void visualizar(ActionEvent event) {

        Empresa e = tbempresa.getSelectionModel().getSelectedItem();
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setHeaderText("ID: " + e.getId()
                + "\n" + "CNPJ: " + e.getCnpj()
                + "\n" + "NIRE: " + e.getNire()
                + "\n" + "INSCRIÇÃO ESTADUAL: " + e.getInscricaoEstadual()
                + "\n" + "RAZÃO SOCIAL: " + e.getRazaoSocial()
                + "\n" + "NOME FANTASIA: " + e.getNomeFantasia()
                + "\n" + "EMAIL: " + e.getEmail()
                + "\n" + "TELEFONE 1: " + e.getFone1()
                + "\n" + "TELEFONE 2: " + e.getFone2()
                + "\n" + "CEP1: " + e.getCep()
                + "\n" + "CIDADE: " + e.getCidade1()
                + "\n" + "UF: " + e.getUf1()
                + "\n" + "LOGRADOURO: " + e.getLogradouro1()
                + "\n" + "BAIRRO : " + e.getBairro1()
                + "\n" + "NÚMERO : " + e.getNumero1()
                + "\n" + "NOME DO RESPONSAVEL: " + e.getNome()
                + "\n" + "TELEFONE DO RESPONSAVEL: " + e.getNumeroResponsavel()
                + "\n" + "CPF: " + e.getCpf()
                + "\n" + "CEP: " + e.getCep()
                + "\n" + "CIDADE: " + e.getCidade()
                + "\n" + "UF: " + e.getUf()
                + "\n" + "LOGRADOURO: " + e.getLogradouro2()
                + "\n" + "BAIRRO: " + e.getBairro()
                + "\n" + "NÚMERO: " + e.getNumero());
        a.showAndWait();
    }

    @FXML
    private void buscar(ActionEvent event) {
        buscarempresa();
    }

    public void buscarempresa() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();
        String pes = txtbuscar.getText();
        Query query = em.createQuery("SELECT a FROM Empresa as a WHERE (a.NomeFantasia LIKE :NomeFantasia ) ORDER BY a.NomeFantasia");
        query.setParameter("NomeFantasia", "%" + pes + "%");
        List<Empresa> itens = query.getResultList();
        ObservableList empresalist = FXCollections.observableArrayList(itens);
        tbempresa.setItems(empresalist);
    }

    @FXML
    private void imprimir(ActionEvent event) {
    }
}
