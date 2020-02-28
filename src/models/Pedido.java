/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controle.BancoDados;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author zarate
 */
public class Pedido {
    private Cliente cliente;
    private int id_cliente;
    private String data;
    private Funcionario funcionario;
    private int id_funcionario;
    private int numPedido;
    private Produto produto;
    private int id_produto;
    private ResultSet rs;
    private BancoDados bd;

    public Pedido(int numPedido, String data, BancoDados bd) {
        this.data = data;
        this.numPedido = numPedido;
        this.bd = bd;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public Produto getProduto() {
        return produto;
    }
    
    
    
    public boolean incluirCliente(String nome) throws SQLException{
        this.rs = bd.querySQL("SELECT * FROM Pessoa");
        while(this.rs.next()){
            String nomec = this.rs.getString("nome");
            if(nomec.equals(nome)){
                String cpf = this.rs.getString("cpf");
                String telefone = this.rs.getString("telefone");
                String endereco = this.rs.getString("endereco");
                this.id_cliente = Integer.parseInt(this.rs.getString("idPessoa"));
                this.cliente = new Cliente(nome, cpf, telefone, endereco);
                return true;
            }
        }
        return false;
    }
    
    public boolean incluirFuncionario(String nome) throws SQLException{
        this.rs = bd.querySQL("SELECT * FROM Pessoa");
        while(this.rs.next()){
            String nomef = rs.getString("nome");
            if(nomef.equals(nome)){
                int numCarteira = Integer.parseInt(rs.getString("numCarteira"));
                String cpf = rs.getString("cpf");
                String telefone = rs.getString("telefone");
                this.id_funcionario = Integer.parseInt(this.rs.getString("idPessoa"));
                this.funcionario = new Funcionario(nome, numCarteira, cpf, telefone);
                return true;
            }
        }
        return false;
    }
    
    public boolean incluirProduto(String nome) throws SQLException{
        this.rs = bd.querySQL("SELECT * FROM Produto");
        while(this.rs.next()){
            String nomep = rs.getString("nome");
            if(nomep.equals(nome)){
                String categoria = this.rs.getString("categoria");
                this.id_produto = Integer.parseInt(this.rs.getString("idProduto"));
                this.produto = new Produto(nome, categoria);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pedido{" + "cliente=" + cliente + ", id_cliente=" + id_cliente + ", data=" + data + ", funcionario=" + funcionario + ", id_funcionario=" + id_funcionario + ", numPedido=" + numPedido + ", produto=" + produto + ", id_produto=" + id_produto + ", rs=" + rs + ", bd=" + bd + '}';
    }
    
    
    
    public String getSql(){
        return "INSERT INTO Pedido ( idPedido , data, Produto_idProduto, Cliente_idPessoa, Funcionario_idPessoa)"
                +" VALUES (" + this.numPedido + ", "
                +"'"+ this.data + "', "
                + this.id_produto + ", "
                + this.id_cliente + ", "
                + this.id_funcionario+")";
    }
    
    
}
