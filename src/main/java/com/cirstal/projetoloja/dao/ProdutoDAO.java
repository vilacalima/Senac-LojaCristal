/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cirstal.projetoloja.dao;

import com.cristal.projetoloja.model.Produto;
import com.cristal.projetoloja.model.Venda;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Classe para implementar no banco de dados do objetos do tipo produto
 * @author robso
 */
public class ProdutoDAO {

    /**
     * Url para consulta no banco de dados
     */
    public static String url = "jdbc:mysql://localhost:3306/lojacristal";

    /**
     * Login para acesso ao banco de dados
     */
    public static String login = "root";

    /**
     * Senha para acesso ao banco de dados Senha usada nos computadores do senac - > P@$$w0rd
     */
    public static String senha = "";
    
    /**
     * Método para salvar objetos do tipo produto no banco de dados
     * @param obj
     * @return
     * @throws SQLException
     */
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
    
    /**
     * Método para listar objetos do tipo produto do banco de dados
     * @param obj
     * @return
     * @throws SQLException
     */
    public static ArrayList<Produto> listar(Produto obj) throws SQLException{
        Connection conexao = null;
        ArrayList<Produto> lista = new ArrayList<Produto>();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url,login,senha);

            PreparedStatement comandoSQL =
            conexao.prepareStatement("SELECT * FROM produto WHERE descricao LIKE ?");
            comandoSQL.setString(1, obj.getDescricao());
            
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
    
    /**
     * Método para listar uma seleção de objetos do tipo produto do banco de dados exceto o fornecedor
     * @param obj
     * @return
     * @throws SQLException
     */
    public static ArrayList<Produto> listarSelecao(Produto obj) throws SQLException{
        Connection conexao = null;
        ArrayList<Produto> lista = new ArrayList<Produto>();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url,login,senha);

            PreparedStatement comandoSQL =
            conexao.prepareStatement("SELECT * FROM produto where descricao LIKE ?");
            comandoSQL.setString(1, obj.getDescricao());
            //cod_produto, descricao, cor, tamanho, valor
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
                    
                    
                    lista.add(novoProduto);
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lista;
    }
        
    /**
     * Método para atualizar objeto produto no banco de dados
     * @param obj
     * @return
     */
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
    
    /**
     * Método para excluir cliente no banco de dados
     * @param id
     * @return
     */
    public static boolean excluir(int id){
    
        Connection conexao = null;
        boolean retorno = false;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexao = DriverManager.getConnection(url,login,senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("DELETE FROM Produto WHERE cod_produto=?");
            comandoSQL.setInt(1,id);            
            
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
