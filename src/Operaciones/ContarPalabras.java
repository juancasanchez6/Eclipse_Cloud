package Operaciones;


//Programa que cuenta el número de palabras de un texto.                                  
import java.util.Scanner;
import java.lang.String;

public class ContarPalabras {
	
	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     String frase;
	     System.out.print("Introduce una frase: ");
	     frase = sc.nextLine();
	     System.out.println("Número de palabras: " + contarPalabras(frase));     
	     sc.close();
	  }
		//Método que recibe un String y devuelve el número de palabras que contiene
		public static int contarPalabras(String s) {
		int contador = 0, n=0;
		String palabra="";
                        
		if (s.isEmpty()) { //si la cadena está vacía
		    contador = 0;
		} else {
		        while (n < s.length()) {   
		             if  (Character.isLetter(s.charAt(n))) { 
		            	 	palabra+=s.charAt(n); 
		            	 	
		            	 } else if ((s.charAt(n) ==' ') || ((s.charAt(n) ==',')) || (s.charAt(n) =='.') || (s.charAt(n) ==';') || (s.charAt(n) ==':') || (s.charAt(n) ==')' || (s.charAt(n) =='('))) {
		            	if (palabra.length()>0) {
		            		 contador ++;
		            		 palabra="";
		            		 
		            		 }
		            	
		            	 }  
		             n++;
		             }
		            
		}
		if (palabra.length()>0){
			contador++;; 
		}
		
		return contador;
		}
}

/*
 * package Contar;

//Programa que cuenta el número de palabras de un texto.                                  
import java.util.Scanner;
import java.lang.String;


public class Contar {
  
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String frase;
     System.out.print("Introduce una frase: ");
     frase = sc.nextLine();
     System.out.println("Número de palabras: " + contarPalabras(frase));                                             
  }
	//Método que recibe un String y devuelve el número de palabras que contiene
	public static int contarPalabras(String s) {
	int contador = 0, pos=-1;
	s = s.trim(); //eliminar los posibles espacios en blanco al principio y al final                              
	if (s.isEmpty()) { //si la cadena está vacía
	    contador = 0;
	} else {
	        pos = s.indexOf("\n"); 
	        while (pos != -2) {   
	               contador++;    
	               pos = s.indexOf("\t", pos + 2);                        
	        }                                     
	}
	return contador;
	}
}
 */
