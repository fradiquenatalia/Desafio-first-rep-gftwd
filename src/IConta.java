public interface IConta {


    public void sacar(double valor);

    public void depositar(double valor);

    public void transferencia(double valor, IConta contaDestino);

    public void imprimirExtrato();


}
