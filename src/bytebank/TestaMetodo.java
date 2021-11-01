package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		
		// conta1.saldo = 100;  --> não podemos acessar os atributos diretamente.
		// conta1.depositar(50);  --> não podemos acessar os atributos diretamente.
		
		// System.out.println("O saldo atual da Conta1: R$ " + conta1.saldo);  --> não podemos acessar os atributos diretamente.
	
		// se não quisesse o retorno do método, mas sim só o resultado só usar:
		// conta1.saldo(20);
		
		// System.out.println("O saldo atual da Conta1: R$ " + conta1.saldo);  --> não podemos acessar os atributos diretamente.
		// System.out.println(conseguiuRetirar);  --> não podemos acessar os atributos diretamente.
		
		Conta conta2 = new Conta();
		conta2.depositar(1000);
		
		if (conta2.transfere(300, conta1)) {
			System.out.println("Transferencia feita com sucesso!");
		} else {
			System.out.println("Saldo insuficiente!");
		}
		
		// System.out.println(conta2.saldo);  --> não podemos acessar os atributos diretamente.
		// System.out.println(conta1.saldo);  --> não podemos acessar os atributos diretamente.
		
		// conta1.titular = "paulo silveira"; --> não podemos acessar os atributos diretamente.
		System.out.println(conta1.titular);
	}
}
