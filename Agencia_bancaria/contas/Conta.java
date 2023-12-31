package contas;

public class Conta {
	//atributos
	protected String cliente;
	protected double saldo;
	
	//construtor
	public Conta() {
	System.out.println("Agência: 0261");	
	}
	//métodos
	protected void exibirSaldo() {
		System.out.println("Saldo: R$ " + saldo);
	}
	
	void sacar(double valor) { //Método com parâmetro
		saldo -= valor;
		System.out.println("Débito: R$ " + valor);
	}
	
	void depositar(double valor) {
		saldo += valor;
		System.out.println("Crédito: " + valor);
	}
	
	void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
		System.out.println("Transferência: RS " + valor);
	}
	
	double soma(double cc1, double cc2) { //método com retorno
		double total = cc1 + cc2;
		return total;
		
	}

}
