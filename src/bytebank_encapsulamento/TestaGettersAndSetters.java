package bytebank_encapsulamento;

public class TestaGettersAndSetters {
	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		
		conta1.setNumero(1337);
		conta1.depositar(150);
		System.out.println("O n�mero da conta �: " + conta1.getNumero());
		
	}
}
