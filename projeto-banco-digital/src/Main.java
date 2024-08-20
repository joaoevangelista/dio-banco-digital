public class Main {
    public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Eliah Azevedo");
		
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(200);
		cc.transferir(150, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}

