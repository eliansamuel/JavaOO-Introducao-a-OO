package bytebank_contrutores;

public class TestaValores {
	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 1234);
		Conta conta2 = new Conta(1337, 4321);
		Conta conta3 = new Conta(1233, 2222);
		
		System.out.println(conta2.getTotal());
		
	}

}
