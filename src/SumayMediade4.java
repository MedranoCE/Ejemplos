public class SumayMediade4 {
    
    public static void main (String[]Args)
    {
        int a, b, c, d;
        
        a=1;
        b=2;
        c=3;
        d=4;
        
        double media;
        float suma=0;
        
        /*cuando se hace la operacion el resultado se almacena en un entero
        *para forzar a que se guarde con decimal se po ne double antes del resultado
        *si se quita sale un 2 y debe ser un 2.5
        */
        media=(double)(a+b+c+d)/ 4; //Nota arriba
        suma=a+b+c+d;
        
        System.out.println("El resultado de la media de los 4 numeros es: " +  media);
        System.out.println("El resultado de la suma de los 4 numeros es: " +  suma);
               
        
    }
}
