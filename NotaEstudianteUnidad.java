/**
 * 
 * @author (Jagoba Inda)
 * 
 * Un objeto de esta clase est� asociado con una unidad de trabajo
 * y guarda la nota que un estudiante ha sacado en los controles, actividades y
 * proyectos de esa unidad
 */
public class NotaEstudianteUnidad {
    private UnidadTrabajo unidad;
    private double notaControles;
    private double notaActividades;
    private double notaProyectos;

    /**
     * Constructor
     */
    public NotaEstudianteUnidad(UnidadTrabajo unidad, double notaControles,
                                double notaActividades,
                                double notaProyectos) {
        this.unidad = unidad;
        this.notaControles = notaControles;
        this.notaActividades = notaActividades;
        this.notaProyectos = notaProyectos;
    }

    /**
     * Accesor para la UT
     */
    public UnidadTrabajo getUnidad() {
        return unidad;
    }

    /**
     * Accesor para la UT
     */
    public void setUnidad(UnidadTrabajo unidad) {
        this.unidad = unidad;
    }

    /**
     * Accesor para nota controles
     */
    public double getNotaControles() {
        return notaControles;
    }

    /**
     * Mutador para nota controles
     */
    public void setNotaControles(double notaControles) {
        this.notaControles = notaControles;
    }

    /**
     * Accesor para nota actividades
     */
    public double getNotaActividades() {
        return notaActividades;
    }

    /**
     * Mutador para nota actividades
     */
    public void setNotaActividades(double notaActividades) {
        this.notaActividades = notaActividades;
    }

    /**
     * Accesor para nota proyectos
     */
    public double getNotaProyectos() {
        return notaProyectos;
    }

    /**
     * Mutador para nota proyectos
     */
    public void setNotaProyectos(double notaProyectos) {
        this.notaProyectos = notaProyectos;
    }

    /**
     * Calcula y devuelve la nota obtenida en la UT teniendo
     * en cuenta la ponderaci�n de los instrumentos de evaluaci�n
     */
    public double calcularNotaUnidad() {
        PonderacionInstrumentos pond = unidad.getPonderacion();
        double notaUnidad = ((getNotaControles() * pond.getControles()) / 100) +
        ((getNotaActividades() * pond.getActividades()) / 100) +
        ((getNotaProyectos() * pond.getProyectos()) / 100);
        return notaUnidad;
    }

    /**
     * Representaci�n textual del objeto (ver enunciado)
     */
    public String toString() {
        System.out.printf("Controles: %6.2f", getNotaControles());
        System.out.printf("    Actividades de clase: %6.2f", getNotaActividades());
        System.out.printf("    Proyectos: %6.2f\n", getNotaProyectos());
        System.out.printf("Nota obtenida en Unidad de trabajo: %6.2f\n", calcularNotaUnidad());
        return "-".repeat(80);
        
    }

    /**
     * Este m�todo se ha incluido solo para testear la clase m�s f�cilmente
     */
    public void print() {
        System.out.println(this.toString());

    }

   

}
