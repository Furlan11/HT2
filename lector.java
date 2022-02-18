package lab2Estructuras;
/**
 * una clase para leer un archivo .txt
 * @author Guillermo Furlan 20713 
 * 
 *
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class lector {
	
	/**
	 * metodo para leer el archivoo
	 * @param direccion la direccion donde se encuentra el archivo con la operacion
	 * @return String con el resultado o eltexto del documento
	 */
	 public String Leer(String direccion){ //direccion del archivo
	        
	        String texto = "";
	        
	        try{
	            BufferedReader bf = new BufferedReader(new FileReader(direccion));
	            String temp = "";
	            String bfRead;
	            while((bfRead = bf.readLine()) != null){ 
	                //haz el ciclo, mientras bfRead tiene datos
	                temp = temp + bfRead; //guardado el texto del archivo
	            }
	            
	            texto = temp;
	            
	        }catch(Exception e){ 
	            System.err.println("No se encontro archivo");
	        }
	        
	        return texto;
	        
	    }
	    
	}

