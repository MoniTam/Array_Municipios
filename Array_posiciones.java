/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_posiciones;

/**
 *
 * @author ESTEFANIA TAMAY
 */
public class Array_posiciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numbers;
        numbers = new int[10];
        numbers[0]= 1;
        numbers[1]= 2;
        numbers[2]= 3;
        numbers[3]= 4;
        numbers[4]= 5;
        numbers[5]= 6;
        numbers[6]= 7;
        numbers[7]= 8;
        numbers[8]= 9;
        numbers[9]= 10;
            
    System.out.println("ID: 57543 , Monica Estefania Tamay de los Santos");
    System.out.println("Arreglo de posiciones");
    
    //Imprime las diez posiciones
    for(int contador=0; contador<numbers.length;contador++){
      System.out.println(numbers[contador]);
    }
    //Suma
    int suma = 0;
    for(int contador=0;contador<10;contador++){
    suma = suma + numbers[contador];
    }
    System.out.println("La suma de las primeras diez posiciones es : " + suma);
    
    //Promedio o media aritmetica
   
    float promedio = suma / 10;
    System.out.println("El promedio de las primeras diez posiciones es : " + promedio);
 }

     }
