package Exercicio001;

public class ContaPoupanca extends ContaBancaria {
	
	protected int diaRendimento;
	
	public ContaPoupanca(String cliente, int numConta, double saldoInicial, int diaRendimento) {
		super(cliente, numConta, saldoInicial);
		this.diaRendimento = diaRendimento;
	}
	
	public void novoSaldo(double taxa) {
		saldo += saldo * (taxa / 100);
	}
	
	public int getDiaRendimento() {
		return diaRendimento;
	}

	@Override
    public String toString() {
        return "\nNome do Cliente: " + cliente + 
               "\nNumero da Conta: " + numConta +
               "\nTipo da conta: Conta Poupança" +   
               "\nSaldo Disponível: R$ " + saldo;
    }
}