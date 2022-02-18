package lab2Estructuras;

import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
	
;
	Calcladora pru= new Calcladora();
	lector lector= new lector();
	Scanner teclado= new Scanner(System.in);
	System.out.print(lector.Leer("C:\\Users\\Usuario\\Desktop\\operacion.txt"));
	String op= lector.Leer("C:\\Users\\Usuario\\Desktop\\operacion.txt");
	System.out.print(pru.calcular(op));
	
	
			
}	


}
