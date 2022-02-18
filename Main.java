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
	
	
	Pila<Integer> calc= new Pila<>();
	
	String op= "1 2  4 + * 3 +";
	String muestra= "1 2 + 4 * 3 +";
	char espacio= muestra.charAt(1);
	char suma= muestra.charAt(4);
	char mult= muestra.charAt(8);
	
	System.out.println(espacio);
	for( int i=0 ; i <op.length(); i++) {
		char ope= op.charAt(i);
		
		if(ope!=espacio) {
			
			boolean isNum = isNumeric(String.valueOf(ope));
			
		
			if(isNum== true) {
				calc.agregar(Character.getNumericValue(ope));
				
		
			}
			else{
				System.out.println("operacion");
				if(ope==suma) {
					
					int a = calc.obtener();
					int b = calc.obtener();
					int c=a+b;
					calc.agregar(c);
					
				}
				if(ope==mult) { 
					int fac1 = calc.obtener();
					int fac2 = calc.obtener();
					int d=fac1*fac2;
					calc.agregar(d);
					
				}
				
			}
			
		}
		
		
	}
	System.out.println(calc.toString());		
}	


}
