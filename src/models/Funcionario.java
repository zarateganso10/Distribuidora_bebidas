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
public class Funcionario extends Pessoa{
    private int numCarteira;
    private int numTrabalhos;
    private boolean disponivel;

    public Funcionario(String nome, int numCarteira , String cpf, String telefone) {
        super(nome, cpf, telefone);
        this.numCarteira = numCarteira;
        this.numTrabalhos = 0;
        this.disponivel = true;
    }

    public int getNumCarteira() {
        return numCarteira;
    }

    public void setNumCarteira(int numCarteira) {
        this.numCarteira = numCarteira;
    }

    public int getNumTrabalhos() {
        return numTrabalhos;
    }

    public void adicionarNovoTrabalho(){
        this.numTrabalhos = this.numTrabalhos + 1;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public String getSql(){
        return "INSERT INTO Pessoa (nome, cpf, telefone, numCarteira)"
                +"VALUES ("+ "'" + this.getNome() + "', "
                +"'"+ this.getCpf() + "', "
                +"'"+ this.getTelefone() + "', "
                +"'"+ this.numCarteira + "')";
    }
}
