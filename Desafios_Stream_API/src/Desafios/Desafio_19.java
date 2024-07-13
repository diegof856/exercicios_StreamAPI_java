package Desafios;

public class Desafio_19 extends Stream_API_Lista {
	public Integer somaPorTresCinco() {
		Integer tresCincoLista = this.numeros.stream().filter(n -> n % 3 == 0 || n % 5 == 0)
				.reduce(0,(num1, num2) -> num1 + num2);

		return tresCincoLista;

	}

	public static void main(String[] args) {
		Desafio_19 d = new Desafio_19();
		System.out.println(d.somaPorTresCinco());
	}

}
