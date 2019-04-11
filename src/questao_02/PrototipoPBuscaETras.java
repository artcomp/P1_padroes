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
public abstract class PrototipoPBuscaETras {
    protected String cliente;
    protected String data;
    protected String end_busca;
    protected String end_entrega;

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

    public String getEnd_busca() {
        return end_busca;
    }

    public void setEnd_busca(String end_busca) {
        this.end_busca = end_busca;
    }

    public String getEnd_entrega() {
        return end_entrega;
    }

    public void setEnd_entrega(String end_entrega) {
        this.end_entrega = end_entrega;
    }
    
    public abstract String exibirInfo();
    
    public abstract PrototipoPBuscaETras clonar();
}
