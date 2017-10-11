//para ejecutar este se tiene que ejecutar directo del navegador de la izquierda, click derecho y run file
public class Test {
    
    
    public static void main (String []args)
    {
        CCuenta cuenta01 = new CCuenta();
        cuenta01.asignarNombre("Un nombre"); 
        cuenta01.asignarCuenta("Una Cuenta");
        cuenta01.asignarTipoDeInterés(2.5);  
        cuenta01.ingreso(12000);
        cuenta01.reintegro(3000);
        
        System.out.println(cuenta01.obtenerNombre());
        System.out.println(cuenta01.obtenerCuenta());
        System.out.println(cuenta01.obtenerTipoDeInterés());
        System.out.println(cuenta01.estado());
        System.out.println(cuenta01.obtenerTipoDeInterés());
        
    }
}
