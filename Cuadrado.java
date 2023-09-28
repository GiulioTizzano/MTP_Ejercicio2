package Ejercicio_polinomios;

/**
 * The type Cuadrado.
 */
public class Cuadrado extends Cuadrilateros {

    /**
     * Instantiates a new Cuadrado.
     *
     * @param ladoA the lado a
     * @param ladoB the lado b
     * @param ladoC the lado c
     * @param ladoD the lado d
     */
    public Cuadrado(double ladoA, double ladoB, double ladoC, double ladoD) {
        super(ladoA, ladoB, ladoC, ladoD);
    }

    @Override
    public String getDescription() {
        return "Soy un cuadrilátero CUADRADO";
    }

    @Override
    public double getSuperficie() { 
        //Aquí iría el algoritmo para calcular la superficie de un cuadrado
        double areaCuadrado;
        if(ladoA >= 0){
            areaCuadrado = ladoA * ladoA;
        } else{
            return 0;
        }
        return areaCuadrado;
    }

    // @Override
    // public void dibujate() {
    //     //Aquí iría el algoritmo para dibujar un cuadrado.
    //     System.out.println("Dibujando un Cuadrado");
    // }
}
    

