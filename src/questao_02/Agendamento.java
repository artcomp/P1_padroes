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
public class Agendamento  extends PrototipoPAgendamento{
    
    
     public Agendamento() {
        cliente = "";
        data = "";
        
    }
    
 
       public Agendamento(Agendamento b) {
        cliente = b.getCliente();
        data = b.getData();
        
    }
 
    @Override
    public String exibirInfo() {
        return "Cliente = " + this.getCliente() + "\nData = " + this.getData();
    }

    @Override
    public PrototipoPAgendamento clonar() {
        return new Agendamento(this);
    }

}

