
package introduccion;

import java.util.Scanner;

public class Matriz {
    public static void main(String principal[]){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas: ");
        int f = leer.nextInt();
        System.out.println("Ingrese el numero de columnas: ");
        int c = leer.nextInt();
        //Creo la matriz de f filas x c columnas
        int mat[][] = new int[f][c];
        //Lleno la matriz con numeros aleatorios
        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
                //genero un numero aleatorio entre 0 y 1000
                int aleatorio = (int)(Math.random()*1000);
                //asigno el numero en la matriz
                mat[i][j]=aleatorio;
            }
        }
        //Imprimo la matriz
        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
                //imprimo las columnas de la fila correspondiente con
                //espacio de tabulador para alinear "\t"
                System.out.print(mat[i][j]+"\t");
            }
            //despues de imprimir la fila, doy salto de linea a la siguiente
            System.out.println();
        }
        int filas = mat.length;  // cantidad de filas
        int columnas = mat[0].length; // cantidad de columnas
        System.out.println("Filas: \t"+filas);
        System.out.println("Columnas \t"+columnas);
    }
}
