
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Representa un fecha
 */
public class Fecha {
    private LocalDate fecha;

    /**
     * Constructor
     */
    public Fecha(int dia, int mes, int year) {
        this.fecha = LocalDate.of(year, mes, dia);
    }

    /**
     * Accesor día
     */
    public int getDia() {
        return this.fecha.getDayOfMonth();
    }

    /**
     * Accesor mes
     */
    public int getMes() {
        return this.fecha.getMonthValue();
    }

    /**
     * Accesor year
     */
    public int getYear() {
        return this.fecha.getYear();
    }

    /**
     * Devuelve true si la fecha actual es anterior a
     * la recibida
     */
    public boolean antesQue(Fecha fecha) {
        LocalDate otra = LocalDate.of(fecha.getYear(),
                fecha.getMes(), fecha.getDia());
        return this.fecha.isBefore(otra);
    }

    /**
     * Representación textual de la fecha
     */
    public String toString() {
        return this.fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

    }

    
}
