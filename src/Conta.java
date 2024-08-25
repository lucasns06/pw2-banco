public class Conta
{
    private double saldo;
    private String tipo;

    public Conta(double valorInicial)
    {
        this.saldo = valorInicial;
    }
    public Conta(double valorInicial, String tipo)
    {
        this.saldo = valorInicial;
        this.tipo = tipo;
    }
    public boolean depositar(double valor)
    {
        if ("corrente".equals(this.tipo) && valor > 1000.00)
        {
            System.out.println("Valor superior a 1.000!");
            return false;
        }
            this.saldo = saldo + valor;
            return true;
    }
    public boolean sacar(double valor)
    {
        if(valor > this.saldo)
        {
            System.out.println("Saque inválido! :/");
            return false;
        }
            this.saldo = saldo - valor;
            return true;
    }
    public boolean transferir(double valor, Conta contaDestino)
    {
        if("poupanca".equals(this.tipo) && "corrente".equals(contaDestino.tipo))
        {
            System.out.println("Transferência inválida, conta poupanca para corrente!");
            return false;
        }
        if(valor > this.saldo)
        {
            System.out.println("transferencia inválida, saldo insuficiente");
        }
        else
        {
            System.out.println("Transferindo....");
            this.saldo = saldo - valor;
            contaDestino.saldo += valor;
        }
        return true;
    }
    public void exibirSaldo() {
        System.out.println("Saldo da conta " + this.tipo + ": R$ " + this.saldo);
    }

    //nada a ver aqui
    public static void op1(){
        System.out.println("=========BANCO=========");
        System.out.println("Escolher tipo de conta: ");
        System.out.println("Corrente: 1");
        System.out.println("Poupança: 2");
        System.out.print("Escolha: ");
    }
    public static void op2(){
        System.out.println("o que deseja fazer?");
        System.out.println("Sacar: 1 || Depositar: 2 || Transferir: 3");
        System.out.print("Escolha: ");
    }
}
