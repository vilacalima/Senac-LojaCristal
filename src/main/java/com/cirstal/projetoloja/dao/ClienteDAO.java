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
 *
 * @author robso
 */
public class ClienteDAO {
    public static String url = "jdbc:mysql://localhost:3306/lojacristal";
    public static String login = "root";
    public static String senha = "P@$$w0rd";
    
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
                                                                            
                    lista.add(novoCliente);
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lista;
    }
    
    public static Cliente consultarPorCpf(String cpf){
        Cliente lista = new Cliente();
        return lista;
    }
    
    public static boolean atualizar(Cliente obj){
        Connection conexao = null;
        boolean retorno = false;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(url, login, senha);
            
            PreparedStatement comandoSQL = conexao.prepareStatement("UPDATE Cliente SET nome=?, cpf=?, email=?, endereco=?, nro_casa=? celular=? cep=? dataNasc=? sexo=? statusCivil=? WHERE cod_cliente=?");
            comandoSQL.setString(1, obj.getNome());
            comandoSQL.setString(2, obj.getCpf());
            comandoSQL.setString(3, obj.getEmail());
            comandoSQL.setString(4, obj.getEndereco());
            comandoSQL.setInt(5, obj.getNumeroCasa());
            comandoSQL.setString(6, obj.getCelular());
            comandoSQL.setString(7, obj.getCep());
            comandoSQL.setDate(8, new java.sql.Date(obj.getDataNasc().getTime()));
            comandoSQL.setInt(9, obj.getSexo());
            comandoSQL.setInt(10, obj.getStatusCivil());
            comandoSQL.setDouble(11, obj.getCodCliente());
            
            //Inserir os demais argummentos
            
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
            PreparedStatement comandoSQL = conexao.prepareStatement("DELETE FROM Cliente WHERE cod_cliente=?");
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

