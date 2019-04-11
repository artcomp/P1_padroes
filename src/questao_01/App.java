/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao_01;

/**
 *
 * @author art
 */
public class App {


    public static void main(String[] args) {
        
        A cliente = new A();
        cliente.setA1("something");
        
        System.out.println(cliente.getA1());
        
        cliente.setA1("something else");
        System.out.println(cliente.getA1());
        
        cliente.desfazer();
        System.out.println(cliente.getA1());
        
     
       
        
    }
    
}
