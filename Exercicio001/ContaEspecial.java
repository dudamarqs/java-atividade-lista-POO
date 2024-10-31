package Exercicio001;

public class ContaEspecial extends ContaBancaria {
	
	private double limite = 500;
	
	public ContaEspecial(String cliente, int numConta, double saldoInicial, double limite) {
		super(cliente, numConta, saldoInicial);
		this.limite = limite;
	}
	
	@Override
    public boolean sacar(double valor) {
        if (saldo + limite >= valor) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente, ultrapassou o limite permitido.");
            return false;
        }
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public String toString() {
        return "\nNome do Cliente: " + cliente + 
               "\nNumero da Conta: " + numConta +
               "\nTipo da conta: Conta Especial" + 
               "\nLimite da conta: " + limite + 
               "\nSaldo Disponível: R$ " + saldo;
    }

}