/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cirstal.projetoloja.dao;

import static com.cirstal.projetoloja.dao.ClienteDAO.login;
import static com.cirstal.projetoloja.dao.ClienteDAO.senha;
import static com.cirstal.projetoloja.dao.ClienteDAO.url;
import com.cristal.projetoloja.model.Cliente;
import com.cristal.projetoloja.model.Relatorio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author robson.vlima3
 */
public class RelatorioDAO {
    public static ArrayList<Relatorio> listarSintetico(Relatorio obj){
        Connection conexao;
        ArrayList<Relatorio> listaRelatorio = new ArrayList<Relatorio>();
                
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url,login,senha);

            PreparedStatement comandoSQL =
            conexao.prepareStatement("SELECT dataVenda, Cliente.nome, valorTotal FROM Venda inner join Cliente on Venda.cod_Cliente = Cliente.cod_Cliente where dataVenda=?");
            comandoSQL.setDate(1, new java.sql.Date(obj.getDataVenda().getTime()));
            
            ResultSet rs = comandoSQL.executeQuery();
            
            if(rs!=null){
                while(rs.next()){
                    Relatorio relatorio = new Relatorio();
                    relatorio.setDataVenda(rs.getDate("dataVenda"));
                    relatorio.setNomeCliente(rs.getString("Cliente.nome"));
                    relatorio.setValorTotal(rs.getDouble("valorTotal"));
                    
                    listaRelatorio.add(relatorio);
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return listaRelatorio;
    }
    
    public static ArrayList<Relatorio> listarAnalitico(Relatorio obj){
        Connection conexao;
        ArrayList<Relatorio> listaRelatorio = new ArrayList<Relatorio>();
                
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url,login,senha);

            PreparedStatement comandoSQL =
            conexao.prepareStatement("SELECT cod_Produto, quantidadeProduto,valorUnitProduto from itemVenda where cod_Venda=?");
            comandoSQL.setInt(1, obj.getCodVenda());
            
            ResultSet rs = comandoSQL.executeQuery();
            
            if(rs!=null){
                while(rs.next()){
                    Relatorio relatorio = new Relatorio();
                    relatorio.setCodProduto(rs.getInt("cod_Produto"));
                    relatorio.setQuantidadeProduto(rs.getInt("quantidadeProduto"));
                    relatorio.setValorUnitario(rs.getDouble("valorUnitProduto"));
                    
                    listaRelatorio.add(relatorio);
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return listaRelatorio;
    }
}
