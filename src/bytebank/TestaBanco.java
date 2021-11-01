package bytebank;

public class TestaBanco {
	
	public static void main(String[] args) {
		
		Cliente conta1 = new Cliente();
		conta1.nome = "Paulo Silveira";
		conta1.cpf = "222.222.222-22";
		conta1.profissao = "programador";
		
		Conta conta1_paulo = new Conta();
		conta1_paulo.depositar(100);
		
		conta1_paulo.titular = conta1;
		System.out.println(conta1_paulo.titular.nome);
		System.out.println(conta1_paulo.titular); // mostra somente pra onde está apontando o titular.
		System.out.println(conta1);// ira mostrar o mesmo valor que conta1_paulo, pq foi atribuido a ele na linha 15.
		
	}

}
