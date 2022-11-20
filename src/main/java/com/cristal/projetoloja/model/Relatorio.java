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
    private Date dataEntrada;
    private Date dataSaida;
    private String nomeCliente;
    private Double valorTotal;
    private int codVenda;
    
    
    //Analitico
    private String descricaoProduto;
    private int quantidadeProduto;
    private Double valorUnitario;
     
    public Relatorio(){
        
    }
    
    public Relatorio(int codVenda){
        this.codVenda = codVenda;
    }
    
    public Relatorio(Date dataEntrada, Date dataSaida) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }
    
    public Relatorio(Date dataVenda, String nomeCliente, Double valorTotal) {
        this.dataVenda = dataVenda;
        this.nomeCliente = nomeCliente;
        this.valorTotal = valorTotal;
    }
    
    public Relatorio(Date dataVenda, String nomeCliente, Double valorTotal, int codVenda, String descricaoProduto, int quantidadeProduto, Double valorUnitario) {
        this.dataVenda = dataVenda;
        this.nomeCliente = nomeCliente;
        this.valorTotal = valorTotal;
        this.codVenda = codVenda;
        this.descricaoProduto = descricaoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.valorUnitario = valorUnitario;
    }
    
    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
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

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
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
