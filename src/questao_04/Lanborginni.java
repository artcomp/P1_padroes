/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao_04;

/**
 *
 * @author art
 */
public class Lanborginni extends CarroBuilder {

    
        @Override
    public void geraRaioRoda() {
        carro.raioRoda = "24inch";
    
    }

    @Override
    public void geraLarguraP() {
        carro.larguraP = "20cm";
    }

    @Override
    public void geraNCilindros() {
        carro.nCilindros = "8 cilindros";
    }

    @Override
    public void geraTCilindros() {
        carro.tCilindros  = "3 metros";
    }

    @Override
    public void geraTipo() {
        carro.tipo = "Bico";
    }

    @Override
    public void geraTamanho() {
            carro.tamanho = "10 metros";
    }
    

}
