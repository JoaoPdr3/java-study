
abstract class Figura {
	private double base;
	private double altura;
	
	public Figura(double base, double altura) {
		setBase(base);
		setAltura(altura);
	}

	public double getArea(){
		return 0;
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
	
	@Override
	public String toString() {
		return "O resultado da área do";
	}
}

class TrianguloRetangulo extends Figura {
	
	public TrianguloRetangulo(double base, double altura) {
		super(base, altura);
	}
	
	@Override
	public double getArea() {
		return getBase() * getAltura() / 2;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Triângulo é: "+ getArea();
	}
}

class Retangulo extends Figura {

	public Retangulo(double base, double altura) {
		super(base, altura);
		
	}
	
	@Override
	public double getArea() {
		return getBase() * getAltura();
	}
	
	@Override
	public String toString() {
		return super.toString()+" Retângulo é: "+getArea();
	}
	
}
