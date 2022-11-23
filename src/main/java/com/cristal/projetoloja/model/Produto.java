/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cristal.projetoloja.model;

/**
 * Classe para o objeto Produto
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
    
    /**
     * Busca para o objeto Produto
     */
    public Produto(){
    
    }
    
    /**
     * Busca para o objeto produto pela descrição do produto
     * @param descricao
     */
    public Produto(String descricao){
        this.descricao = descricao;
    }

    /**
     * Busca para o objeto produto pelo código do produto
     * @param codigo
     */
    public Produto(int codigo){
        this.codigo = codigo;
    }
    
    /**
     * Busca para o objeto produto pelos parametros
     * @param descricao
     * @param cor
     * @param tamanho
     * @param valor
     * @param quantidade
     * @param fornecedor
     */
    public Produto(String descricao, String cor, int tamanho, double valor, int quantidade, String fornecedor){
        this.descricao = descricao;
        this.cor = cor;
        this.tamanho = tamanho;
        this.valor = valor;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;        
    }
        
    /**
     * Retorna o código do Produto
     * @return int codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Pega código do Produto
     * @param novoCodigo
     */
    public void setCodigo(int novoCodigo) {
        this.codigo = novoCodigo;
    }

    /**
     * Retorna Descrição do Produto
     * @return String descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Pega descrição do Produto
     * @param novaDescricao
     */
    public void setDescricao(String novaDescricao) {
        this.descricao = novaDescricao;
    }

    /**
     * Retorna cor do Produto
     * @return String cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * Pega cor do produto
     * @param novaCor
     */
    public void setCor(String novaCor) {
        this.cor = novaCor;
    }

    /**
     * Retorna tamanho do Produto
     * @return int tamanho
     */
    public int getTamanho() {
        return tamanho;
    }

    /**
     * Pega tamanho do Produto
     * @param novoTamanho
     */
    public void setTamanho(int novoTamanho) {
        this.tamanho = novoTamanho;
    }

    /**
     * Retorna valor do Produto
     * @return double valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * Pega valor do Produto
     * @param novoValor
     */
    public void setValor(double novoValor) {
        this.valor = novoValor;
    }

    /**
     * Retorna quantidade do Produto
     * @return int quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Pega quantidade do Produto
     * @param novaQuantidade
     */
    public void setQuantidade(int novaQuantidade) {
        this.quantidade = novaQuantidade;
    }

    /**
     * Retorna fornecedor do Produto
     * @return String Fornecedor
     */
    public String getFornecedor() {
        return fornecedor;
    }

    /**
     * Pega fornecedor do Produto
     * @param novoFornecedor
     */
    public void setFornecedor(String novoFornecedor) {
        this.fornecedor = novoFornecedor;
    }
    
}
