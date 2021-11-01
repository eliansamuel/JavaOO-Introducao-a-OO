package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		
		conta1.saldo = 100;
		conta1.depositar(50);
		
		System.out.println("O saldo atual da Conta1: R$ " + conta1.saldo);
		
		boolean conseguiuRetirar = conta1.saca(20); /// com isso irá mostrar o retorno do método
		
		// se não quisesse o retorno do método, mas sim só o resultado só usar:
		// conta1.saldo(20);
		
		System.out.println("O saldo atual da Conta1: R$ " + conta1.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta conta2 = new Conta();
		conta2.depositar(1000);
		
		if (conta2.transfere(300, conta1)) {
			System.out.println("Transferencia feita com sucesso!");
		} else {
			System.out.println("Saldo insuficiente!");
		}
		
		System.out.println(conta2.saldo);
		System.out.println(conta1.saldo);
		
		
	}
}
