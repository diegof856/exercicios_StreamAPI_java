package Desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio_1 extends Stream_API_Lista {
	
	public void mostrarListaOrdenada() {
		List<Integer> listaOrdenada = new ArrayList<>(this.numeros).stream().sorted().collect(Collectors.toList());
		listaOrdenada.forEach(n -> System.out.print(n+" "));
	}
	public static void main(String[] args) {
		Desafio_1 desafio = new Desafio_1();
		desafio.mostrarListaOrdenada();
		
	}
}

