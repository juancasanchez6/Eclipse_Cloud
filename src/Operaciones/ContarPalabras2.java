package Operaciones;

import java.util.Scanner;

public class ContarPalabras2 {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     String s;
	     System.out.print("Introduce una frase: ");
	     s = sc.nextLine();
	     System.out.println("Número de palabras: " + contarPalabras(s));  
	     sc.close();
	  }
	public static int contarPalabras(String s) {
		int contador = 0, pos=0;
		
		s = s.trim(); //eliminar los posibles espacios en blanco al principio y al final                              
		if (s.isEmpty()) { //si la cadena está vacía
		    contador = 0;
		} else {
			for(int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if(ch == ' ' || ch == ',' || ch == '.' || ch == '(' || ch == ')') {
					pos = s.indexOf(" ", pos + 1);
				}else {
					while (pos != 0) { 
			        	  //(pos != 0)
			               pos = s.indexOf(" ", pos + 1);  
			               contador++;
			               pos++;
			        }
				}
			}    
		}
		return contador;
		}
}
