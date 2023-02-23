package View;
import Controller.Fat;

public class Principal {
	
	public static void main (String []args) {
		Fat FT = new Fat();
		
		int x = 5;
		
		int fator = FT.fator(x);
		System.out.println("O fatorial de " + x + " e " + fator);
	}

}
