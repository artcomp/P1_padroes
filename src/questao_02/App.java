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
public class App {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        Funcionario funcionario  = new Funcionario();
        
        BuscaETras bet  = new BuscaETras();
        
        //cliente
        bet.setCliente("joao");
        bet.setData("02/02/2015");
        bet.setEnd_busca("Rua X");
        bet.setEnd_entrega("Rua A");
        
        // Cria prototipo
        PrototipoPBuscaETras prototipo = bet.clonar();
        
        // add dados 
        cliente.getFicha().add(prototipo);
        funcionario.getCaixa().add(prototipo);
        
        System.out.println(prototipo.exibirInfo());
        System.out.println("\n\n\n");
        //----------------
        
        // alterando um atributo qualquer
        bet.setData("05/02/2015");
        
        // clona novamente
        prototipo = bet.clonar();
        
        // add info 
        cliente.getFicha().add(prototipo);
        funcionario.getCaixa().add(prototipo);
        
        System.out.println(prototipo.exibirInfo());
        
        
        
        //       Agendamento
        
        System.out.println("\n\n\n\t\t\tAgendamento\n\n\n");
        
        Agendamento agendamento = new Agendamento();
        
        agendamento.setCliente("joao");
        agendamento.setData("02/05/2018");
        
        PrototipoPAgendamento prot_agendamento = agendamento.clonar();
        System.out.println(prot_agendamento.exibirInfo());
        
        cliente.getFicha().add(agendamento);
        funcionario.getCaixa().add(agendamento);
        
        agendamento.setData("05/05/2018");
        prot_agendamento = agendamento.clonar();
        
        
        System.out.println("\n\n\n");
        System.out.println(prot_agendamento.exibirInfo());
        
        cliente.getFicha().add(agendamento);
        funcionario.getCaixa().add(agendamento);
        
        
    }
    
}
