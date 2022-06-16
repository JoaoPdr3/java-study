import java.util.ArrayList;

public class Prefeitura {
	private ArrayList<Habitante> habitantes = new ArrayList<Habitante>();
	
	
	public void adicionar(Habitante habitante) {
		getHabitantes().add(habitante);
	}
	
	public ArrayList<Habitante> buscarPorAnoNasc(int anoNasc) {
		ArrayList<Habitante> habitantesFiltrados = new ArrayList<Habitante>();
		for (Habitante habitante : getHabitantes()) {
			if(habitante.getAnoNasc() >= anoNasc) {
				habitantesFiltrados.add(habitante);
			}
		}
		return habitantesFiltrados;
	}
	
	public ArrayList<Habitante> buscarPorClasse(char classe) {
		ArrayList<Habitante> habitantesFiltrados = new ArrayList<Habitante>();
		for (Habitante habitante : getHabitantes()) {
			if(habitante.getClasseSocial() == classe) {
				habitantesFiltrados.add(habitante);
			}
		}
		return habitantesFiltrados;
	}
	
	public ArrayList<Habitante> buscarHabitanteMaiorSalario(double rendaMax) {
		ArrayList<Habitante> habitantesRicos = new ArrayList<Habitante>();
		for (Habitante habitante : getHabitantes()) {
			if(habitante.getSalario() >= rendaMax) {
				habitantesRicos.add(habitante);
			}
		}
		return habitantesRicos;
	}
	
	public ArrayList<Habitante> getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(ArrayList<Habitante> habitantes) {
		this.habitantes = habitantes;
	}
	
	
}
