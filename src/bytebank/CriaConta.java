package bytebank;

public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		// primeiraConta.saldo = 200; --> n�o podemos acessar os atributos diretamente.
		System.out.println(primeiraConta.getSaldo());
		
		// primeiraConta.saldo += 100;  --> n�o podemos acessar os atributos diretamente.
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = new Conta();
		// segundaConta.saldo = 300;  --> n�o podemos acessar os atributos diretamente.
		
		// System.out.println("Primeira conta tem: R$ " + primeiraConta.saldo); --> n�o podemos acessar os atributos diretamente.
		// System.out.println("Segunda conta tem: R$ " + segundaConta.saldo);  --> n�o podemos acessar os atributos diretamente.
		
		primeiraConta.agencia = 146;
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		segundaConta.agencia = 146;
		System.out.println("Agora a segunda conta est� "
				+ "na ag�ncia " + segundaConta.agencia);
		
		if (primeiraConta == segundaConta) {
			System.out.println("S�o a mesmissima conta");
		} else {
				System.out.println("S�o contas diferentes");
			}
		
		System.out.println(primeiraConta); // Aqui j� mostra que s�o refer�ncias diferentes
		System.out.println(segundaConta);
	}
		
}
