package Controller;

public class Fat {
	public Fat() {
		super();
	}	
	public static int fator(int x) {
	    // condição de parada
	    if (x == 0) {
	        return 1;
	    }
	    //  chamada recursiva
	    else {
	        return x * fator(x-1);
	    }
	}

}
