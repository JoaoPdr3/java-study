
public class SobrescritaImportantes {
	public static void main(String[] args) {
		Professor prof = new Professor("Ricardo Souza", "DOUTOR", 5000, 30354776);
		Professor profDois = new Professor("Ricardo Souza", "DOUTOR", 5000, 30354776);	
		
		if(prof.equals(profDois)) {
			System.out.println("São iguais");
		} else {
			System.out.println("São diferentes");
		}
	}
}
