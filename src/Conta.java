public class Conta
{
    private double saldo;
    private String tipo;

    public Conta(double valorInicial){

    }
    public Conta(double valorInicial, String tipo)
    {

    }
    public boolean depositar(double valor)
    {
        return true;
    }
    public boolean sacar(double valor)
    {
        return true;
    }
    public boolean transferir(double valor, Conta contaDestino)
    {
        return true;
    }

}
