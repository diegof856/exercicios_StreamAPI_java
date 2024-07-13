package Desafios;

public class Desafio_8 extends Stream_API_Lista {
	
	public void somarValores() {
		int num = this.numeros.stream().reduce(0, (num1,num2) -> num1+num2);
		System.out.println("A soma de todos os numeros é: "+num);
	}
	public static void main(String[] args) {
		Desafio_8 d = new Desafio_8();
		d.somarValores();

	}

}
