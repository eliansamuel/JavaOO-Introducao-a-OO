package bytebank;

public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 300;
		
		System.out.println("Primeira conta tem: R$ " + primeiraConta.saldo);
		System.out.println("Segunda conta tem: R$ " + segundaConta.saldo);
		
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
