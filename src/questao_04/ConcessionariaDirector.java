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
public class ConcessionariaDirector {
    
    protected CarroBuilder montadora;

    public ConcessionariaDirector(CarroBuilder montadora) {
        this.montadora = montadora;
    }

    public void construirCarro(){
        montadora.geraLarguraP();
        montadora.geraNCilindros();
        montadora.geraRaioRoda();
        montadora.geraTCilindros();
        montadora.geraTipo();
        montadora.geraTamanho();
    }

    public CarroBuilder getMontadora() {
        return montadora;
    }
    
    public Carros getCarro(){
        return montadora.getCarro();
    }
    
    
}
