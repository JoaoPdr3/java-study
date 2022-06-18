
public class Circulo extends FiguraGeometrica {
	
	public Circulo(String nome, double raio) {
		super(nome);
		setRaio(raio);
	}

	private double raio;
	private double PI = Math.PI;

	@Override
	public double getArea() {
		return getPI() * (getRaio() * getRaio());
	}

	@Override
	public String getDescricao() {
		return "Figura Geométrica: "+getNome()+", "+"Raio: "+getRaio();
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getPI() {
		return PI;
	}

	
}
