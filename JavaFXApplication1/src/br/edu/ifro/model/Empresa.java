/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author 03689560241
 */
@Entity
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String cnpj, nire, inscricaoEstadual, RazaoSocial, NomeFantasia, Email, fone1, Fone2, cidade1, bairro1, uf1,
            nome, NumeroResponsavel, Cpf, bairro, cidade, uf, Logradouro1, logradouro2;
    private Integer cep1, Numero, cep, numero1;

    public String toString() {
        return id + " - " + numero1;
    }

    public Integer getId() {
        return id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getLogradouro1() {
        return Logradouro1;
    }

    public void setLogradouro1(String Logradouro1) {
        this.Logradouro1 = Logradouro1;
    }

    public String getLogradouro2() {
        return logradouro2;
    }

    public void setLogradouro2(String logradouro2) {
        this.logradouro2 = logradouro2;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNire() {
        return nire;
    }

    public void setNire(String nire) {
        this.nire = nire;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getRazaoSocial() {
        return RazaoSocial;
    }

    public void setRazaoSocial(String RazaoSocial) {
        this.RazaoSocial = RazaoSocial;
    }

    public String getNomeFantasia() {
        return NomeFantasia;
    }

    public void setNomeFantasia(String NomeFantasia) {
        this.NomeFantasia = NomeFantasia;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getFone1() {
        return fone1;
    }

    public void setFone1(String fone1) {
        this.fone1 = fone1;
    }

    public String getFone2() {
        return Fone2;
    }

    public void setFone2(String Fone2) {
        this.Fone2 = Fone2;
    }

    public String getCidade1() {
        return cidade1;
    }

    public void setCidade1(String cidade1) {
        this.cidade1 = cidade1;
    }

    public String getBairro1() {
        return bairro1;
    }

    public void setBairro1(String bairro1) {
        this.bairro1 = bairro1;
    }

    public String getUf1() {
        return uf1;
    }

    public void setUf1(String uf1) {
        this.uf1 = uf1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroResponsavel() {
        return NumeroResponsavel;
    }

    public void setNumeroResponsavel(String NumeroResponsavel) {
        this.NumeroResponsavel = NumeroResponsavel;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Integer getCep1() {
        return cep1;
    }

    public void setCep1(Integer cep1) {
        this.cep1 = cep1;
    }

    public Integer getNumero() {
        return Numero;
    }

    public void setNumero(Integer Numero) {
        this.Numero = Numero;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public Integer getNumero1() {
        return numero1;
    }

    public void setNumero1(Integer numero1) {
        this.numero1 = numero1;
    }

}
