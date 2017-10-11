public class MeterDatosArray
{
    
    public static void main (String[]args)
    {
        //le pone capacidad al arreglo//

        int[] Arreglo; //declara el arreglo
        Arreglo = new int [5];
        
        Arreglo[0]=1;
        Arreglo[1]=2;
        Arreglo[2]=3;
        Arreglo[3]=4;
        Arreglo[4]=5;
        
        for (int i=0; i<=4; i++)//lista todo el arreglo
        {
        System.out.println(Arreglo[i]);
       
        }
    }
}
