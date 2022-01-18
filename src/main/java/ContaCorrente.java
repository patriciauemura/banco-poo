public class ContaCorrente extends Conta {

    private static int SEQUENCIAL = 1000;

    public ContaCorrente(Cliente cliente) {
        super.agencia = AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
        super.cliente = cliente;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato de Conta Corrente ===");
        super.imprimirInfoComum();
    }
}
