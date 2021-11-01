package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300; 
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo); 
		
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo); 
		
		segundaConta.saldo += 100; 
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo); 
		
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo); 
		
		if (primeiraConta == segundaConta) {
			System.out.println("S�o a mesmissima conta, isso acontece pq a primeiraConta\n"
					+ "� uma refer�ncia para o objeto conta e n�o um objeto em si,\nent�o " 
					+ "primeiraConta e segundaConta est�o refenciando o mesmo objeto");
		}
		
		System.out.println(primeiraConta); // Mostra que as refer�ncias est�o 
		System.out.println(segundaConta);  // sendo pro mesmo objeto.
			
		}
}
