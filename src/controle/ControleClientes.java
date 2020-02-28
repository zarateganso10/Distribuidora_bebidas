/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTextField;
import models.Cliente;
import models.Pessoa;

/**
 *
 * @author zarate
 */
public class ControleClientes {
    private ArrayList<Pessoa> listaPessoas;
    private BancoDados bd;
    private ResultSet rs;

    public ControleClientes(BancoDados bd) {
        this.listaPessoas = new ArrayList();
        this.bd = bd;
        this.rs = null;
    }

    public ArrayList<Pessoa> getListaPessoas() {
        return listaPessoas;
    }

    public boolean adicionarCliente(String nome, String cpf, String telefone, String endereco){
        Cliente nova = new Cliente(nome, cpf, telefone, endereco);
        for(Pessoa pessoa: this.listaPessoas){
            if(pessoa.getCpf().equals(cpf)){
                return false;
            }
        }
        this.listaPessoas.add(nova);
        this.bd.insertSQL(nova.getSql());
        return true;
    }
    
    public boolean adicionarCliente(Cliente client) throws SQLException{
        String cpf = client.getCpf();
//        for(Pessoa pessoa: this.listaPessoas){
//            if(pessoa.getCpf().equals(cpf)){
//                return false;
//            }
//        }
        this.rs = bd.querySQL("SELECT * FROM Pessoa");
        while(this.rs.next()){
            String cpff = rs.getString("cpf");
            if(cpff.equals(cpf)){
                return false;
            }
        }
        this.bd.insertSQL(client.getSql());
        return true;
    }
    public boolean removerCliente(String cpf) throws SQLException{
        this.rs = bd.querySQL("SELECT * FROM Pessoa");
        while(this.rs.next()){
            String cpff = rs.getString("cpf");
            if(cpff.equals(cpf)){
                String sql;
                sql = "DELETE FROM Pessoa WHERE cpf = "+ cpf;
                this.bd.deleteSQL(sql);
                return true;
            }
        }
        return false;
    }
    
    public Cliente buscarCliente(String nome) throws SQLException{
        this.rs = bd.querySQL("SELECT * FROM Pessoa");
        while(this.rs.next()){
            String nomec = rs.getString("nome");
            if(nomec.equals(nome)){
                String cpf = rs.getString("cpf");
                String telefone = rs.getString("telefone");
                String endereco = rs.getString("endereco");
                return new Cliente(nome, cpf, telefone, endereco);
            }
        }
        return null;
    }

    public Cliente buscarCliente(JTextField tfd_nomeCliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
