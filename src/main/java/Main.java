public class Main {
    public static void main(String[] args) {

        Cliente patricia = new Cliente();
        patricia.setNome("Patricia");

        Cliente patricia2 = new Cliente();
        patricia2.setNome("Patricia2");

        Conta cc = new ContaCorrente(patricia);
        cc.depositar(100);

        Conta cp = new ContaPoupanca(patricia);

        Conta cp2 = new ContaPoupanca(patricia2);

        cc.transferir(30,cp2);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
        cp2.imprimirExtrato();
    }
}
