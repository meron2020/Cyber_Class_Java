package Grade_11.DataStructures.Node.BookQuestions.Page_102.Q_56;

public class PolynomialCouple {
    private int coefficient;

    public PolynomialCouple(int coefficient, int degree) {
        this.coefficient = coefficient;
        this.degree = degree;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    private int degree;

    public PolynomialCouple(PolynomialCouple polyToCopy) {
        this.coefficient = polyToCopy.getCoefficient();
        this.degree = polyToCopy.getDegree();
    }
}
