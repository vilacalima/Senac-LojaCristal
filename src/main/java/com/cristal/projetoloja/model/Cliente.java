/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cristal.projetoloja.model;

import java.sql.Timestamp;
import java.util.Date;

/**
 *
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
    
    public Cliente(){
        
    }
    public Cliente(int codCliente){
        this.codCliente = codCliente;
    }
    
    public Cliente(String cpf){
        this.cpf = cpf;
    }
    
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
    
    public Cliente(int codCliente, String nome, String cpf, Date dataNasc, int sexo, int statusCivil, String email, String celular, String cep, String endereco, int numeroCasa){
        this.codCliente = codCliente;
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
    public int getCodCliente(){
        return codCliente;
    }
    
    public void setCodCliente(int novoCliente){
        this.codCliente = novoCliente;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    public int getSexo(){
        return sexo;
    }
    
    public void setSexo(int novoSexo){
        this.sexo = novoSexo;
    }
    
    public int getStatusCivil(){
        return statusCivil;
    }
    
    public void setStatusCivil(int novoStatusCivil){
        this.statusCivil = novoStatusCivil;
    }
    
    
}
