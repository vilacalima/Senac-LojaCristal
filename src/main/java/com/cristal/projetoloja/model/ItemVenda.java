/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cristal.projetoloja.model;

/**
 *
 * @author robso
 */
public class ItemVenda {

    private int codItemVenda;
    private int codVenda;
    private int codProduto;
    private String descricaoProduto;
    private double valorUnitProduto;
    private int quantidadeProduto;    
    private int codCliente;
    
    public ItemVenda(){
        
    }
    public ItemVenda(int codVenda, int codProduto, int quantidadeProduto, double valorUnitProduto) {
        this.codVenda = codVenda;
        this.codProduto = codProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.valorUnitProduto = valorUnitProduto;
        
    }
        
    public int getCodItemVenda() {
        return codItemVenda;
    }

    public void setCodItemVenda(int novoCodItemVenda) {
        this.codItemVenda = novoCodItemVenda;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int novoCodProduto) {
        this.codProduto = novoCodProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String novoDescricaoProduto) {
        this.descricaoProduto = novoDescricaoProduto;
    }
    
    public int getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public double getValorUnitProduto() {
        return valorUnitProduto;
    }

    public void setValorUnitProduto(double novoValorUnitProduto) {
        this.valorUnitProduto = novoValorUnitProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int novoQuantidadeProduto) {
        this.quantidadeProduto = novoQuantidadeProduto;
    }
}
