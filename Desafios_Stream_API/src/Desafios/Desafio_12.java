package Desafios;

public class Desafio_12 extends Stream_API_Lista {
	public Integer produtoLista() {
	
		
		 Integer produtoLista = this.numeros.stream()
	                .reduce(1, (a, b) -> a * b);
		return produtoLista;
	}
	
	public static void main(String[] args) {
		Desafio_12 d = new Desafio_12();
		System.out.println(d.produtoLista());

	}

}
