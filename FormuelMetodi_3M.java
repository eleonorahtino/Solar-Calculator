/**
 * Questa classe contiene metodi per le conversioni elettriche
 *
 * @author EleonoraAccatino, MatteoBurello, PaoloOrsi
 * @version 1.0
 * @since 1.0
 */
public class FormuelMetodi_3M {

    /**
     * Questo metodo calcola la potenza espressa in kW partendo dai parametri Ampere
     * e Volt.
     * 
     * @param Ampere valore degli Ampere.
     * @param Volt   valore dei Volt.
     * @return valore in kW della potenza attraverso la formula: P(kW) = I(A) *
     *         V(V)/1000.
     */
    public static double PowerCalculation(double Ampere, double Volt) {
        double Power = Ampere * Volt / 1000;
        return Power;
    }

    /**
     * Questo metodo permette di calcolare i Kilowattora utilizzando come parametri,
     * dati, potenza e tempo.
     *
     * @param Power valore energietico in kw inserito in imput dall'utente.
     * @param Time  valore temporale espresso in ore inserito in imput dall'utente.
     * @return valore energetico totale espresso in kWh. Formula di conversione: E
     *         (kWh)=P(kW)*t(h).
     */
    public static double KilowattsToAmpsCalculation(double Power, double Volt) {
        double Ampere = 1000 * Power / Volt;
        return Ampere;
    }

}