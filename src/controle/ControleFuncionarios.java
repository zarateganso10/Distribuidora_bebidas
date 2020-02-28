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
import models.Funcionario;
import models.Produto;

/**
 *
 * @author zarate
 */
public class ControleFuncionarios {
    private ArrayList<Funcionario> listaFuncionarios;
    private BancoDados bd;
    private ResultSet rs;


    public ControleFuncionarios(BancoDados bd) throws SQLException {
        this.listaFuncionarios = new ArrayList();
        this.bd = bd;
        this.rs = null;
    }

    public ArrayList<Funcionario> getListaFuncionarios() {
        return listaFuncionarios;
    }
    
    
    
    public boolean adicionarFuncionario(Funcionario funcionario) throws SQLException{
        String cpf = funcionario.getCpf();
        this.rs = bd.querySQL("SELECT * FROM Pessoa");
        while(this.rs.next()){
            String cpff = rs.getString("cpf");
            if(cpff.equals(cpf)){
                return false;
            }
        }
        this.bd.insertSQL(funcionario.getSql());
        return true;
    }
    
    public Funcionario buscarFuncionario(String nomef) throws SQLException{
        this.rs = bd.querySQL("SELECT * FROM Pessoa");
        while(this.rs.next()){
            String nome = rs.getString("nome");
            if(nome.equals(nomef)){
                int numCarteira = Integer.parseInt(rs.getString("numCarteira"));
                String cpf = rs.getString("cpf");
                String telefone = rs.getString("telefone");
                Funcionario funcionario = new Funcionario(nome, numCarteira, cpf, telefone);
                return funcionario;
            }
        }
        return null;
    }
    
    public boolean removerFuncionario(String cpf) throws SQLException{
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

    public Funcionario buscarFuncionario(JTextField tfd_nomeFuncionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
