public class Grupo
{
    private String nomMateria;
    private Estudiante[] estudiantes;
    
    /**
     * Captura los datos del grupo, numero de estudiantes y nombre del grupo.
     * @param totalEstudiantes Es el valor del cupo de estudiantes para asignar al grupo.
     * @param nomMateria Es una cadena con el nombre de la materia del grupo.
     * Inicializa un arreglo estudiantes con los datos anteriores.
     */
    public Grupo(int totalEstudiantes, String nomMateria)
    {
        estudiantes = new Estudiante[totalEstudiantes];
        this.nomMateria = nomMateria;
    }
    
    /**
     * Inscribe un alumno en el grupo.
     * @param unEstudiante Es el objeto estudiante a inscribir en el grupo.
     * @return Regresa verdadero si el estudiante fue inscrito o falso en caso
     *         de que no se pudiera inscribir.
     */
    //terminar este metodo de tarea
    public boolean inscribir(Estudiante unEstudiante)
    {
        int existe = this.buscarEstudiante(unEstudiante.claveAlumno());
        if(existe!=-1)
        {
            return false;//el estudiante esta inscrito
        }
        int posDisponible = this.buscaEspacioDisponible();
        if(posDisponible ==-1)
        {
            return false;//el arreglo esta lleno
        }
        estudiantes[posDisponible] = unEstudiante;// inscribe al estudiante
        return true;
    }
    
    /**
     * Da de baja a un alumno del grupo mediante su clave.
     * @param unEstudiante Es el objeto estudiante a dar de baja en el grupo.
     * @return Regresa verdadero si el estudiante fue dado de baja o falso en
     *          caso de que no se pudiera dar de baja.
     */
    public boolean darBaja(Estudiante unEstudiante)
    {
        //buscar estudiante con la clave dada y asignarle un null
        int existe = this.buscarEstudiante(unEstudiante.claveAlumno());
        if(existe==-1)
        {
            return false;//el estudiante no esta inscrito
        }
        estudiantes[existe] = null;// inscribe al estudiante
        return true;
        /*for(int i=0;i<estudiantes.length;i++)
        {
            if(estudiantes[i].claveAlumno() == claveEstudiante)
            {
                estudiantes[i] = null;
                break;
            }
        }*/
    }
    
    /**
     * Busca un estudiante por medio de su clave.
     * @param claveEstudiante Parametro que representa la clave del estudiante a buscar.
     * @return Regresa la posición del estudiante en el arreglo o -1 si no existe.
     */
    private int buscarEstudiante(int claveEstudiante)
    {
        for(int i=0;i<estudiantes.length;i++)
        {
            if(estudiantes[i] != null && estudiantes[i].claveAlumno() == claveEstudiante)
            {
                return i;
            }
        }
         return -1;
    }
    
    /**
     * Busca un espacio disponible en el arreglo.
     * @return Regresa la primer posición nula dentro del arreglo.
     */
    private int buscaEspacioDisponible()
    {
        for(int i=0;i<estudiantes.length;i++)
        {
            if(estudiantes[i] == null)
            {
                return i;
            }
        }
        return -1;
    }
    

}
