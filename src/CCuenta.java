class CCuenta 
{
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoDeInterés;

public void asignarNombre(String nom)
{
    if (nom.length() ==0)
    {
    System.out.println("Error: Cadena vacía");
    return;
    }
    nombre=nom;
}

public String obtenerNombre()
{
    return nombre;
}

public void asignarCuenta(String cue)
{
    if(cue.length() == 0)
    {
        System.out.println("ERror: cuenta no válida");
        return;
    }
    cuenta  = cue;
}

public String obtenerCuenta()
{
    return cuenta;
}

public double estado()
{
    return saldo;
}

public void ingreso(double cantidad)
{
    if (cantidad <0)
    {
        System.out.println("Error: cantidad negativa");
        return;
    }
    saldo = saldo + cantidad;
}

public void reintegro(double cantidad)
{
    if (saldo - cantidad < 0)
    {
        System.out.println("Error: No dispone de saldo" );
        return;
    }
    saldo = saldo - cantidad;
}

public void asignarTipoDeInterés(double tipo)
{
    if (tipo < 0 )
    {
        System.out.println("Error: tipo no valido");
        return;

    }
    tipoDeInterés = tipo;
}

public double obtenerTipoDeInterés()
{
    return tipoDeInterés;
}

}