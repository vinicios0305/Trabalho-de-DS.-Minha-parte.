package br.edu.ifro.control;

import br.com.parg.viacep.ViaCEP;
import br.com.parg.viacep.ViaCEPException;
import br.edu.ifro.model.Empresa;
import br.eti.diegofonseca.MaskFieldUtil;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmpresasController implements Initializable {

    @FXML
    private TextField txtCnpj;
    @FXML
    private TextField txtNire;
    @FXML
    private TextField txtRazaoSocial;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtNomeFantasia;
    @FXML
    private TextField txtLogradouro;
    @FXML
    private TextField txtInscricaoEstadual;
    @FXML
    private TextField txtFone1;
    @FXML
    private TextField txtFone2;
    @FXML
    private TextField txtNumero;
    @FXML
    private TextField txtBairro;
    @FXML
    private TextField txtNome;
    @FXML
    private TextField txtCpf;
    @FXML
    private TextField txtNumeroResponsavel;
    @FXML
    private Button btnSalvar;
    @FXML
    private TextField txtcep;
    @FXML
    private TextField txtlogradouro;
    @FXML
    private Button btnBuscar;
    @FXML
    private TextField txtcidade;
    @FXML
    private TextField txtuf;
    @FXML
    private TextField txtnumero;
    @FXML
    private TextField txtbairro1;
    @FXML
    private Button btnbuscar1;
    @FXML
    private TextField txtcep1;
    @FXML
    private TextField txtuf1;
    @FXML
    private TextField txtcidade1;
    @FXML
    private Button btnvoltar;
    @FXML
    private Button btncadastro;

    private Empresa empresa;

    public void editarEmpresa(Empresa empresa) {
        this.empresa = empresa;
        txtBairro.setText(empresa.getBairro());
        txtCnpj.setText(empresa.getCnpj());
        txtCpf.setText(empresa.getCpf());
        txtEmail.setText(empresa.getEmail());
        txtFone1.setText(empresa.getFone1());
        txtFone2.setText(empresa.getFone2());
        txtInscricaoEstadual.setText(empresa.getInscricaoEstadual());
        txtLogradouro.setText(empresa.getLogradouro1());
        txtNire.setText(empresa.getNire());
        txtNome.setText(empresa.getNome());
        txtNomeFantasia.setText(empresa.getNomeFantasia());
        txtNumeroResponsavel.setText(empresa.getNumeroResponsavel());
        txtRazaoSocial.setText(empresa.getRazaoSocial());
        txtBairro.setText(empresa.getBairro());
        txtbairro1.setText(empresa.getBairro1());
        txtcidade.setText(empresa.getCidade());
        txtcidade1.setText(empresa.getCidade1());
        txtlogradouro.setText(empresa.getLogradouro2());
        txtuf.setText(empresa.getUf());
        txtuf1.setText(empresa.getUf1());
        txtnumero.setText(empresa.getNumero1().toString());
        txtcep.setText(empresa.getCep().toString());
        txtcep1.setText(empresa.getCep1().toString());
        txtNumero.setText(empresa.getNumero().toString());
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        MaskFieldUtil.cpfField(txtCpf);
        MaskFieldUtil.cnpjField(txtCnpj);
        MaskFieldUtil.foneField(txtFone1);
        MaskFieldUtil.foneField(txtFone2);
        MaskFieldUtil.foneField(txtNumeroResponsavel);
        txtuf.setDisable(true);
        txtcidade.setDisable(true);
        txtuf1.setDisable(true);
        txtcidade1.setDisable(true);
    }

    private void limpar() {
        txtCnpj.setText("");
        txtNire.setText("");
        txtInscricaoEstadual.setText("");
        txtRazaoSocial.setText("");
        txtNomeFantasia.setText("");
        txtEmail.setText("");
        txtFone1.setText("");
        txtFone2.setText("");
        txtcidade1.setText("");
        txtbairro1.setText("");
        txtuf1.setText("");
        txtNumeroResponsavel.setText("");
        txtCpf.setText("");
        txtBairro.setText("");
        txtcidade.setText("");
        txtuf.setText("");
        txtcep1.setText("");
        txtnumero.setText("");
        txtcep.setText("");
        txtNumero.setText("");
        txtlogradouro.setText("");
        txtLogradouro.setText("");
        txtNome.setText("");
        txtCnpj.requestFocus();
    }

    private void gravar() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();

        if (empresa != null) {
            Query query = em.createQuery("SELECT a FROM Empresa as a WHERE a.id = :id ");
            query.setParameter("id", empresa.getId());
            empresa = (Empresa) query.getSingleResult();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Confirmação");
            alert.setHeaderText("Empresa atualizada com Sucesso!!");
            alert.setContentText("");
            alert.showAndWait();
        } else {
            empresa = new Empresa();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Confirmação");
            alert.setHeaderText("Empresa cadastrada com Sucesso!!");
            alert.setContentText("");
            alert.showAndWait();
        }
        empresa.setLogradouro1(txtLogradouro.getText());
        empresa.setLogradouro2(txtlogradouro.getText());
        empresa.setCnpj(txtCnpj.getText());
        empresa.setNire(txtNire.getText());
        empresa.setInscricaoEstadual(txtInscricaoEstadual.getText());
        empresa.setRazaoSocial(txtRazaoSocial.getText());
        empresa.setNomeFantasia(txtNomeFantasia.getText());
        empresa.setEmail(txtEmail.getText());
        empresa.setFone1(txtFone1.getText());
        empresa.setFone2(txtFone2.getText());
        empresa.setCidade1(txtcidade1.getText());
        empresa.setBairro1(txtbairro1.getText());
        empresa.setUf1(txtuf1.getText());
        empresa.setNome(txtNome.getText());
        empresa.setNumeroResponsavel(txtNumeroResponsavel.getText());
        empresa.setCpf(txtCpf.getText());
        empresa.setBairro(txtBairro.getText());
        empresa.setCidade(txtcidade.getText());
        empresa.setUf(txtuf.getText());
        empresa.setCep1(Integer.parseInt(txtcep1.getText()));
        empresa.setNumero(Integer.parseInt(txtnumero.getText()));
        empresa.setCep(Integer.parseInt(txtcep.getText()));
        empresa.setNumero1(Integer.parseInt(txtNumero.getText()));
        em.getTransaction().begin();
        em.persist(empresa);
        em.getTransaction().commit();
        limpar();

    }

    @FXML
    private void salvar(ActionEvent event) {
        if (txtCnpj.getText() == null || txtCnpj.getText().trim().equals("")
                || txtBairro.getText() == null || txtBairro.getText().trim().equals("")
                || txtCpf.getText() == null || txtCpf.getText().trim().equals("")
                || txtEmail.getText() == null || txtEmail.getText().trim().equals("")
                || txtFone1.getText() == null || txtFone1.getText().trim().equals("")
                || txtInscricaoEstadual.getText() == null || txtInscricaoEstadual.getText().trim().equals("")
                || txtLogradouro.getText() == null || txtLogradouro.getText().trim().equals("")
                || txtNire.getText() == null || txtNire.getText().trim().equals("")
                || txtNome.getText() == null || txtNome.getText().trim().equals("")
                || txtNomeFantasia.getText() == null || txtNomeFantasia.getText().trim().equals("")
                || txtNumero.getText() == null || txtNumero.getText().trim().equals("")
                || txtRazaoSocial.getText() == null || txtRazaoSocial.getText().trim().equals("")
                || txtcep.getText() == null || txtcep.getText().trim().equals("")
                || txtcep1.getText() == null || txtcep1.getText().trim().equals("")
                || txtcidade.getText() == null || txtcidade.getText().trim().equals("")
                || txtcidade1.getText() == null || txtcidade1.getText().trim().equals("")
                || txtlogradouro.getText() == null || txtlogradouro.getText().trim().equals("")
                || txtnumero.getText() == null || txtnumero.getText().trim().equals("")
                || txtuf.getText() == null || txtuf.getText().trim().equals("")
                || txtuf1.getText() == null || txtuf1.getText().trim().equals("")) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Campo Vázio");
            alert.setHeaderText("Preencha todos os campos!");
            alert.setContentText("");
            alert.showAndWait();

        } else if (txtCpf.getText().length() < 14) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Cpf inválido");
            alert.setHeaderText("O cpf digitado é inválido!");
            alert.setContentText("");
            alert.showAndWait();

        } else if (txtFone1.getText().length() < 14) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Telefone inválido");
            alert.setHeaderText("O telefone digitado é inválido!");
            alert.setContentText("");
            alert.showAndWait();
        } else if (txtCnpj.getText().length() < 18) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Cnpj inválido");
            alert.setHeaderText("O CNPJ digitado é inválido!");
            alert.setContentText("");
            alert.showAndWait();

        } else {

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Salvar");
            alert.setHeaderText("");
            alert.setContentText("Deseja salvar esta empresa?");

            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ButtonType.OK) {
                gravar();

            } else {
                alert.close();
            }
        }
    }

    @FXML
    private void buscarCep(ActionEvent event) {
        ViaCEP viaCep = new ViaCEP();

        try {
            viaCep.buscar(txtcep.getText());

            txtBairro.setText(viaCep.getBairro());
            txtlogradouro.setText(viaCep.getLogradouro());
            txtuf.setText(viaCep.getUf());
            txtcidade.setText(viaCep.getLocalidade());

        } catch (ViaCEPException ex) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("ERRO");
            alert.setHeaderText("O CEP DIGITADO É INVÁLIDO!");
            alert.setContentText("");
            alert.showAndWait();

        }

      
    }

    @FXML
    private void buscar1(ActionEvent event) {
        ViaCEP viaCep = new ViaCEP();

        try {
            viaCep.buscar(txtcep1.getText());

            txtbairro1.setText(viaCep.getBairro());
            txtLogradouro.setText(viaCep.getLogradouro());
            txtuf1.setText(viaCep.getUf());
            txtcidade1.setText(viaCep.getLocalidade());

        } catch (ViaCEPException ex) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("ERRO");
            alert.setHeaderText("O CEP DIGITADO É INVÁLIDO!");
            alert.setContentText("");
            alert.showAndWait();
        }

    }

    @FXML
    private void voltar(ActionEvent event) throws IOException {
        Stage st = (Stage) btnvoltar.getScene().getWindow();
        st.close();
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/Menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Menu");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void cadastro(ActionEvent event) throws IOException {
        Stage st = (Stage) btncadastro.getScene().getWindow();
        st.close();
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("/br/edu/ifro/view/listagemEmpresa.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Listagem Empresas");
        stage.setScene(scene);
        stage.show();
    }

}
