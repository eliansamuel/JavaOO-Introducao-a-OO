package bytebank;

public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		// primeiraConta.saldo = 200; --> não podemos acessar os atributos diretamente.
		System.out.println(primeiraConta.getSaldo());
		
		// primeiraConta.saldo += 100;  --> não podemos acessar os atributos diretamente.
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = new Conta();
		// segundaConta.saldo = 300;  --> não podemos acessar os atributos diretamente.
		
		// System.out.println("Primeira conta tem: R$ " + primeiraConta.saldo); --> não podemos acessar os atributos diretamente.
		// System.out.println("Segunda conta tem: R$ " + segundaConta.saldo);  --> não podemos acessar os atributos diretamente.
		
		primeiraConta.agencia = 146;
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		segundaConta.agencia = 146;
		System.out.println("Agora a segunda conta está "
				+ "na agência " + segundaConta.agencia);
		
		if (primeiraConta == segundaConta) {
			System.out.println("São a mesmissima conta");
		} else {
				System.out.println("São contas diferentes");
			}
		
		System.out.println(primeiraConta); // Aqui já mostra que são referências diferentes
		System.out.println(segundaConta);
	}
		
}
