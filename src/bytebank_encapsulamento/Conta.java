package bytebank_encapsulamento;

public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	public void depositar(double valor) {
		this.saldo += valor; // É igual a this.saldo = this.saldo + valor;
		
	}
	
	public boolean saca(double valor) { 
		if (this.saldo >= valor) {
			this.saldo -= valor; // É igual a this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;	
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.depositar(valor);
			return true;
		}
		return false;
	}
	public double getSaldo(){
		return this.saldo;
	}
}
