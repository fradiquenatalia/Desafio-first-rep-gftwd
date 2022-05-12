public abstract class DadosdaConta implements IConta {


    protected static int SEQUENTIAL = 1;
    protected static final int AGENCIA_PADRAO = 1;

    protected int agencia;
    protected int numeroDaConta;
    protected double saldo;
    private Cliente cliente;

    public DadosdaConta(Cliente cliente) {

        this.agencia = AGENCIA_PADRAO;
        this.numeroDaConta = SEQUENTIAL++;
        this.cliente= cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo = saldo - valor;
    }

    @Override
    public void depositar(double valor) {

        saldo = saldo + valor;

    }

    @Override
    public void transferencia(double valor, IConta contaDestino) {

        sacar(valor);
        contaDestino.depositar(valor);

    }

    public int getAgencia() {
        return agencia;
    }


    public int getNumeroDaConta() {
        return numeroDaConta;
    }


    public double getSaldo() {
        return saldo;
    }

    protected void impressoInfoConta() {
        System.out.println(String.format("Titular: %s", cliente.getNome()));
        System.out.println(String.format("Agencia: %d", agencia));
        System.out.println(String.format("Numero da conta: %d", numeroDaConta));
        System.out.println(String.format("Saldo: R$ %.2f", saldo));
    }

}
