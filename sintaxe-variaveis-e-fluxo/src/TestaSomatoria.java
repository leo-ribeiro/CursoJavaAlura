
public class TestaSomatoria {
	
	public static void main(String[] args) {		
		int contador = 0;
		int total = 0;
		
		while(contador <= 10) {
			
			total = total + contador;	// Pode ser assim... 
			total += contador;  // Esse é o modo mais utilizado no Java.
			 
			System.out.println(total);
			contador++;
		}	
		
	}
}
