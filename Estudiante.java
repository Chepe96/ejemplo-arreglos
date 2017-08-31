public class Estudiante
{
    private String nombre;
    private int clave;
    private String apellido;
    
    /**
     * Captura un estudiante con los datos nombre y clave.
     * @param claveIni Pide la clave y la asigna a la variable clave.
     * @param nombreIni Pide el nombre y lo asigna a la variable nombre.
     * @param apIni Pide el apellido y lo asigna a la variable apellido.
     */
    public Estudiante(int claveIni, String nombreIni, String apIni)
    {
        nombre = nombreIni;
        clave = claveIni;
        apellido = apIni;
    }
    
    /**
     * Regresa la clave del estudiante.
     */
    public int claveAlumno()
    {
        return clave;
    }
    
    /**
     * Regresa el nombre del estudiante.
     */
    public String nombreAlumno()
    {
        return nombre;
    }
    
    /**
     * Regresa el apellido del estudiante.
     */
    public String apellidoAlumno()
    {
        return apellido;
    }
    
    /**
     * Regresa los datos del estudiante clave, nombre y apellido.
     */
    public String dimeDetalles()
    {
        return "Clave: " + clave + ", Nombre: " + nombre + ",Apellido: " + apellido;
    }
}