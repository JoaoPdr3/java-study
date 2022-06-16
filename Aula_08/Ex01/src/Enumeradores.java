
public class Enumeradores {
	public static void main(String[] args) {
		Sexo sx = Sexo.MASCULINO;
		System.out.println(sx.name());
		// Retorna uma String, com o mesmo nome da
		//declaração, no caso 'MASCULINO'
		System.out.println(sx.ordinal()); 
		// Retorna um inteiro de acordo 
		//com a posição da declaração, no caso é 0;
		System.out.println(sx.valor);
		
		//Método values.
		Turno [] turnos = Turno.values();
		for (Turno trn : turnos) {
			System.out.println("Descrição: "+trn.name());
			System.out.println("Descrição: "+trn.ordinal());
		}
	}
}

enum Turno {
	MATUTINO, VESPERTINO, NOTURNO
}

enum Sexo {
	MASCULINO(1), //o argumento passo é atribuido a valor
	FEMININO(2); //enum sexo tem duas instâncias constantes.
	
	public int valor; //atributo do enum Sexo
	private Sexo (int valor) {//construtor private do enum Sexo
		this.valor = valor; //atribuição do valor
	}
}

