package unibank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoThiago = new Conta();
		contaDoThiago.saldo = 100;
		contaDoThiago.deposita(50);
		System.out.println(contaDoThiago.saldo);

		boolean conseguiuRetirar = contaDoThiago.saca(20);
		System.out.println(contaDoThiago.saldo);
		System.out.println(conseguiuRetirar);

		Conta contaDaJuliana = new Conta();
		contaDaJuliana.deposita(1000);
		
		boolean sucessoTransferencia = contaDaJuliana.transfere(3000, contaDoThiago);
		if (sucessoTransferencia) {
			System.out.println("Transferencia com sucesso");
		} else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(contaDaJuliana.saldo);
		System.out.println(contaDoThiago.saldo);
		
		contaDoThiago.titular = "Thiago Silva";
		System.out.println(contaDoThiago.titular);
	}
}
