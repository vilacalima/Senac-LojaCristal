/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cristal.projetoloja.model;

/**
 * Classe para objetos do tipo itens da Venda
 * @author robso
 */
public class ItemVenda {

    private int codItemVenda;
    private int codVenda;
    private int codProduto;
    private String descricaoProduto;
    private double valorUnitProduto;
    private int quantidadeProduto;    
    
    /**
     * Busca para o objeto ItemVenda
     */
    public ItemVenda(){
        
    }

    /**
     * Busca para o objeto ItemVenda pelos parametros
     * @param codVenda
     * @param codProduto
     * @param quantidadeProduto
     * @param valorUnitProduto
     */
    public ItemVenda(int codVenda, int codProduto, int quantidadeProduto, double valorUnitProduto) {
        this.codVenda = codVenda;
        this.codProduto = codProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.valorUnitProduto = valorUnitProduto;
        
    }
        
    /**
     * Retorna o código do item da venda
     * @return int codItemVenda
     */
    public int getCodItemVenda() {
        return codItemVenda;
    }

    /**
     * Pega o código do item da venda
     * @param novoCodItemVenda
     */
    public void setCodItemVenda(int novoCodItemVenda) {
        this.codItemVenda = novoCodItemVenda;
    }

    /**
     * Retorna o código do produto
     * @return int codProduto
     */
    public int getCodProduto() {
        return codProduto;
    }

    /**
     * Pega o código do produto
     * @param novoCodProduto
     */
    public void setCodProduto(int novoCodProduto) {
        this.codProduto = novoCodProduto;
    }

    /**
     * Retorna a descrição do produto
     * @return String descricaoProduto
     */
    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    /**
     * Pega a descrição do produto
     * @param novoDescricaoProduto
     */
    public void setDescricaoProduto(String novoDescricaoProduto) {
        this.descricaoProduto = novoDescricaoProduto;
    }
    
    /**
     * Retorna o código da venda
     * @return
     */
    public int getCodVenda() {
        return codVenda;
    }

    /**
     * Pega o código da venda
     * @param codVenda
     */
    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }

    /**
     * Retorna o valor unitário do Produto
     * @return double valorUnitProduto
     */
    public double getValorUnitProduto() {
        return valorUnitProduto;
    }

    /**
     * Pega o valor unitário do Produto
     * @param novoValorUnitProduto
     */
    public void setValorUnitProduto(double novoValorUnitProduto) {
        this.valorUnitProduto = novoValorUnitProduto;
    }

    /**
     * Retorna a quantidade do Produto
     * @return int quantidadeProduto
     */
    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    /**
     * Pega a quantidade do Produto
     * @param novoQuantidadeProduto
     */
    public void setQuantidadeProduto(int novoQuantidadeProduto) {
        this.quantidadeProduto = novoQuantidadeProduto;
    }
}
