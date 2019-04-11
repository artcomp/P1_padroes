/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao_03;

import java.util.ArrayList;

/**
 *
 * @author art
 */
public class Bombom implements ProdutoFinal{
    
    //private ArrayList<String> cobertura = new ArrayList<>();
    //private String recheio = "Morango";

    @Override
    public void exibirInfoProdutoFinal() {
        System.out.println("Recheio : Morango\nCobertura : Coco Morango");
    }
    
   
    
}
