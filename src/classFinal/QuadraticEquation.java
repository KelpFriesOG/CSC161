package classFinal;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    // #region Constructor
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    // #endregion

    // #region Getters
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    // #endregion

    // #region Methods

    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    public double getRoot1() {

        double root = getDiscriminant() >= 0 ? ((-1 * b) + Math.sqrt(getDiscriminant())) / (2 * a) : 0.000;
        return 0;

    }

    public double getRoot2() {
        return ((-1 * b) - Math.sqrt(getDiscriminant())) / (2 * a);
    }

    // #endregion
}
