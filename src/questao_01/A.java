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
public class A {

    private String a1;
    private B a2 = new B();

    public void setA1(String v) {
        this.a2.adiciona(v);
        a1 = v;
    }

    public boolean desfazer() {
        try {
//            a2.remover();
            a1 = a2.get(a2.tamanho() - 1);
            
        } catch (Exception e) {
            return false;
        }

        return true;

    }

    public String getA1() {
        return a1;
    }
    
    

}
