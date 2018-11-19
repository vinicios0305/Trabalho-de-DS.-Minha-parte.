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
public class Compra {
@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    
private String emissao, fornecedor, representante, emailRepresentante, foneRepresentante, comprador, emailComprador, foneComprador, situacaoComprador, condicaoPagto, previsaoEntrega, condicaoEntrega, totalOrdemCompra, totalIpi, obs, cep, logradouro, complemento, bairro, cidade;
private Integer numero, numEndereco;
private Double numOrcamento;

    public String getEmissao() {
        return emissao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEmissao(String emissao) {
        this.emissao = emissao;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getEmailRepresentante() {
        return emailRepresentante;
    }

    public void setEmailRepresentante(String emailRepresentante) {
        this.emailRepresentante = emailRepresentante;
    }

    public String getFoneRepresentante() {
        return foneRepresentante;
    }

    public void setFoneRepresentante(String foneRepresentante) {
        this.foneRepresentante = foneRepresentante;
    }

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador;
    }

    public String getEmailComprador() {
        return emailComprador;
    }

    public void setEmailComprador(String emailComprador) {
        this.emailComprador = emailComprador;
    }

    public String getFoneComprador() {
        return foneComprador;
    }

    public void setFoneComprador(String foneComprador) {
        this.foneComprador = foneComprador;
    }

    public String getSituacaoComprador() {
        return situacaoComprador;
    }

    public void setSituacaoComprador(String situacaoComprador) {
        this.situacaoComprador = situacaoComprador;
    }

    public String getCondicaoPagto() {
        return condicaoPagto;
    }

    public void setCondicaoPagto(String condicaoPagto) {
        this.condicaoPagto = condicaoPagto;
    }

    public String getPrevisaoEntrega() {
        return previsaoEntrega;
    }

    public void setPrevisaoEntrega(String previsaoEntrega) {
        this.previsaoEntrega = previsaoEntrega;
    }

    public String getCondicaoEntrega() {
        return condicaoEntrega;
    }

    public void setCondicaoEntrega(String condicaoEntrega) {
        this.condicaoEntrega = condicaoEntrega;
    }

    public String getTotalOrdemCompra() {
        return totalOrdemCompra;
    }

    public void setTotalOrdemCompra(String totalOrdemCompra) {
        this.totalOrdemCompra = totalOrdemCompra;
    }

    public String getTotalIpi() {
        return totalIpi;
    }

    public void setTotalIpi(String totalIpi) {
        this.totalIpi = totalIpi;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
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

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumEndereco() {
        return numEndereco;
    }

    public void setNumEndereco(Integer numEndereco) {
        this.numEndereco = numEndereco;
    }

    public Double getNumOrcamento() {
        return numOrcamento;
    }

    public void setNumOrcamento(Double numOrcamento) {
        this.numOrcamento = numOrcamento;
    }

}
