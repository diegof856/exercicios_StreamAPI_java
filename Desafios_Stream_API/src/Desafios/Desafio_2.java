package Desafios;

import java.util.function.Predicate;

public class Desafio_2 extends Stream_API_Lista {
	public void imprimirSomaDosPares() {
		Predicate<Integer> numerosPares = numero -> numero % 2 == 0;
		int soma = this.numeros.stream().filter(numerosPares).reduce(0, (numero1, numero2) -> numero1 + numero2);
		System.out.println("A soma dos numero é: " + soma);
	}

	public static void main(String[] args) {
		Desafio_2 d = new Desafio_2();
		d.imprimirSomaDosPares();

	}

}
