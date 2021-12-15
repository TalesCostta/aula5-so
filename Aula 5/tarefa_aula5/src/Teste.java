public class Teste {

	public static void main(String[] args) {
		Numero n = new Numero(0);
		Escritor p = new Escritor(n);
		Leitor c = new Leitor(n);
		Leitor c1 = new Leitor(n);
		Leitor c2 = new Leitor(n);
		
				
		p.start();
		c.start();
		c1.start();
		c2.start();

	}

}
