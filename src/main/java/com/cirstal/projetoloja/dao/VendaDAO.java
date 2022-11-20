/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cirstal.projetoloja.dao;

import com.cristal.projetoloja.model.ItemVenda;
import com.cristal.projetoloja.model.Venda;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author robso
 */
public class VendaDAO {
    
    static String URL = "jdbc:mysql://localhost:3306/lojacristal";
    static String Login = "root";
    static String Senha = ""; //P@$$w0rd
    
    public static boolean salvar(Venda obj) {
        boolean retorno = false;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexao = DriverManager.getConnection(URL, Login, Senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO Venda (valorTotal, dataVenda, cod_Cliente, cod_Vendedor, tipoPagamento) VALUES (?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            comandoSQL.setDouble(1, obj.getValorTotalVenda());
            comandoSQL.setDate(2, new java.sql.Date(obj.getDataVenda().getTime()));
            comandoSQL.setInt(3, obj.getCliente());
            comandoSQL.setInt(4, obj.getVendedor());
            comandoSQL.setInt(5, obj.getTipoPagamento());
                 
            int linhasAfetadas = comandoSQL.executeUpdate();
            if (linhasAfetadas > 0) {
                ResultSet rs = comandoSQL.getGeneratedKeys();
                if (rs .next()) {
                    int codVenda = rs.getInt(1);
                    for (ItemVenda item : obj.getListaProdutos()) {
                        PreparedStatement comandoSQLItem = conexao.prepareStatement("INSERT INTO ItemVenda (cod_Venda,cod_Produto,quantidadeProduto,valorUnitProduto) VALUES (?,?,?,?)");
                        comandoSQLItem.setInt(1, codVenda);
                        comandoSQLItem.setInt(2, item.getCodProduto());
                        comandoSQLItem.setInt(3, item.getQuantidadeProduto());
                        comandoSQLItem.setDouble(4,item.getValorUnitProduto());
                        

                        int linhasAfetadasItem = comandoSQLItem.executeUpdate();
                        if(linhasAfetadasItem>0){
                            retorno = true;
                        }
                    }
                }
            }
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return retorno;
        
    }
}
