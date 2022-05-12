public class ContaCorrente extends DadosdaConta{


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato(){

    System.out.println("**Extrato Conta Corrente**");
        impressoInfoConta();
    }


}