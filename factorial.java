
public class factorial{

    public static int factoriall(int num){
    int fact = 1;
    if(num != 0){
        for(int i = num; i>0; i--){
            fact *= i;
        }
    }
    return fact;

}

public static void main(String[] args) {
 int num = 10;
 int result = factoriall(num);
 System.out.println("El factorial de : "+ num+" es : "+ result);    
}
}




/* 
recursivo
private int factorial_recursiva(int num){
    if(num==0){
        return 1;
    }
    else{
        return num * factorial(num-1);
    }
}
}
*/ 