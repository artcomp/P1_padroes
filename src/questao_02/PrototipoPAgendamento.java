/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao_02;

/**
 *
 * @author art
 */
public abstract class PrototipoPAgendamento {

    protected String cliente;
    protected String data;

    

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    
    
    public abstract String exibirInfo();
    
    public abstract PrototipoPAgendamento clonar();
    
    
}
