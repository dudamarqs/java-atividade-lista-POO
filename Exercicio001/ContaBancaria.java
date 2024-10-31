package Exercicio001;

public class ContaBancaria {
    
    // Atributos
    protected String cliente;
    protected int numConta;
    protected double saldo;
    
    // Construtor
    public ContaBancaria(String cliente, int numConta, double saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }
    
    // Método sacar
    public boolean sacar(double valor) {
        // Verificar se o valor a sacar é válido
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            System.out.print("\nSaldo insuficiente.");
            return false;
        }
    }
    
    // Método depositar
    public void depositar(double valor) {
        saldo += valor; 	
    }
    
    public String getCliente() {
        return cliente;
    }
    
    public int getNumConta() {
        return numConta;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    @Override
    public String toString() {
        return "\nNome do Cliente: " + cliente + 
               "\nNumero da Conta: " + numConta +
               "\nSaldo Disponível: R$ " + saldo;
    }
}