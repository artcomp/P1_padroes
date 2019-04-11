/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao_03;

/**
 *
 * @author art
 */
public class App {
    
    
    public static void main(String[] args) {
        
        
        // Fabrica de Guloseimas
        
        System.out.println("\n\n\t\t\tGuloseimas\n\n");
        Fabrica fabrica = new FabricaDeGuloseimas();
        ProdutoFinal bombom = new Bombom();
        ProdutoBase barra_de_chocolate = new BarraDeChocolate();
        bombom.exibirInfoProdutoFinal();
        System.out.println("\n\n");
        barra_de_chocolate.exibirInfoProdutoBase();
        
        
        System.out.println("\n\n\n\n\n\t\t\tBolacha/Biscoito\n\n\n");
        
        // Fabrica de Biscoito
        fabrica = new FabricaDeBiscoito();
        ProdutoFinal biscoito = new Biscoito();
        ProdutoBase bolacha = new Bolacha();
        biscoito.exibirInfoProdutoFinal();
        System.out.println("\n\n");
        bolacha.exibirInfoProdutoBase();
        
        
    }
}
