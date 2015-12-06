package hw1.fraction;

/**
 * Написать класс дробь
 - сложение дробей
 - вычитание
 - умножение
 - деление
 - приведение к строке
 - вывод
 - метод для сравнения с другой дробью
 */
public class MyFraction {

    private int numerator; // числитель
    private int denominator; // знаменатель

    public MyFraction(int numerator, int denominator) {
        this.numerator = (denominator < 0 ? -numerator : numerator);
        if (denominator == 0) {
            throw new IllegalArgumentException("denominator is zero.");
        }
        this.denominator = (denominator < 0 ? -denominator : denominator);
        reduce();
    }

    public MyFraction(int numerator) {
        this(numerator, 1);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }



    public double doubleValue() {
        return ((double) numerator) / ((double) denominator);
    }

    public byte byteValue() {
        return (byte) this.doubleValue();
    }

    public float floatValue() {
        return (float) this.doubleValue();
    }

    public int intValue() {
        return (int) this.doubleValue();
    }

    public long longValue() {
        return (long) this.doubleValue();
    }

    public short shortValue() {
        return (short) this.doubleValue();
    }

    public int compareTo(MyFraction frac) {
        long t = this.getNumerator() * frac.getDenominator();
        long f = frac.getNumerator() * this.getDenominator();
        int result = 0;
        if (t > f) {
            result = 1;
        } else if (f > t) {
            result = -1;
        }
        return result;
    }

    public boolean equals(MyFraction frac) {
        return (numerator == frac.numerator) && (denominator == frac.denominator);
    }

    public MyFraction add(MyFraction fraction) {
        return new MyFraction((numerator * fraction.denominator) + (fraction.numerator * denominator),
                (denominator * fraction.denominator));
    }

    public MyFraction sub(MyFraction fraction) {
        return new MyFraction((numerator * fraction.denominator) - (fraction.numerator * denominator),
                (denominator * fraction.denominator));
    }

    public MyFraction mul(MyFraction fraction) {
        return new MyFraction((numerator * fraction.numerator) * (fraction.numerator * numerator),
                ((denominator * fraction.denominator) * fraction.numerator));
    }

    public MyFraction div(MyFraction fraction) {
        return new MyFraction((numerator * fraction.denominator) * (fraction.denominator * numerator),
                ((denominator * fraction.denominator) * fraction.numerator));
    }

    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }

/*    reduce
    reduce MyFraction to lowest terms by finding largest common denominator
    and dividing it out*/
    private void reduce() {
        // find the larger of the numerator and denominator
        int num = numerator;
        int den = denominator;
        int largest;
        if (numerator < 0) {
            num = -numerator;
        }
        if (num > den) {
            largest = num;
        } else {
            largest = den;
        }

        // find the largest number that divide the numerator and
        // denominator evenly

        int val = 0;
        for (int i = largest; i >= 2; i--) {
            if (numerator % i == 0 && denominator % i == 0) {
                val = i;
                break;
            }
        }

        // divide the largest common denominator out of numerator, denominator

        if (val != 0) {
            numerator /= val;
            denominator /= val;
        }

    }

}
