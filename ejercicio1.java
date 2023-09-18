import java.util.Scanner;
 public class ejercicio1 {
    public static void main(String[] args){

        Scanner scan =  new Scanner(System.in);
        System.out.println("Ingresa el comienzo de la sucesion : ");
        int limi = scan.nextInt();
        System.out.println("Ingresa el final de la sucesion : ");
        int limis = scan.nextInt();
        if(limi > limis){
            System.out.println("El limite superior debe de ser mayor al inferior");
           
        }else{
            int result = cuadrados(limi, limis);
            System.out.println("La suma de cuadrados entre "+ limi+ " y "+ limis +" es : " + result);
        }

    }
   public static int cuadrados( int limi, int limis){
   if(limi == limis){
    System.out.println(limi + "(2) = " + (limi * limi));
    return limi * limi;
   }else{
    int cuadrado = limi * limi;
    System.out.println(limi + "(2) = "+ cuadrado);
    int suma = cuadrados(limi + 1, limis);
    return suma + cuadrado;
   }


   }
}
