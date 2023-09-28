package Ejercicio_polinomios;

/**
 * The type Rectangulo.
 */
public class Rectangulo extends Cuadrilateros{

    /**
     * Instantiates a new Rectangulo.
     *
     * @param ladoA the lado a
     * @param ladoB the lado b
     * @param ladoC the lado c
     * @param ladoD the lado d
     */
    public Rectangulo(double ladoA, double ladoB, double ladoC, double ladoD) {
        super(ladoA, ladoB, ladoC, ladoD);
    }

    @Override
    public String getDescription() {
        return "Soy un cuadrilátero RECTANGULO";
    }

    @Override
    public double getSuperficie() {
        
            double superficie = ladoA * ladoB;
       
        return superficie;
    }
}