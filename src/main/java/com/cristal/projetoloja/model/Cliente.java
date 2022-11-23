/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cristal.projetoloja.model;


import java.util.Date;

/**
 * Classe para objetos do tipo cliente
 * @author robson.vlima3
 */
public class Cliente {

    private int codCliente;
    private String nome;
    private String cpf;
    private String email;
    private String celular;
    private String endereco;
    private Date dataNasc = new Date();
    private int numeroCasa;
    private String cep;
    private int sexo;
    private int statusCivil;
    
    /**
     * Busca para o objeto Cliente
     */
    public Cliente(){
        
    }
    
    /**
     * Busca o objeto cliente pelo código do cliente
     * @param codCliente
     */
    public Cliente(int codCliente){
        this.codCliente = codCliente;
    }
    
    /**
     * Busca o objeto cliente pelo cpf
     * @param cpf
     */
    public Cliente(String cpf){
        this.cpf = cpf;
    }
  
    /**
     * Busca para o objeto cliente pelos parametros
     * @param nome
     * @param cpf
     * @param dataNasc
     * @param sexo
     * @param statusCivil
     * @param email
     * @param celular
     * @param cep
     * @param endereco
     * @param numeroCasa
     */
    public Cliente(String nome, String cpf, Date dataNasc, int sexo, int statusCivil, String email, String celular, String cep, String endereco, int numeroCasa){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.email = email;
        this.endereco = endereco;
        this.cep = cep;
        this.numeroCasa = numeroCasa;
        this.celular = celular;
        this.sexo = sexo;
        this.statusCivil = statusCivil;
    }

    /**
     * Retorna o código do cliente
     * @return int codCliente
     */
    public int getCodCliente(){
        return codCliente;
    }
    
    /**
     * Pega o código do cliente
     * @param novoCliente
     */
    public void setCodCliente(int novoCliente){
        this.codCliente = novoCliente;
    }

    /**
     * Retorna o nome do cliente
     * @return String nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Pega o nome do cliente
     * @param novoNome
     */
    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    /**
     * Retorna o cpf do cliente
     * @return String cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Pega o cpf do cliente
     * @param novoCpf
     */
    public void setCpf(String novoCpf) {
        this.cpf = novoCpf;
    }

    /**
     * Retorna o email do cliente
     * @return String email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Pega o email do cliente
     * @param novoEmail
     */
    public void setEmail(String novoEmail) {
        this.email = novoEmail;
    }

    /**
     * Retorna o endereco do cliente
     * @return String endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Pega o endereco do cliente
     * @param novoEndereco
     */
    public void setEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
    }

    /**
     * Retorna o numero da casa do cliente
     * @return int NumeroCasa
     */
    public int getNumeroCasa() {
        return numeroCasa;
    }

    /**
     * Pega o numero da casa do cliente
     * @param novoNumeroCasa
     */
    public void setNumeroCasa(int novoNumeroCasa) {
        this.numeroCasa = novoNumeroCasa;
    }

    /**
     * Retorna o celular do cliente
     * @return String celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * Pega o Celular do Cliente
     * @param novoCelular
     */
    public void setCelular(String novoCelular) {
        this.celular = novoCelular;
    }

    /**
     * Retorna o CEP do cliente
     * @return String cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * Pega o CEP do cliente
     * @param novoCep
     */
    public void setCep(String novoCep) {
        this.cep = novoCep;
    }

    /**
     * Retorna a data de nascimento do cliente
     * @return Date dataNasc
     */
    public Date getDataNasc() {
        return dataNasc;
    }

    /**
     * Pega a data de nascimento do cliente
     * @param novaDataNasc
     */
    public void setDataNasc(Date novaDataNasc) {
        this.dataNasc = novaDataNasc;
    }
    
    /**
     * Retorna o sexo do cliente
     * @return int sexo
     */
    public int getSexo(){
        return sexo;
    }
    
    /**
     * Pega o sexo do cliente
     * @param novoSexo
     */
    public void setSexo(int novoSexo){
        this.sexo = novoSexo;
    }
    
    /**
     * Retorna o status civil do cliente
     * @return int statusCivil
     */
    public int getStatusCivil(){
        return statusCivil;
    }
    
    /**
     * Pega o status civil do cliente
     * @param novoStatusCivil
     */
    public void setStatusCivil(int novoStatusCivil){
        this.statusCivil = novoStatusCivil;
    }   
}