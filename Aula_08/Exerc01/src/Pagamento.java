
public enum Pagamento {
	VISA(12), MASTER(27), BOLETO(32);
	
	public int codigo;
	private Pagamento(int codigo) {
		setCodigo(codigo);
	}
	public int getCodigo() {
		return codigo;
	}
	private void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public static Pagamento findByCod(int codigo) {
		for (Pagamento pg : values()) {
			if(pg.getCodigo() == codigo) 
				return pg;
		}
		return null;
	}
	
}
