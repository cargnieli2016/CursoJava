package seguros;

import contas.Conta;

public class SeguroPessoaFisica extends Conta{ //herança

	public static void main(String[] args) {
		SeguroPessoaFisica cc3 = new SeguroPessoaFisica();
		cc3.cliente = "Robson Lamonde";
		cc3.saldo = 9000;
		System.out.println("Cliente: " + cc3.cliente);
		cc3.exibirSaldo();

	}

}
