/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cristal.projetoloja.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Classe para retornar objetos do tipo Venda
 * @author robso
 */
public class Venda {
    private int codVenda;
    private int numeroVenda;
    private double valorTotalVenda;
    private int cliente;
    private int vendedor;    
    private int tipoPagamento;
    private Date dataVenda;    
    private ArrayList<ItemVenda> listaProdutos = null;
            
    /**
     * Busca para o objeto venda
     */
    public Venda(){
        
    }
    
    /**
     * Busca para o objeto venda pelos parametros
     * @param codVenda
     * @param numeroVenda
     * @param valorTotalVenda
     */
    public Venda(int codVenda, int numeroVenda, double valorTotalVenda){
        this.codVenda = codVenda;
        this.numeroVenda = numeroVenda;
        this.valorTotalVenda = valorTotalVenda;
    }
    
    /**
     * Retorna uma lista com os itens da venda
     * @return ArrayList listaProduto
     */
    public ArrayList<ItemVenda> getListaProdutos(){
        return listaProdutos;
    }
    
    /**
     * Pega a lista de itens da venda
     * @param novoListaProdutos
     */
    public void setListaProdutos(ArrayList<ItemVenda> novoListaProdutos){
        this.listaProdutos = novoListaProdutos;
    }
    
    /**
     * Retorna o código do cliente
     * @return int vendedor
     */
    public int getCliente() {
        return cliente;
    }

    /**
     * Pega o código do cliente
     * @param novoCliente
     */
    public void setCliente(int novoCliente) {
        this.cliente = novoCliente;
    }

    /**
     * Retorna o código do vendedor
     * @return int vendedor
     */
    public int getVendedor() {
        return vendedor;
    }

    /**
     * Pega o código do vendedor
     * @param novoVendedor
     */
    public void setVendedor(int novoVendedor) {
        this.vendedor = novoVendedor;
    }

    /**
     * Retorna o tipo de pagamento desejado
     * @return int tipoPagamento
     */
    public int getTipoPagamento() {
        return tipoPagamento;
    }

    /**
     * Pega o tipo de pagamento
     * @param novoTipoPagamento
     */
    public void setTipoPagamento(int novoTipoPagamento) {
        this.tipoPagamento = novoTipoPagamento;
    }
    
    /**
     * Retorna a data de venda
     * @return Date dataVenda
     */
    public Date getDataVenda() {
        return dataVenda;
    }

    /**
     * Pega a data de Venda
     * @param dataVenda
     */
    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }
    
    /**
     * Retorna o código de Venda
     * @return int codVenda
     */
    public int getCodVenda(){
        return codVenda;
    }
    
    /**
     * Pega o código de venda
     * @param novoCodVenda
     */
    public void setCodVenda(int novoCodVenda){
        this.codVenda = novoCodVenda;
    }
    
    /**
     * Retorna o numero da venda
     * @return int numeroVenda
     */
    public int getNumeroVenda(){
        return numeroVenda;
    }
    
    /**
     * Pega o numero da venda
     * @param novoNumeroVenda
     */
    public void setNumeroVenda(int novoNumeroVenda){
        this.numeroVenda = novoNumeroVenda;
    }
    
    /**
     * Retorna o valor total da venda
     * @return double valorTotalVenda
     */
    public double getValorTotalVenda(){
        return valorTotalVenda;
    }
    
    /**
     * Pegar o valor total da venda
     * @param novoValorTotalVenda
     */
    public void setValorTotalVenda(double novoValorTotalVenda){
        this.valorTotalVenda = novoValorTotalVenda;
    }
}
