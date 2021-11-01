package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		// primeiraConta.saldo = 300;  --> não podemos acessar os atributos diretamente.--> não podemos acessar os atributos diretamente.
		// System.out.println("Saldo da primeira conta: " + primeiraConta.saldo); --> não podemos acessar os atributos diretamente.
		
		Conta segundaConta = primeiraConta;
		// System.out.println("Saldo da segunda conta: " + segundaConta.saldo); --> não podemos acessar os atributos diretamente.
		
		// segundaConta.saldo += 100; --> não podemos acessar os atributos diretamente.
		// System.out.println("Saldo da segunda conta: " + segundaConta.saldo); --> não podemos acessar os atributos diretamente.
		
		// System.out.println("Saldo da primeira conta: " + primeiraConta.saldo); --> não podemos acessar os atributos diretamente.
		
		if (primeiraConta == segundaConta) {
			System.out.println("São a mesmissima conta, isso acontece pq a primeiraConta\n"
					+ "é uma referência para o objeto conta e não um objeto em si,\nentão " 
					+ "primeiraConta e segundaConta estão refenciando o mesmo objeto");
		}
		
		System.out.println(primeiraConta); // Mostra que as referências estão 
		System.out.println(segundaConta);  // sendo pro mesmo objeto.
			
		}
}
