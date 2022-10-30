/**
 * Un objeto de esta clase almacena la ponderación que tiene
 * cada instrumento de evaluación (los controles, las actividades
 * y los proyectos)
 */
public class PonderacionInstrumentos {
    private int controles;
    private int actividades;
    private int proyectos;

    /**
     * Constructor  
     */
    public PonderacionInstrumentos(int controles, int actividades,
                                   int proyectos) {
        this.controles = controles;
        this.actividades = actividades;
        this.proyectos = proyectos;
    }

    /**
     * Accesor ponderación controles
     */
    public int getControles() {
        return controles;
    }

    /**
     * Mutador ponderación controles
     */
    public void setControles(int controles) {
        this.controles = controles;
    }

    /**
     * Accesor ponderación actividades
     */
    public int getActividades() {
        return actividades;
    }

    /**
     * Mutador ponderación actividades
     */
    public void setActividades(int actividades) {
        this.actividades = actividades;
    }

    /**
     * Accesor ponderación protectos
     */
    public int getProyectos() {
        return proyectos;
    }

    /**
     * Mutador ponderación protectos
     */
    public void setProyectos(int proyectos) {
        this.proyectos = proyectos;
    }

    /**
     * Representación textual del objeto
     */
    public String toString() {
        return "Ponderacion Instrumentos Evaluación" +
                "\n\tControles = " + controles + "%" +
                "\n\tActividades = " + actividades + "%" +
                "\n\tProyectos = " + proyectos + "%\n\n";
    }

    /**
     * Este método se ha incluido solo para testear la clase más fácilmente
     */
    public void print() {
        System.out.println(this.toString());

    }
}