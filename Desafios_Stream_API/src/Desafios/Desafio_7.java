package Desafios;

import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;

public class Desafio_7 extends Stream_API_Lista{
	
	public void segundoNumero() {
		Collections.sort(this.numeros, Collections.reverseOrder());
	
	Optional<Integer> segundoMaior = this.numeros.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
	System.out.println("O segundo numero maior é : "+ segundoMaior.get());
	}

	public static void main(String[] args) {
		Desafio_7 d= new Desafio_7();
		d.segundoNumero();

	}

}
