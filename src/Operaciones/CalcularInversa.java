package Operaciones;

public class CalcularInversa {

	public static void main(String[] args) {
		//int matriz[][] = new int[3][3];
		int matriz[][] = {{2, 1, 3},
                {1, 4, 5},
                {6, 1, 1}};
		//rellenarMatriz(matriz);
		System.out.println("La matriz es: ");
		showMatriz(matriz);
		System.out.println("\nEl determinante es: " + determinante(matriz));
	}
	
	/*public static void rellenarMatriz(int[][] matriz) {
		 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random()*3+1);
 
            }
        }
 
    }*/
	 public static void showMatriz(int[][] matriz) {

		    for (int i = 0; i < matriz.length; i++) {
		        for (int j = 0; j< matriz[0].length ; j++) {
		            System.out.print(matriz[i][j]+" ");
		        }
		        System.out.println("");
		    }
		  }
	 public static int determinante(int[][] matriz) {
		 int det = 0;
		 
		 det = (matriz[0][0] * matriz[1][1] * matriz[2][2]) + (matriz[0][1] * matriz[1][2] * matriz[2][0]) + (matriz[0][2] * matriz[1][0] * matriz[2][1]);
		 det -= (matriz[0][2] * matriz[1][1] * matriz[2][0]) + (matriz[1][2] * matriz[2][1] * matriz[0][0]) + (matriz[2][2] * matriz[0][1] * matriz[1][0]);
		 return det;
		 
	 }
}
