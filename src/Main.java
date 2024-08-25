import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Conta contaCorrente = new Conta(1000,"corrente");
        Conta contaPoupanca = new Conta(2500,"poupanca");
        Scanner leitor = new Scanner(System.in);
        Conta.op1();
        int op = leitor.nextInt();
        switch (op)
        {
            //CORRENTE
            case 1:
                System.out.println("========================");
                System.out.println("Conta corrente escolhido!");
                contaCorrente.exibirSaldo();
                Conta.op2();
                int op2 = leitor.nextInt();
                switch (op2)
                {
                    case 1:
                        System.out.print("Quantidade: ");
                        double saque = leitor.nextDouble();
                        contaCorrente.sacar(saque);
                        contaCorrente.exibirSaldo();
                        break;
                    case 2:
                        System.out.print("Quantidade: ");
                        double deposito = leitor.nextDouble();
                        contaCorrente.depositar(deposito);
                        contaCorrente.exibirSaldo();
                        break;
                    case 3:
                        System.out.print("Quantidade: ");
                        double transf = leitor.nextDouble();
                        contaCorrente.transferir(transf, contaPoupanca);
                        contaCorrente.exibirSaldo();
                        contaPoupanca.exibirSaldo();
                        break;
                    default:
                        System.out.println("Método inválido");
                        break;
                }
                break;
                //POUPANCA
            case 2:
                System.out.println("Poupança escolhido!");
                contaPoupanca.exibirSaldo();
                Conta.op2();
                int op3 = leitor.nextInt();
                switch (op3)
                {
                    case 1:
                        System.out.print("Quantidade: ");
                        double saque = leitor.nextDouble();
                        contaPoupanca.sacar(saque);
                        contaPoupanca.exibirSaldo();
                        break;
                    case 2:
                        System.out.print("Quantidade: ");
                        double deposito = leitor.nextDouble();
                        contaPoupanca.depositar(deposito);
                        contaPoupanca.exibirSaldo();
                        break;
                    case 3:
                        System.out.print("Quantidade: ");
                        double transf = leitor.nextDouble();
                        contaCorrente.transferir(transf, contaCorrente);
                        break;
                    default:
                        System.out.println("Método inválido");
                        break;
                }
                break;
            default:
                System.out.println("Isso NÃO é um tipo de conta kkkkkkk");
                break;
        }
    }
}