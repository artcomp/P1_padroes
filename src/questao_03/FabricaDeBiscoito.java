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
public class FabricaDeBiscoito implements Fabrica {

    @Override
    public ProdutoFinal criarProdutoFinal() {
        return new Biscoito();
    }

    @Override
    public ProdutoBase criarProdutoBase() {
        return new Bolacha();
    }

    
    
}
