package lab2Estructuras;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class lector {
	
	public String Leer(String t) {
	  String nombreFichero = t;
	  String texto = "";
      //Declarar una variable BufferedReader
      BufferedReader br = null;
      try {
         //Crear un objeto BufferedReader al que se le pasa 
         //   un objeto FileReader con el nombre del fichero
         br = new BufferedReader(new FileReader(nombreFichero));
         //Leer la primera línea, guardando en un String
          texto = br.readLine();
         //Repetir mientras no se llegue al final del fichero
         while(texto != null)
         {
             //Hacer lo que sea con la línea leída
             System.out.println(texto);
             //Leer la siguiente línea
             texto = br.readLine();
         }
      }
      catch (FileNotFoundException e) {
          System.out.println("Error: Fichero no encontrado");
          System.out.println(e.getMessage());
      }
      catch(Exception e) {
          System.out.println("Error de lectura del fichero");
          System.out.println(e.getMessage());
      }
      finally {
          try {
              if(br != null)
                  br.close();
          }
          catch (Exception e) {
              System.out.println("Error al cerrar el fichero");
              System.out.println(e.getMessage());
          }
      }
	
	return texto;
	}
}
