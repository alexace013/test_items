package hw1.string;

/**
 * Created by alexander on 16.12.15.
 */
public class MyStringMain {

    public static void main(String[] args) {

        MyString myString = new MyString(" java version \"1.8.0_66\" ");
        myString.print();
        MyString myStringSub1 = myString.substring(13);
        myStringSub1.print();
        MyString myStringSub2 = myString.substring(13, 18);
        myStringSub2.print();
        MyString myStringTrim = myString.trim();
        myStringTrim.print();
        System.out.println("myString equals myStringSub1: " + myString.equals(myStringSub1));
        System.out.println("myString hashCode: " + myString.hashCode());
        MyString str = new MyString("text + TEXT");
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        MyString str1 = new MyString("Ja");
        MyString str2 = new MyString("va");
        System.out.println(str1.concatenation(str2));

    }

}
