public class Main {

    public static void main (String[] args){

        Cliente Antonia = new Cliente();
        Antonia.setNome("Antonia");
        IConta  contaCorrenteAntonia = new ContaCorrente(Antonia);

        IConta poupança = new ContaPoupança(Antonia);

        contaCorrenteAntonia.depositar(557);
        contaCorrenteAntonia.transferencia(48,poupança);

        contaCorrenteAntonia.imprimirExtrato();
        poupança.imprimirExtrato();

    }

}
