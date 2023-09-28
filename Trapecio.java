package Ejercicio_polinomios;

/**
 * The type Trapecio.
 */
public class Trapecio extends Cuadrilateros {
    private double ladoA;
    private double ladoB;
    private double ladoC;
    private double ladoD;

    /**
     * Instantiates a new Trapecio.
     *
     * @param ladoA the lado base 1
     * @param ladoB the lado base 2
     * @param ladoC     the lado a
     * @param ladoD     the lado b
     */
    public Trapecio(double ladoA, double ladoB, double ladoC, double ladoD) {
        super(ladoA, ladoB, ladoC, ladoD);        
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC; 
        this.ladoD = ladoD;
    }

    @Override
    public String getDescription() {
        return "Soy un cuadrilátero TRAPECIO";
    }

    @Override
    public double getSuperficie() {
        double c = ((ladoB - ladoA)/2);
        double h = Math.sqrt((ladoC * ladoC) - (c * c));
        double areaTrapecio = ((ladoB + ladoA) * h)/2;
        return areaTrapecio;

}
}
    

