public class ContaPoupanca extends Conta {

    private static int SEQUENCIAL = 2000;

    public ContaPoupanca(Cliente cliente) {
        super.agencia = AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
        super.cliente = cliente;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato de Conta Poupança ===");
        super.imprimirInfoComum();
    }


}
