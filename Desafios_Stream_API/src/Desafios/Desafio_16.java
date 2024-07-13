package Desafios;

import java.util.Set;
import java.util.stream.Collectors;

public class Desafio_16 extends Stream_API_Lista {
	public void agruparNumeros() {
		Set<Integer> numerosPar = this.numeros.stream().filter(n -> n % 2 ==0).sorted().collect(Collectors.toSet());
		Set<Integer> numerosImpar = this.numeros.stream().filter(n -> !(n % 2 ==0)).sorted().collect(Collectors.toSet());
		System.out.println("Numeros impares");
		numerosImpar.forEach(n -> System.out.print(n+ " "));
		System.out.println();
		System.out.println("Numeros pares");
		numerosPar.forEach(n -> System.out.print(n + " "));
		
	}
	public static void main(String[] args) {
		Desafio_16 d = new Desafio_16();
		d.agruparNumeros();

	}

}
