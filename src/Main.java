
public class Main {
	
	public static void main(String[] args) {
		
		Cliente joao = new Cliente();
		joao.setNome("joao");
		
		Conta cc = new ContaCorrente(joao);
		Conta poup = new ContaPoupanca(joao);
		
		cc.depositar(100);
		cc.transferir(100, poup);
		
		cc.imprimirExtrato();
		poup.imprimirExtrato();
	}

}
