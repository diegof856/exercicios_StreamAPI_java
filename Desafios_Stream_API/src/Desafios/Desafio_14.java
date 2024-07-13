package Desafios;

import java.util.Comparator;
import java.util.function.Function;

public class Desafio_14 extends Stream_API_Lista {

	public void maiorPrimo() {

		Integer primo = this.numeros.stream().map(new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer n) {
				if (n <= 1) {
					return 0;
				}
				for (int i = 2; i <= Math.sqrt(n); i++) {
					if (n % i == 0) {
						return 0;
					}

				}
				return n;
			}
		}).filter(n -> n != 0).max(Comparator.naturalOrder()).orElse(null);

		System.out.println(primo);
	}

	public static void main(String[] args) {
		Desafio_14 d = new Desafio_14();
		d.maiorPrimo();

	}

}
