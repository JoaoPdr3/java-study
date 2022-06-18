
public class Retangulo extends FiguraGeometrica {
	
	public Retangulo(String nome, double base, double altura) {
		super(nome);
		setBase(base);
		setAltura(altura);
	}

	private double base;
	private double altura;
	
	@Override
	public double getArea() {
		return getBase() * getAltura();
	}

	@Override
	public String getDescricao() {
		return "Figura Geométrica: "+getNome()+", "+"Base: "+getBase()+", Altura: "+getAltura();
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
}
