public class ContaPoupança extends DadosdaConta{


    public ContaPoupança(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato(){

        System.out.println("**Extrato Conta Poupança**");
        impressoInfoConta();
    }


}
