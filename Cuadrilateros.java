package Ejercicio_polinomios;

/**
 * The type Cuadrilateros.
 */
public abstract class Cuadrilateros{
    /**
     * The Lado a.
     */
    public double ladoA;
    /**
     * The Lado b.
     */
    public double ladoB;
    /**
     * The Lado c.
     */
    public double ladoC;
    /**
     * The Lado d.
     */
    public double ladoD;


    /**
     * Instantiates a new Cuadrilateros.
     *
     * @param ladoA the lado a
     * @param ladoB the lado b
     * @param ladoC the lado c
     * @param ladoD the lado d
     */
// Constructor
    public Cuadrilateros(double ladoA, double ladoB, double ladoC, double ladoD){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.ladoD = ladoD;
    }

    /**
     * Gets superficie.
     *
     * @return the superficie
     */
    public abstract double getSuperficie();

    /**
     * Gets description.
     *
     * @return the description
     */
    public abstract String getDescription();

    /**
     * Get lado a double.
     *
     * @return the double
     */
    public double getLadoA(){ return ladoA; }

    /**
     * Get lado b double.
     *
     * @return the double
     */
    public double getLadoB(){ return ladoB; }

    /**
     * Get lado c double.
     *
     * @return the double
     */
    public double getLadoC(){ return ladoC;}

    /**
     * Get lado d double.
     *
     * @return the double
     */
    public double getLadoD(){ return ladoD; }

    /**
     * Set lado a.
     *
     * @param ladoA the lado a
     */
    public void setLadoA(double ladoA){ this.ladoA = ladoA; }

    /**
     * Set lado b.
     *
     * @param ladoB the lado b
     */
    public void setLadoB(double ladoB){ this.ladoB = ladoB; }

    /**
     * Setlado c.
     *
     * @param ladoC the lado c
     */
    public void setladoC(double ladoC){ this.ladoC = ladoC; }

    /**
     * Setlado d.
     *
     * @param ladoD the lado d
     */
    public void setladoD(double ladoD){ this.ladoD = ladoD; }
}