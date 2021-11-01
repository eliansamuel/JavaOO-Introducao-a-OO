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
