package questao_04;

public class App {

    public static void main(String[] args) {
        
        
        System.out.println("\t\t\t\tFerrari\n\n\n");
        ConcessionariaDirector concessionaria = new ConcessionariaDirector(new Ferrari());
        concessionaria.construirCarro();
        
        Carros carro = concessionaria.getCarro();
        
        System.out.println("Largura Pneu : " + carro.larguraP + "\nRaioRoda : " + carro.raioRoda + "\nnumero de cilindros : " + carro.nCilindros + "\ntamanho cilindro : " + carro.tCilindros +  "\nTipo de Acessorios : "  + carro.tipo + "\nTamanho do Acessório : " + carro.tamanho);
    
        System.out.println("\n\n\t\t\t\tLanborguini\n\n\n");
        
        concessionaria = new ConcessionariaDirector(new Lanborginni());
        concessionaria.construirCarro();
        
        carro = concessionaria.getCarro();
        
        System.out.println("Largura Pneu : " + carro.larguraP + "\nRaioRoda : " + carro.raioRoda + "\nnumero de cilindros : " + carro.nCilindros + "\ntamanho cilindro : " + carro.tCilindros +  "\nTipo de Acessorios : "  + carro.tipo + "\nTamanho do Acessório : " + carro.tamanho);
    
    
    
    
    }

    
}
