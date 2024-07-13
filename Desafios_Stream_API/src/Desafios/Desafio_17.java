package Desafios;

import java.util.Set;
import java.util.stream.Collectors;

public class Desafio_17 extends Stream_API_Lista {
	public void numerosPrimos() {
		
		Set<Integer> primos = this.numeros.stream().filter(n -> ePrimo(n)).collect(Collectors.toSet());
		primos.forEach(n -> System.out.print(n + " "));
	}
	private boolean ePrimo(Integer numero) {
		if(numero <= 1) {
			return false;
		}
		for(int i = 2; i<numero; i++) {
			if(numero % i ==0) {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		Desafio_17 d = new Desafio_17();
		d.numerosPrimos();

	}

}
