/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cirstal.projetoloja.dao;

import com.cristal.projetoloja.model.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author robso
 */
public class ProdutoDAO {
    public static String url = "jdbc:mysql://localhost:3306/lojacristal";
    public static String login = "root";
    public static String senha = "P@$$w0rd";
    
    public static boolean salvar(Produto obj) throws SQLException{
        Connection conexao = null;
        boolean retorno = false;
        
        try {
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url,login,senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO produto (cor, descricao, fornecedor, quantidade, tamanho, valor) VALUES(?,?,?,?,?,?)");
            comandoSQL.setString(1, obj.getCor());
            comandoSQL.setString(2, obj.getDescricao());
            comandoSQL.setString(3, obj.getFornecedor());
            comandoSQL.setInt(4, obj.getQuantidade());
            comandoSQL.setInt(5, obj.getTamanho());
            comandoSQL.setDouble(6, obj.getValor());
        
            int linhasAfetadas = comandoSQL.executeUpdate();
            if(linhasAfetadas>0){
                retorno = true;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return retorno;
    }
    
    public static ArrayList<Produto> listar(Produto obj) throws SQLException{
        Connection conexao = null;
        ArrayList<Produto> lista = new ArrayList<Produto>();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url,login,senha);

            PreparedStatement comandoSQL =
            conexao.prepareStatement("SELECT * FROM produto where descricao=?");
            comandoSQL.setInt(1, obj.getCodigo());
            
            ResultSet rs = comandoSQL.executeQuery();

            if(rs != null){
                while(rs.next()){
                    Produto novoProduto = new Produto();
                    novoProduto.setCodigo(rs.getInt("cod_produto"));
                    novoProduto.setDescricao(rs.getString("descricao"));
                    novoProduto.setCor(rs.getString("cor"));
                    novoProduto.setTamanho(rs.getInt("tamanho"));
                    novoProduto.setValor(rs.getDouble("valor"));
                    novoProduto.setQuantidade(rs.getInt("quantidade"));
                    novoProduto.setFornecedor(rs.getString("fornecedor"));
                    
                    lista.add(novoProduto);
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lista;
    }
    
    public static Produto consultar(int produto){
        Produto lista = new Produto();
        return lista;
    }
    
    public static boolean atualizar(Produto obj){
        Connection conexao = null;
        boolean retorno = false;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url, login, senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("UPDATE produto SET cor=?, descricao=?, fornecedor=?, quantidade=?, tamanho=?, valor=? WHERE cod_produto=?");
            comandoSQL.setString(1, obj.getCor());
            comandoSQL.setString(2, obj.getDescricao());
            comandoSQL.setString(3, obj.getFornecedor());
            comandoSQL.setInt(4, obj.getQuantidade());
            comandoSQL.setInt(5, obj.getTamanho());
            comandoSQL.setDouble(6, obj.getValor());
            comandoSQL.setInt(7, obj.getCodigo());
            
            int linhasAfetadas = comandoSQL.executeUpdate();
            if(linhasAfetadas>0){
                retorno = true;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return retorno;
    }
    
    public static boolean excluir(int id){
    
        Connection conexao = null;
        boolean retorno = false;
        
        try {
            
            //TODO: Implementar insert na tabela NotaFiscal
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Abrir a conexão
            conexao = DriverManager.getConnection(url,login,senha);
            
            //Criar o comando sql
            PreparedStatement comandoSQL = conexao.prepareStatement("DELETE FROM NotaFiscal WHERE idNota=?");
            comandoSQL.setInt(1,id);            
            
            //Executar o comando
            int linhasAfetadas = comandoSQL.executeUpdate();
            if(linhasAfetadas>0){
               retorno = true;
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return retorno;
    
    }
        
}
