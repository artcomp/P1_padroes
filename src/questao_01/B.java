/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao_01;

import java.util.ArrayList;

/**
 *
 * @author art
 */
public class B {

    ArrayList<C> lista = new ArrayList<>();
    
    public int tamanho(){
        return lista.size();
    }
    
    public void adiciona(String v){
        lista.add(new C(v));
    }
    
    public String get(int id){
        return lista.get(id).getC1();
    }
    
    public void remover(){
        lista.remove(lista.size()-1);
    }
    
}
