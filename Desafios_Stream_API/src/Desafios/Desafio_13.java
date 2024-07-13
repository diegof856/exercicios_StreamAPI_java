package Desafios;

import java.util.Set;import java.util.TreeSet;
import java.util.stream.Collectors;

public class Desafio_13 extends Stream_API_Lista {
	public void intervalo() {
		Set<Integer> numerosIntervalos = this.numeros.stream().filter(n -> n > 5 && n < 10).collect(Collectors.toSet());
		Set<Integer> numerosIntervalos2 = this.numeros.stream().filter(n -> n > 1 && n < 8).collect(Collectors.toCollection(TreeSet::new));
		numerosIntervalos2.forEach(n -> System.out.print(n + " "));
		System.out.println();
		numerosIntervalos.forEach(n -> System.out.print(n + " "));
	}
	public static void main(String[] args) {
		
		Desafio_13 d = new Desafio_13();
		d.intervalo();
	}

}
