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
public class Ferrari extends CarroBuilder{

    @Override
    public void geraRaioRoda() {
        carro.raioRoda = "17inch";
    
    }

    @Override
    public void geraLarguraP() {
        carro.larguraP = "30cm";
    }

    @Override
    public void geraNCilindros() {
        carro.nCilindros = "16 cilindros";
    }

    @Override
    public void geraTCilindros() {
        carro.tCilindros  = "2 metros";
    }

    @Override
    public void geraTipo() {
        carro.tipo = "Aerofólio";
    }

    @Override
    public void geraTamanho() {
            carro.tamanho = "22 metros";
    }
    
    
    
}
