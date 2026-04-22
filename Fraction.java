public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction getProductOfThisAnd(Fraction other) {
        return new Fraction(this.numerator * other.numerator, this.denominator * other.denominator);
    }

    public String toString() {
        return this.numerator + "/" + this.denominator;

    }

    public static void main(String[] args) {
        Fraction fr1 = new Fraction(4, 3);
        Fraction fr2 = new Fraction(2, 5);

        Fraction fr3 = fr1.getProductOfThisAnd(fr2);
        String str = fr1.toString();

        System.out.println(fr3);
        System.out.println(str);

    }
}
