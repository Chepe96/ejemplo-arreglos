public class Grupo
{
    private String nomMateria;
    private Estudiante[] estudiantes;
    
    public Grupo(int totalEstudiantes, String nomMateria)
    {
        estudiantes = new Estudiante[totalEstudiantes];
        this.nomMateria = nomMateria;
    }
    
    //terminar este metodo de tarea
    public void inscribir(Estudiante unEstudiante)
    {
        for(int i=0;i<estudiantes.length;i++)
        {
            if(estudiantes[i] == null)
            {
                estudiantes[i] = unEstudiante;
                break;
            }
        }
    }
    
    public void darBaja(int claveEstudiante)
    {
        //buscar estudiante con la clave dada y asignarle un null
        for(int i=0;i<estudiantes.length;i++)
        {
            if(estudiantes[i].claveAlumno() == claveEstudiante)
            {
                estudiantes[i] = null;
            }
        }
    }
}
