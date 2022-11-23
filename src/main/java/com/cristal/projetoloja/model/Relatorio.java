/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cristal.projetoloja.model;

import java.util.Date;

/**
 * Classe para objeto do tipo Relatório
 * @author robson.vlima3
 */
public class Relatorio {

    private Date dataVenda;
    private Date dataEntrada;
    private Date dataSaida;
    private String nomeCliente;
    private Double valorTotal;
    private int codVenda;
    private String descricaoProduto;
    private int quantidadeProduto;
    private Double valorUnitario;
     
    /**
     * Busca para o objeto Relatório
     */
    public Relatorio(){
        
    }
    
    /**
     * Busca para o objeto relatório pelo codigo de venda
     * @param codVenda
     */
    public Relatorio(int codVenda){
        this.codVenda = codVenda;
    }
    
    /**
     * Busca para o objeto relatório pelos parametros
     * @param dataEntrada
     * @param dataSaida
     */
    public Relatorio(Date dataEntrada, Date dataSaida) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }
    
    /**
     * Busca para o objeto relatório pelos parametros
     * @param dataVenda
     * @param nomeCliente
     * @param valorTotal
     */
    public Relatorio(Date dataVenda, String nomeCliente, Double valorTotal) {
        this.dataVenda = dataVenda;
        this.nomeCliente = nomeCliente;
        this.valorTotal = valorTotal;
    }
    
    /**
     * Busca para o objeto relatório pelos parametros
     * @param dataVenda
     * @param nomeCliente
     * @param valorTotal
     * @param codVenda
     * @param descricaoProduto
     * @param quantidadeProduto
     * @param valorUnitario
     */
    public Relatorio(Date dataVenda, String nomeCliente, Double valorTotal, int codVenda, String descricaoProduto, int quantidadeProduto, Double valorUnitario) {
        this.dataVenda = dataVenda;
        this.nomeCliente = nomeCliente;
        this.valorTotal = valorTotal;
        this.codVenda = codVenda;
        this.descricaoProduto = descricaoProduto;
        this.quantidadeProduto = quantidadeProduto;
        this.valorUnitario = valorUnitario;
    }
    
    /**
     * Retorna a data de entrada para o Relatório
     * @return Date dataEntrada
     */
    public Date getDataEntrada() {
        return dataEntrada;
    }

    /**
     * Pega a data de entrada para o Relatório
     * @param dataEntrada
     */
    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    /**
     * Retorna a data de saída para o Relatório
     * @return Date dataSaida
     */
    public Date getDataSaida() {
        return dataSaida;
    }

    /**
     * Pega a data de saída do Relatório
     * @param dataSaida
     */
    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }
    
    /**
     * Retorna a data de venda do Relatório
     * @return Date dataVenda
     */
    public Date getDataVenda() {
        return dataVenda;
    }

    /**
     * Pega a data de venda do Relatório
     * @param dataVenda
     */
    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    /**
     * Retorna o nome do cliente 
     * @return String nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * Pega o nome do cliente
     * @param nomeCliente
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * Retorna o valor total da venda
     * @return double valorTotal
     */
    public Double getValorTotal() {
        return valorTotal;
    }

    /**
     * Pega valor valor total da venda
     * @param valorTotal
     */
    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * Retorna o código da venda
     * @return iint codVenda
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
     * Retorna a descrição do Produto
     * @return String descricaoProduto
     */
    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    /**
     * Pega a descrição do produto
     * @param descricaoProduto
     */
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    /**
     * Retorna a quantidade do produto
     * @return int quantidadeProduto
     */
    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    /**
     * Pega a quantidade do produto
     * @param quantidadeProduto
     */
    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    /**
     * Retorna o valor unitário do produto
     * @return valorUnitario
     */
    public Double getValorUnitario() {
        return valorUnitario;
    }

    //sintetico

    /**
     * Pega o valor unitário do produto
     * @param valorUnitario
     */
    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }    
}
