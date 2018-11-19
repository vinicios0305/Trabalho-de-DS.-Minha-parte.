package br.edu.ifro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author 04014985229
 */
@Entity
public class Funcionario {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private String id;
    private String Nome;
    private String CPF;
    private String RG;
    private String DataNascimento;
    private String EstadoCivil;
    private String Sexo;
    private String Nacionalidade;
    private String NomedoPai;
    private String NomedaMae;
    private String Rua;
    private String Numero;
    private String Bairro;
    private String UF;
    private String Cidade;
    private String CEP;
    private String Telefone;
    private String Celular;
    private String FoneEmergencial;
    private String Email;
    private String EmailEmpresarial;
    private String Cargo;
    private String DataAdmissão;
    private String DataDemissão;
    

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getNacionalidade() {
        return Nacionalidade;
    }

    public void setNacionalidade(String Nacionalidade) {
        this.Nacionalidade = Nacionalidade;
    }

    public String getNomedoPai() {
        return NomedoPai;
    }

    public void setNomedoPai(String NomedoPai) {
        this.NomedoPai = NomedoPai;
    }

    public String getNomedaMae() {
        return NomedaMae;
    }

    public void setNomedaMae(String NomedaMae) {
        this.NomedaMae = NomedaMae;
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getFoneEmergencial() {
        return FoneEmergencial;
    }

    public void setFoneEmergencial(String FoneEmergencial) {
        this.FoneEmergencial = FoneEmergencial;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getEmailEmpresarial() {
        return EmailEmpresarial;
    }

    public void setEmailEmpresarial(String EmailEmpresarial) {
        this.EmailEmpresarial = EmailEmpresarial;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getDataAdmissão() {
        return DataAdmissão;
    }

    public void setDataAdmissão(String DataAdmissão) {
        this.DataAdmissão = DataAdmissão;
    }

    public String getDataDemissão() {
        return DataDemissão;
    }

    public void setDataDemissão(String DataDemissão) {
        this.DataDemissão = DataDemissão;
    }
    
 
}
