package Ejercicio_polinomios;

/**
 * The type Cuadrilatero factory.
 */
public class CuadrilateroFactory implements CuadrilateroFactoryMethod {

    @Override
    public Cuadrilateros createCuadrilatero(double ladoA, double ladoB, double ladoC, double ladoD) {
        if ( ladoA == ladoB && ladoC == ladoD && ladoA == ladoC && ladoA == ladoD) {
            return new Cuadrado(ladoA, ladoB, ladoC, ladoD);
        } else if ( ladoA == ladoC && ladoB == ladoD ) {
            return new Rectangulo(ladoA, ladoB, ladoC, ladoD);
        } else{
            return new Trapecio(ladoA, ladoB, ladoC, ladoD);
        }
            }
        }
        
    

        