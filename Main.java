package lab2Estructuras;

public class Main {
	public static boolean isNumeric(String ope) {
	    try {
	        double d = Double.parseDouble(ope);
	    } catch (NumberFormatException nfe) {
	        return false; //Error no es numerico
	    }
	    return true; //Es numerico
	}
public static void main(String[] args) {
	
;
	Calcladora pru= new Calcladora();
	String op= "0 0 / 4 * 3 +";
	System.out.print(pru.calcular(op));
	
	
			
}	


}
