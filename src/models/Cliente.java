/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author zarate
 */
public class Cliente extends Pessoa{
    private String endereco;

    public Cliente(String nome, String cpf, String telefone, String endereco) {
        super(nome, cpf, telefone);
        this.endereco = endereco;
    }
    
    

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getSql(){
        return "INSERT INTO Pessoa (nome, cpf, telefone, endereco)"
                +"VALUES ("+ "'" + this.getNome() + "', "
                +"'"+ this.getCpf() + "', "
                +"'"+ this.getTelefone() + "', "
                +"'"+ this.endereco + "')";
    }

    @Override
    public String toString() {
        return "Cliente{" + "endereco=" + endereco + '}';
    }
}
