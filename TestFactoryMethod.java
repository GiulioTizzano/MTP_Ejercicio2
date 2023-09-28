package Ejercicio_polinomios;

/**
 * The type Test factory method.
 */
public class TestFactoryMethod {

    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(String[]args){
        CuadrilateroFactoryMethod factoria = new CuadrilateroFactory();
        Cuadrilateros cuadrilatero = factoria.createCuadrilatero(4,10,5,5);
        Cuadrilateros cuadrilatero2 = factoria.createCuadrilatero(4,4,4,4);
        Cuadrilateros cuadrilatero3 = factoria.createCuadrilatero(4,6,4,6);

        System.out.println("Cuadrilatero 1: " + cuadrilatero.getDescription());
        System.out.println("Area: " + cuadrilatero.getSuperficie() + " u^2");
        System.out.println("Cuadrilatero 2: " + cuadrilatero2.getDescription());
        System.out.println("Area: " + cuadrilatero2.getSuperficie() + " u^2");
        System.out.println("Cuadrilatero 3: " + cuadrilatero3.getDescription());
        System.out.println("Area: " + cuadrilatero3.getSuperficie() + " u^2");
        
    }
    
}