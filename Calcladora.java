package lab2Estructuras;

public class Calcladora {
	
	private Pila<Integer> calc;

	

	public static boolean isNumeric(String ope) {
	    try {
	        double d = Double.parseDouble(ope);
	    } catch (NumberFormatException nfe) {
	        return false; //Error no es numerico
	    }
	    return true; //Es numerico
	}
	
	public String calcular(String op) {
		 calc= new Pila<>();
		
		
		String muestra= "1 2 + 4 * 3 - /";
		char espacio= muestra.charAt(1);
		char suma= muestra.charAt(4);
		char mult= muestra.charAt(8);
		char rest= muestra.charAt(12);
		char divi= muestra.charAt(14);
		
		System.out.println(espacio);
		for( int i=0 ; i <op.length(); i++) {
			char ope= op.charAt(i);
			
			if(ope!=espacio) {
				
				boolean isNum = isNumeric(String.valueOf(ope));
				
			
				if(isNum== true) {
					calc.agregar(Character.getNumericValue(ope));
					
			
				}
				else{
					
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
					if(ope==rest) { 
						int fac1 = calc.obtener();
						int fac2 = calc.obtener();
						int d=-fac1+fac2;
						calc.agregar(d);
						
					}
					if(ope==divi) { 
						int fac1 = calc.obtener();
						int fac2 = calc.obtener();
						if(fac1 == 0) {
							return("division por 0 no esta definida");
							
						}
						
						else {
						int d=fac2/fac1;
						calc.agregar(d);
						}
					}
					
				}
				
			}
			
			
		}
		
		return(calc.toString());
	}
	
	
}
