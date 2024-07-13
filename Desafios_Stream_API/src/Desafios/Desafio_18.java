package Desafios;

public class Desafio_18 extends Stream_API_Lista {
	public boolean verificarIguais() {
		boolean verificacao = this.numeros.stream().distinct().count() == 1; 
		return verificacao;
	}
	public static void main(String[] args) {
		Desafio_18 d = new Desafio_18();
		if(d.verificarIguais()) {
			System.out.println("Há numeros iguais");
		}else {
			System.out.println("Os numeros não são todos iguais na lista");
		}
				

	}

}
