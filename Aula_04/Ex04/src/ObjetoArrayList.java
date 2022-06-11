import java.util.ArrayList;

public class ObjetoArrayList {
	public static void main(String[] args) {
		ArrayList<String> times = new ArrayList<String>();
		
		//Adicionando elementos
		times.add("Botafogo");
		times.add("Flamengo");
		times.add("Fluminense");
		times.add("Vasco");
		times.add("Grêmio");
		
		//Acesso indexado
		
//		String time = times.get(2);// Inicia de 0
//		System.out.println(time+"\n");// Será apresentado: Fluminense
	
		//Imprimir todos os times com foreach = iterar
		
//		for (String elemento : times) {
//			System.out.println(elemento);
//		}
		
		int indice = times.indexOf("Fluminense");
		System.out.println(indice);
	}
}
