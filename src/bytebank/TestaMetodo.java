package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		
		// conta1.saldo = 100;  --> n�o podemos acessar os atributos diretamente.
		// conta1.depositar(50);  --> n�o podemos acessar os atributos diretamente.
		
		// System.out.println("O saldo atual da Conta1: R$ " + conta1.saldo);  --> n�o podemos acessar os atributos diretamente.
	
		// se n�o quisesse o retorno do m�todo, mas sim s� o resultado s� usar:
		// conta1.saldo(20);
		
		// System.out.println("O saldo atual da Conta1: R$ " + conta1.saldo);  --> n�o podemos acessar os atributos diretamente.
		// System.out.println(conseguiuRetirar);  --> n�o podemos acessar os atributos diretamente.
		
		Conta conta2 = new Conta();
		conta2.depositar(1000);
		
		if (conta2.transfere(300, conta1)) {
			System.out.println("Transferencia feita com sucesso!");
		} else {
			System.out.println("Saldo insuficiente!");
		}
		
		// System.out.println(conta2.saldo);  --> n�o podemos acessar os atributos diretamente.
		// System.out.println(conta1.saldo);  --> n�o podemos acessar os atributos diretamente.
		
		// conta1.titular = "paulo silveira"; --> n�o podemos acessar os atributos diretamente.
		System.out.println(conta1.titular);
	}
}
