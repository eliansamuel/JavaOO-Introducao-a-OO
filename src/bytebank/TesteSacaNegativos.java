package bytebank;

public class TesteSacaNegativos {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.depositar(100);
		
		System.out.println(conta.saca(200));
		
		System.out.println(conta.getSaldo());
		
		// conta.saldo = conta.saldo - 101; --> proíbido acessar os atributos diretamente, devemos usar os métodos.
		
	}

}
