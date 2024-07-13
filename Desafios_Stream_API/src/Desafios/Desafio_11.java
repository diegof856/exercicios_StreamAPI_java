package Desafios;

import java.util.function.Function;

public class Desafio_11 extends Stream_API_Lista {
	public void somaQuadrados() {
		Function<Integer, Integer> quadrados = numero -> (int) Math.pow(numero, 2);
		Integer somaQuadrados = this.numeros.stream().map(quadrados).reduce(0,(num1 , num2) -> num1 + num2);
		System.out.print(somaQuadrados);
		}
	public static void main(String[] args) {
		Desafio_11 d = new Desafio_11();
		d.somaQuadrados();

	}

}
