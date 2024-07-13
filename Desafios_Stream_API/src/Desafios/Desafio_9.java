package Desafios;

import java.util.Set;
import java.util.stream.Collectors;

public class Desafio_9 extends Stream_API_Lista {
	
	public void verificaDistintos() {
		
		
		Set<Integer> numerosDuplicado = this.numeros.stream().filter(n -> this.numeros.stream().filter(x -> x.equals(n)).count() ==2).collect(Collectors.toSet());
		
		System.out.println("Numeros duplicados" + numerosDuplicado);
		
	}
	public static void main(String[] args) {
		Desafio_9 d = new Desafio_9();
		d.verificaDistintos();
	}

}
