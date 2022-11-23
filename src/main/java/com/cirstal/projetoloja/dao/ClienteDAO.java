/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cirstal.projetoloja.dao;

import com.cristal.projetoloja.model.Cliente;
import java.sql.Connection;
import java.sql.Timestamp;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

/**
 * Classe para implementar no banco de dados do objetos do tipo cliente
 * @author robso
 */
public class ClienteDAO {

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
     * Método para salvar objetos do tipo cliente no banco de dados
     * @param obj
     * @return
     * @throws SQLException
     */
    public static boolean salvar(Cliente obj) throws SQLException{
        Connection conexao = null;
        boolean retorno = false;
        
        try {
        
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url,login,senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("INSERT INTO cliente (nome, cpf, email, celular, endereco, dataNasc, nro_casa, cep, sexo, statusCivil) VALUES(?,?,?,?,?,?,?,?,?,?)");
            comandoSQL.setString(1, obj.getNome());
            comandoSQL.setString(2, obj.getCpf());
            comandoSQL.setString(3, obj.getEmail());
            comandoSQL.setString(4, obj.getCelular());
            comandoSQL.setString(5, obj.getEndereco());
            comandoSQL.setDate(6, new java.sql.Date(obj.getDataNasc().getTime()));
            comandoSQL.setInt(7, obj.getNumeroCasa());
            comandoSQL.setString(8, obj.getCep());
            comandoSQL.setInt(9, obj.getSexo());
            comandoSQL.setInt(10, obj.getStatusCivil());
        
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
     * Método para listar objetos do tipo cliente do banco de dados
     * @param obj
     * @return
     * @throws SQLException
     */
    public static ArrayList<Cliente> listar(Cliente obj) throws SQLException{
        Connection conexao = null;
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url,login,senha);

            PreparedStatement comandoSQL =
            conexao.prepareStatement("SELECT * FROM cliente WHERE cpf=?");
            comandoSQL.setString(1, obj.getCpf());
            
            ResultSet rs = comandoSQL.executeQuery();
            
            if(rs!=null){
                while(rs.next()){
                    Cliente novoCliente = new Cliente();
                    novoCliente.setNome(rs.getString("nome"));
                    novoCliente.setCpf(rs.getString("cpf"));
                    novoCliente.setDataNasc(rs.getDate("dataNasc"));
                    novoCliente.setSexo(rs.getInt("sexo"));
                    novoCliente.setStatusCivil(rs.getInt("statusCivil"));
                    novoCliente.setEmail(rs.getString("email"));
                    novoCliente.setCelular(rs.getString("celular"));
                    novoCliente.setCep(rs.getString("cep"));
                    novoCliente.setEndereco(rs.getString("endereco"));
                    novoCliente.setNumeroCasa(rs.getInt("nro_casa"));
                    novoCliente.setCodCliente(rs.getInt("cod_cliente"));
                                                                            
                    lista.add(novoCliente);
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lista;
    }
    
    /**
     * Método para lista objetos pelo CPF
     * @param cpf
     * @return
     */
    public static Cliente listarCPF(String cpf){
        Connection conexao;
        Cliente cliente = null;
        //Cliente cliente = new Cliente();
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url,login,senha);

            PreparedStatement comandoSQL =
            conexao.prepareStatement("SELECT nome, cod_cliente FROM cliente WHERE cpf=?");
            comandoSQL.setString(1, cpf);
            
            ResultSet rs = comandoSQL.executeQuery();
            
            if(rs!=null){
                while(rs.next()){
                    cliente = new Cliente();
                    cliente.setNome(rs.getString("nome"));
                    cliente.setCodCliente(rs.getInt("cod_cliente")); 
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return cliente;
    }
    
    /**
     * Método para atualizar objeto cliente no banco de dados
     * @param obj
     * @return
     */
    public static boolean atualizar(Cliente obj){
        Connection conexao = null;
        boolean retorno = false;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url, login, senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("UPDATE cliente SET nome=?, cpf=?, email=?, celular=?, endereco=?, dataNasc=?, nro_casa=?, cep=?, sexo=?, statusCivil=? WHERE cod_cliente=?");
            comandoSQL.setString(1, obj.getNome());
            comandoSQL.setString(2, obj.getCpf());
            comandoSQL.setString(3, obj.getEmail());
            comandoSQL.setString(4, obj.getCelular());
            comandoSQL.setString(5, obj.getEndereco());
            comandoSQL.setDate(6, new java.sql.Date(obj.getDataNasc().getTime()));
            comandoSQL.setInt(7, obj.getNumeroCasa());
            comandoSQL.setString(8, obj.getCep());
            comandoSQL.setInt(9, obj.getSexo());
            comandoSQL.setInt(10, obj.getStatusCivil());
            comandoSQL.setInt(11, obj.getCodCliente());
            
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
            
            PreparedStatement comandoSQL = conexao.prepareStatement("DELETE FROM Cliente WHERE cod_cliente=?");
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