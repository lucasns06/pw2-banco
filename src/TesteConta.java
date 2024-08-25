public class TesteConta
{
    public static void main(String[] args) {
        Conta contaCorrente = new Conta(500,"corrente");
        Conta contaPoupanca = new Conta(700,"poupanca");

        System.out.println("Depositando R$ 1.500 na conta corrente");
        contaCorrente.depositar(1500);

        System.out.println("\n");

        contaPoupanca.exibirSaldo();
        System.out.println("Depositando R$ 1.500 na conta poupanca");
        contaPoupanca.depositar(1500);
        contaPoupanca.exibirSaldo();

        System.out.println("\n");

        System.out.println("Depositando R$ 98,52 na conta poupanca");
        contaPoupanca.depositar(98.52);
        contaPoupanca.exibirSaldo();

        System.out.println("\n");

        System.out.println("Sacando R$ 100,00 da conta poupança");
        contaPoupanca.sacar(100);
        contaPoupanca.exibirSaldo();

        System.out.println("\n");

        System.out.println("Transferindo R$ 1800,00 da corrente para a conta poupança");
        contaCorrente.transferir(1800, contaPoupanca);
        contaCorrente.exibirSaldo();
        contaPoupanca.exibirSaldo();

        System.out.println("\n");

        System.out.println("Transferindo R$ 700,00 da poupança para a conta corrente");
        contaPoupanca.transferir(1800, contaCorrente);
        contaCorrente.exibirSaldo();
        contaPoupanca.exibirSaldo();
        System.out.println("\n");

        System.out.println("Sacando R$ 1000,00 da poupança");
        contaPoupanca.sacar(1000);
        contaPoupanca.exibirSaldo();

        System.out.println("\n");

        System.out.println("Sacando R$ 1000,00 da corrente");
        contaCorrente.sacar(1000);
        contaCorrente.exibirSaldo();
    }
}
