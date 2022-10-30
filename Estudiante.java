/**
 * 
 * @author (Jagoba Inda)
 * 
 * Describe a un estudiante
 * Todo estudiante tiene un nombre
 * y guarda las 3 notas que ha sacado en cada una de las tres unidades de
 * trabajo que hay en la evaluación
 */
public class Estudiante {
    private String nombre;
    private NotaEstudianteUnidad notaA;
    private NotaEstudianteUnidad notaB;
    private NotaEstudianteUnidad notaC;

    /**
     * Constructor
     * Inicializa el nombre del estudiante y el resto lo deja a null
     * Cuando se crea un estudiante inicialmente no tiene registrada ninguna
     * nota
     */
    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.notaA = null;
        this.notaB = null;
        this.notaC = null;
    }

    /**
     * Accesor para el nombre
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Mutador para el nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la cantidad de notas registradas hasta el momento
     * (0, 1, 2 o 3)
     */
    public int totalNotas() {
        int registradas = 0;
        if (notaA != null) {
            registradas++;
        }
        if (notaB != null) {
            registradas++;
        }
        if (notaC != null) {
            registradas++;
        }        
        return registradas;
    }

    /**
     * registra un nuevo objeto nota, la nota asociada a una unidad
     * Los objetos se sitúan uno detrás de otro pero siempre han de quedar
     * las notas en orden de fecha de finalización de la UT asociada (de
     * menor a mayor)
     * 
     * Pista!! En este método se utilizará el método totalNotas()
     */
    public void registrarNotaUnidad(NotaEstudianteUnidad nota) {
        if (totalNotas() == 0) {
            notaA = nota;
        }
        else if (totalNotas() == 1) {
            notaB = nota;
            if (notaB.getUnidad().getFechaFin().antesQue(notaA.getUnidad().getFechaFin())) {
                NotaEstudianteUnidad tmp = notaA;
                notaA = notaB;
                notaB = tmp;
            }
        }
        else if (totalNotas() == 2) {
            notaC = nota;
            if (notaC.getUnidad().getFechaFin().antesQue(notaB.getUnidad().getFechaFin()) && notaC.getUnidad().getFechaFin().antesQue(notaA.getUnidad().getFechaFin())) {
                NotaEstudianteUnidad tmp1 = notaA;
                NotaEstudianteUnidad tmp2 = notaB;
                notaA = notaC;
                notaB = tmp1;
                notaC = tmp2;
            }
            else if (notaC.getUnidad().getFechaFin().antesQue(notaB.getUnidad().getFechaFin())) {
                NotaEstudianteUnidad tmp = notaB;
                notaB = notaC;
                notaC = tmp;
            }
        }
        else {
            System.out.println("Error, no se puede introducir una nueva nota");
        }
    }

   
    /**
     * Calcula y devuelve la nota final obtenida por el estudiante en la
     * evaluación que dependerá de la ponderación de cada UT
     * El método devuelve -1 si al invocarlo no se han registrado los tres
     * objetos NotaEstudianteUnidad que se necesitan para calcular la nota final
     */
    public double calcularNotaFinalEstudiante() {
       double sumaA;
       double sumaB;
       double sumaC;
       if (totalNotas() != 3) {
           return -1;
       }
       else {
           sumaA = (notaA.getUnidad().getPesoUnidad() * notaA.calcularNotaUnidad()) / 100;
           sumaB = (notaA.getUnidad().getPesoUnidad() * notaA.calcularNotaUnidad()) / 100;
           sumaC = (notaA.getUnidad().getPesoUnidad() * notaA.calcularNotaUnidad()) / 100;
       }
       return sumaA + sumaB + sumaC;
    }

    /**
     * Representación textual del estudiante (ver enunciado)
     */
    public String toString() {
       //TODO
       
       
       return null;
    }

    /**
     * Este método se ha incluido solo para testear la clase más fácilmente
     */
    public void print() {
        System.out.println(this.toString());

    }

    

}
