/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.Cliente;
import models.Funcionario;
import models.Produto;

/**
 *
 * @author zarate
 */
public class ControleProdutos {
    private BancoDados bd;
    private ArrayList<Produto> listaProdutos;
    private ResultSet rs;

    public ControleProdutos(BancoDados bd) throws SQLException {
        this.bd = bd;
        this.listaProdutos = new ArrayList();
        this.rs = bd.querySQL("SELECT * FROM Produto");
        while(this.rs.next()){
            String nome = rs.getString("nome");
            String categoria = rs.getString("categoria");
            Produto produto = new Produto(nome, categoria);
            this.listaProdutos.add(produto);
        }
        
        
    }
    
    public boolean adicionarProduto(Produto produto){
        this.bd.insertSQL(produto.getSql());
        return true;
    }
    
    public boolean removerProduto(String nome) throws SQLException{
        this.rs = bd.querySQL("SELECT * FROM Produto");
        while(this.rs.next()){
            String nomep = rs.getString("nome");
            if(nomep.equals(nome)){
                String sql;
                sql = "DELETE FROM Produto WHERE nome = "+ nome;
                this.bd.deleteSQL(sql);
                return true;
            }
        }
        return false;
    }
    
    public Produto buscarProduto(String nome) throws SQLException{
        this.rs = bd.querySQL("SELECT * FROM Produto");
        while(this.rs.next()){
            String nomep = rs.getString("nome");
            if(nomep.equals(nome)){
                String categoria = this.rs.getString("categoria");
                return new Produto(nome, categoria);
            }
        }
        return null;
    }
}
