// Programa para verificar si el numero es par o impar

public class NumeroPar {
    
    public static void main(String[]args)
    {
               
        int num = 24;
        
        if ( num%2 == 0 ) //Si el resultado de la division es igual a 0
        System.out.println("Tu numero es par");
        else
        System.out.println("Tu numero es impar");//En esta linea acaba el else por eso la siguiente linea se imprime en ambos casos
        
        
        System.out.println("Valor: " + num);
        
        
    }
    
}
