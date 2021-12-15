

public class Numero0 {

	private int numero;

	Numero0(int numero) {
		this.numero = numero;
	}

	public synchronized int get(String idThread) {
		System.out.println("Leitor " + idThread + "\t leu: \t" + this.numero);
		return this.numero;
	}

	public synchronized void produzir(String idThread, int valor) {
		this.numero = valor;
		System.out.println("Escritor " + idThread + "\t escreveu: \t" + valor);
	}

}
