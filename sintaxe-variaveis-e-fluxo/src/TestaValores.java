
public class TestaValores {
	
	public static void main(String[] args) {
		int primeiro = 5;
		System.out.println("Primeiro inicialmente vale: " + primeiro);
		
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		
		System.out.println("Primeiro após atribuição vale: " + primeiro);
		// quanto vale o segundo?
		
		
		System.out.println("Segundo vale: " + segundo);
	}
}
