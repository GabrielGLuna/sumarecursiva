public class factorial_recursivo {

    private static int factorial(int numero){
        if(numero == 0){
            return 1;
        }else{
            return numero * factorial(numero - 1);
        }
    }
    
    public static void main(String[] arg){
        int numero=  5;
        int resultado;

        System.out.println("Programa que calcula el factorial de un numero");
        resultado = factorial(numero);
        System.out.println("El factorial de :"+numero+" es :"+ resultado);    
    }
}
