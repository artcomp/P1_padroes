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
public abstract class CarroBuilder {
    
    protected Carros carro;

    public CarroBuilder() {
        carro = new Carros(); 
    }
    
    
    String raioRoda;
    String larguraP;
    String nCilindros;
    String tCilindros;
    String tipo;
    String tamanho;
    
    public abstract void geraRaioRoda();
    
    public abstract void geraLarguraP();
            
    public abstract void geraNCilindros();
            
    public abstract void geraTCilindros();
            
    public abstract void geraTipo();
            
    public abstract void geraTamanho();

    public Carros getCarro() {
        return carro;
    }
           
    
    
}
