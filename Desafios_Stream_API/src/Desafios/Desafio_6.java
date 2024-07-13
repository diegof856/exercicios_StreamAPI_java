package Desafios;

import java.util.List;

public class Desafio_6 extends Stream_API_Lista {
	public List<Integer> maiorDez() {
		List<Integer> maiorDez = this.numeros.stream().filter(n -> n > 10).sorted().toList();
		return maiorDez;
	}
	public static void main(String[] args) {
		Desafio_6 d = new Desafio_6();
		if(d.maiorDez().isEmpty()) {
			System.out.println("Não possui numeros maiores que 10");
		}else {
			System.out.println(d.maiorDez());
		}
		
	}

}
