package Desafios;

public class Desafio_15 extends Stream_API_Lista {
	public void verificarNegativo() {
		boolean temNegativo = this.numeros.stream().anyMatch(n -> n < 0);
		if(temNegativo) {
			System.out.println("Há um numero negativo na lista");
		}else {
			System.out.println("Não há um numero negativo na lista");
		}
	}
	public static void main(String[] args) {
		Desafio_15 d = new Desafio_15();
		d.verificarNegativo();

	}

}
