/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cristal.projetoloja.model;

import java.util.Date;

/**
 *
 * @author robson.vlima3
 */
public class Relatorio {

    private Date dataVenda;
    private String nomeCliente;
    private Double valorTotal;
    private int codVenda;
    
    //Analitico
    private int codProduto;
    private int quantidadeProduto;
    private Double valorUnitario;
    
    public Relatorio(){
        
    }
    
    public Relatorio(Date dataVenda, String nomeCliente, Double valorTotal) {
        this.dataVenda = dataVenda;
        this.nomeCliente = nomeCliente;
        this.valorTotal = valorTotal;
    }
    
    public Relatorio(Date dataVenda, String nomeCliente, Double valorTotal, int codVenda, int codProduto, int quantidadeProduto, Double valorUnitario) {
        this.dataVenda = dataVenda;
        this.nomeCliente = nomeCliente;
        this.valorTotal = valorTotal;
        this.codVenda = codVenda;
        this.codProduto = codProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.valorUnitario = valorUnitario;
    }
    
    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getCodVenda() {
        return codVenda;
    }

    public void setCodVenda(int codVenda) {
        this.codVenda = codVenda;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    //sintetico
    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }    
}
