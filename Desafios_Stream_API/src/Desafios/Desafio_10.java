package Desafios;

import java.util.List;
import java.util.function.Function;

public class Desafio_10 extends Stream_API_Lista {
	public void multiplosCincoTres() {
		Function<Integer, Integer> multiplos = numero -> {
			if(numero % 3 == 0 || numero % 5 == 0) {
				return numero;
			}else {
				return 0;
			}
		};
		List<Integer> listaMultiplos = this.numeros.stream().filter(n -> n % 2 != 0).map(multiplos).filter(n -> n != 0).sorted().toList();
		listaMultiplos.forEach(n -> System.out.print(n + " "));
	}
	public static void main(String[] args) {
		Desafio_10 d = new Desafio_10();
		d.multiplosCincoTres();

	}

}
