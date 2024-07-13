package Desafios;

import java.util.List;

public class Desafio_4 extends Stream_API_Lista {
	public List<Integer> tirarImpares() {
		List<Integer> listaSemimpares = this.numeros.stream().filter(n -> !(n % 2 !=0)).sorted().toList();
		return listaSemimpares;
	}
	public List<Integer> listaImpares() {
		
		List<Integer> listaImpares = this.numeros.stream().filter(n -> n % 2 !=0).sorted().toList();
		return listaImpares;
	}
	public static void main(String[] args) {
		Desafio_4 d = new Desafio_4();
		System.out.println("Lista completa");
		System.out.print(d.numeros);
		System.out.println();
		System.out.println("Lista de impares");
		System.out.print(d.listaImpares());
		System.out.println();
		System.out.println("Lista de pares");
		System.out.print(d.tirarImpares()+" ");
	}
}
