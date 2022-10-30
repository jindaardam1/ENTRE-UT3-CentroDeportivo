 

/**
 * 
 * @author (Jagoba Inda)
 * 
 * Un objeto de esta clase guarda información de una unidad
 * de trabajo
 * Toda UT además del nombre,  fecha de finalización,
 * y peso en la evaluación tiene asociado un objeto ponderación
 * que incluye las ponderaciones usadas para cada instrumento de evaluación
 */
public class UnidadTrabajo {
    private String nombre;
    private Fecha fechaFin;
    private int pesoUnidad;
    private PonderacionInstrumentos ponderacion;

    /**
     * Constructor 1
     */
    public UnidadTrabajo(String nombre, int dia, int mes, int year, int peso,
                         int controles, int actividades, int proyectos) {
       this.nombre = nombre;
       fechaFin = new Fecha(dia, mes, year);
       pesoUnidad = peso;     
       ponderacion = new PonderacionInstrumentos(controles, actividades, proyectos);
    }

    /**
     * Constructor 2
     */
    public UnidadTrabajo(String nombre, Fecha fechaFin, int peso,
                         PonderacionInstrumentos ponderacion) {
        this.nombre = nombre;
        this.fechaFin = fechaFin;
        this.pesoUnidad = peso;
        this.ponderacion = ponderacion;
    }

    /**
     * Accesor nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Mutador nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Accesor fecha de fin de UT
     */
    public Fecha getFechaFin() {
        return fechaFin;
    }

    /**
     * Mutador fecha de fin de UT
     */
    public void setFechaFin(Fecha fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * Accesor peso de la UT en la evaluación
     */
    public double getPesoUnidad() {
        return this.pesoUnidad;
    }

    /**
     * Accesor para el peso de la UT
     */
    public void setPesoUnidad(int pesoUnidad) {
        this.pesoUnidad = pesoUnidad;
    }

    /**
     * Accesor ponderación
     */
    public PonderacionInstrumentos getPonderacion() {
        return ponderacion;
    }

    /**
     * Mutador ponderación
     */
    public void setPonderacion(PonderacionInstrumentos ponderacion) {
        this.ponderacion = ponderacion;
    }

    /**
     * Devuelve true si la UT actual ha finalizado antes
     * que la recibida como parámetro
     */
    public boolean anteriorA(UnidadTrabajo unidad) {
        boolean esAnterior = this.fechaFin.antesQue(unidad.fechaFin);
        return esAnterior;
    }

    /**
     * Devuelve una copia (clon) de la unidad de trabajo actual con el nombre
     * "Copia de " + nombre de la UT actual
     * Se clonan también los objetos que incluya
     */
    public UnidadTrabajo clonar() {
        String clonNombre = "Clon de " + this.nombre;
        UnidadTrabajo clon = new UnidadTrabajo(clonNombre, getFechaFin(), this.pesoUnidad, getPonderacion());
        return clon;
    }

    /**
     * Representación textual de la UT
     */
    public String toString() {
        String str = "Unidad de trabajo - " + this.nombre +
                "\n\tFecha finalización: " + this.getFechaFin().toString() +
                " | Peso UT: " + this.pesoUnidad + "%\n";
        str += this.ponderacion;
        return str;
    }

    /**
     * Este método se ha incluido solo para testear la clase más fácilmente
     */
    public void print() {
        System.out.println(this.toString());

    }


     
}
