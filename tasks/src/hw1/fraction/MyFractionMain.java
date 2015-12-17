package hw1.fraction;

public class MyFractionMain {

    public static void main(String[] args) {

        MyFraction fraction1 = new MyFraction(1, 3);
        MyFraction fraction2 = new MyFraction(2, 3);

        MyFraction addFrac = fraction1.add(fraction2);
        System.out.println(addFrac.toString());
        MyFraction subFrac = fraction1.sub(fraction2);
        System.out.println(subFrac.toString());
//        fraction1.setNumerator(5);
//        fraction1.setDenominator(17);
//        fraction2.setNumerator(3);
//        fraction2.setDenominator(44);
        MyFraction mulFrac = fraction1.mul(fraction2);
        System.out.println(mulFrac.toString());
        MyFraction divFrac = fraction1.div(fraction2);
        System.out.println(divFrac.toString());

//        MyFraction f1 = new MyFraction(1, 4);
//        MyFraction f2 = new MyFraction(2, 5);
//
//        MyFraction addFrac1 = f1.add(f2);
//        System.out.println(addFrac1.asString());
//
//        MyFraction subFrac1 = f1.sub(f2);
//        System.out.println(subFrac1.asString());
//
//        MyFraction mulFrac1 = f1.mul(f2);
//        System.out.println(mulFrac1.asString());
//
//        MyFraction divFrac1 = f1.div(f2);
//        System.out.println(divFrac1.asString());


    }

}
