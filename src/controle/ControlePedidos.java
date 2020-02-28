/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.ResultSet;
import java.sql.SQLException;
import models.Cliente;
import models.Funcionario;
import models.Pedido;
import models.Produto;

/**
 *
 * @author zarate
 */
public class ControlePedidos {
    private BancoDados bd;

    public ControlePedidos(BancoDados bd) {
        this.bd = bd;
    }
    
    public boolean adicionarPedido(Pedido pedido){
        this.bd.insertSQL(pedido.getSql());
        return true;
    }
    
    
    
    
    
    
    
    
    
}
