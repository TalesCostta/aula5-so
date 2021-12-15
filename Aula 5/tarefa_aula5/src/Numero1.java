

public class Numero1 {	
	private int numero;	
	private boolean disponivel;
	
	Numero1(int numero) {
		this.numero = numero;
		this.disponivel = false;
	}
	
	public synchronized int consumir(String idThread) {
		while(this.disponivel == false) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
		System.out.println("  Leitor " + idThread + "\t leu: \t" + this.numero);
		this.disponivel = false;
		notifyAll();
		return this.numero;	
	}
	
	public synchronized void produzir(String idThread, int valor) {
		while(this.disponivel == true) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.disponivel = true;
		this.numero = valor;	
		notifyAll();
		System.out.println("Escritor " + idThread + "\t escreveu: \t" + valor);
		
	}

}
