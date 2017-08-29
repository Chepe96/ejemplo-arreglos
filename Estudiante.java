public class Estudiante
{
    private String nombre;
    private int clave;
    
    /**
     * Captura un estudiante con los datos nombre y clave.
     * @param claveIni Pide la clave y la asigna a la variable clave.
     * @param nombreIni Pide el nombre y lo asigna a la variable nombre.
     */
    public Estudiante(int claveIni, String nombreIni)
    {
        nombre = nombreIni;
        clave = claveIni;
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
     * Regresa los datos del estudiante clave y nombre.
     */
    public String dimeDetalles()
    {
        return "Clave: " + clave + ", Nombre: " + nombre;
    }
}