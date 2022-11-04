/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cristal.projetoloja.model;

/**
 *
 * @author robson.vlima3
 */
public class Produto {

    
    private int codigo;
    private String descricao;
    private String cor;
    private int tamanho;
    private double valor;
    private int quantidade;
    private String fornecedor;
    
    public Produto(){
    
    }
    
    public Produto(String descricao){
        this.descricao = descricao;
    }
    
    public Produto(String descricao, String cor, int tamanho, double valor, int quantidade, String fornecedor){
        this.descricao = descricao;
        this.cor = cor;
        this.tamanho = tamanho;
        this.valor = valor;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;        
    }
    
    public Produto(int codigo, String descricao, String cor, int tamanho, double valor, int quantidade, String fornecedor){
        this.codigo = codigo;
        this.descricao = descricao;
        this.cor = cor;
        this.tamanho = tamanho;
        this.valor = valor;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;        
    }
        
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int novoCodigo) {
        this.codigo = novoCodigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String novaDescricao) {
        this.descricao = novaDescricao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String novaCor) {
        this.cor = novaCor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int novoTamanho) {
        this.tamanho = novoTamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double novoValor) {
        this.valor = novoValor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int novaQuantidade) {
        this.quantidade = novaQuantidade;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String novoFornecedor) {
        this.fornecedor = novoFornecedor;
    }
    
}
