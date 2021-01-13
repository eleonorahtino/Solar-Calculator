/**
 * Questa classe contiene metodi per conversioni elettriche 
 *
 * @author EleonoraAccatino, MatteoBurello, PaoloOrsi
 * @version 1.0
 * @since 1.0
 */
public class FormuelMetodi_3M {

    public static double PowerCalculation(double Ampere, double Volt) {
        double Power = Ampere * Volt / 1000;
        return Power;
    }

    public static double KilowattsToAmpsCalculation(double Power, double Volt) {
        double Ampere = 1000 * Power / Volt;
        return Ampere;
    }

}