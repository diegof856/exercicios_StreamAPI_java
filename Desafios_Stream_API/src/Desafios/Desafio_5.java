package Desafios;

import java.util.List;

public class Desafio_5 extends Stream_API_Lista {
	public void calcularMedia() {

		List<Integer> mediaMaiorCinco = this.numeros.stream().filter(n -> n > 5).toList();
		int soma = mediaMaiorCinco.stream().reduce(0, (numero1, numero2) -> numero1 + numero2);
		double media = soma / mediaMaiorCinco.size();
		System.out.println("A media dos numero maiores que 5 é " + media);
	}

	public static void main(String[] args) {
		Desafio_5 d = new Desafio_5();
		d.calcularMedia();

	}

}
