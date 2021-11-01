package bytebank_encapsulamento;

public class TestaGettersAndSetters {
	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		
		conta1.setNumero(1337);
		conta1.depositar(150);
		System.out.println("O n�mero da conta �: " + conta1.getNumero());
		
		Cliente jubileu = new Cliente();
		
		jubileu.setNome("Jubileu dos Santos");
		
		// conta.titular = jubileu; -->  n�o podemos mais fazer isso pois os atributos est�o privados.
		
		conta1.setTitular(jubileu); // --> maneira certa de atribuir um valor a um atributo.
		
		System.out.println(conta1.getTitular().getNome());
		
		conta1.getTitular().setProfissao("Programador");
		// agora em duas linha
		Cliente titularDaConta = conta1.getTitular();
		titularDaConta.setProfissao("Programador");
		
		System.out.println(jubileu.getProfissao());
		
		// s�o o mesmo cliente, quer dizer apontam para o mesmo campo.
		System.out.println(titularDaConta);
		System.out.println(jubileu);
		System.out.println(conta1.getTitular());
		
	}
}
