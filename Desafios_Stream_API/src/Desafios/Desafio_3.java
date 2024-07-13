package Desafios;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Desafio_3 extends Stream_API_Lista {

	public void verificarNegativos() {
		Function<Integer,Integer> verificacao = numero ->{
			if(numero < 0) {
				return 0;
			}else {
				return numero;
			}
		};
		List<Integer> verificadosNumerosNegativos = this.numeros.stream().sorted()
				.map(verificacao).filter(numero -> numero > 0).collect(Collectors.toList());
		verificadosNumerosNegativos.forEach(n -> System.out.print(n + " "));
	}
	public static void main(String[] args) {
		Desafio_3 d = new Desafio_3();
		d.verificarNegativos();

	}

}
