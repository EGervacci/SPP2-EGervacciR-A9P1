/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.egervaccir.a9p1;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class SPP2EGervacciRA9P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definir el tamaño de las matrices.
        int tamaño=Int("el tamaño de los arreglos: ");
        //Creación de las matrices A y B. Suma de matrices A y B. Salida de resultados.
        sumaMatriz(crearMatriz("A",tamaño),crearMatriz("B",tamaño));
        
        
    }
    public static int Int(String mensaje){
        Scanner kb = new Scanner (System.in);
        int varEntera = 0;
        boolean flag;
        
        do{
        System.out.print("Introduzca " + mensaje);
        try{
        varEntera = kb.nextInt();
        flag=false;
    }catch (Exception ex){
            System.out.println("Introdujo una variable incorrecta " + ex);
            flag=true;
            kb.nextLine();
    } 
  } while (flag); 
    return varEntera;
    }
    public static int [][] crearMatriz(String mensaje, int tamaño){
        System.out.println("\nIntroduzca el contenido de la matriz "+mensaje);
        int[][]Matrix=new int[tamaño][tamaño];
        int valor;
        System.out.println("El tamaño de la matriz es "+Matrix.length);
        for (int i=0; i<Matrix.length; i++){
            for (int j=0; j<Matrix[i].length; j++){
            Matrix[i][j]=Int("el valor ("+i+","+j+"): ");
            }
        }
        return Matrix;
        }
    public static void sumaMatriz(int[][] a,int[][] b){
        int[][]r=new int[a.length][a.length];
        System.out.println("\nSumatoria");
        System.out.println("El tamaño de la matriz es "+r.length);
        for (int i=0; i<r.length; i++){
            for (int j=0; j<r[i].length; j++){
            r[i][j]=a[i][j]+b[i][j];
            System.out.println("El valor ("+i+","+j+") es igual a: "+(r[i][j]));
            }
        }
       
        }
    public static void resultadoMatriz(int[][]r){
        int[][]Matriz=new int[r.length][r.length];
        for (int i=0; i<Matriz.length; i++){
            for (int j=0; j<Matriz[i].length; j++){
                System.out.println("El valor ("+i+","+j+") es igual a: "+(r[i][j]));
            
            }
        }
    }
   }
   
    

