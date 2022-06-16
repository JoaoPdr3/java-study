
public class Main {
	public static void main(String[] args) {
		Pagamento pg = Pagamento.findByCod(32);
		Cliente cliente = new Cliente("Paulo", "Rua Avenida Paulista", pg);
		System.out.println("Cliente "+cliente.getNome()+", seu pagamento será feito com: "+cliente.getPagamento());
		
	}
}

