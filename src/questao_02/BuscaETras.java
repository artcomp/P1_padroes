package questao_02;

public class BuscaETras extends PrototipoPBuscaETras {

    public BuscaETras() {
        cliente = "";
        data = "";
        end_busca = "";
        end_entrega = "";
    }
    
 
       public BuscaETras(BuscaETras b) {
        cliente = b.getCliente();
        data = b.getData();
        end_busca = b.getEnd_busca();
        end_entrega = b.getEnd_entrega();
    }
 
    @Override
    public String exibirInfo() {
        return "Cliente = " + this.getCliente() + "\nData = " + this.getData() + "\nEnd_Busca : " + this.getEnd_busca() + "\nEnd_Entrega = " + this.getEnd_entrega();
    }

    @Override
    public PrototipoPBuscaETras clonar() {
        return new BuscaETras(this);
    }

}
