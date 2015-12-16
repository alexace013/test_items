package hw1.string;

/**
 * Написать класс строка
 - создание на основе массива символов
 - вывод на экран
 - конкатенация
 - понижение регистра
 - повышение регистра
 - поиск подстроки
 - выделение подстроки
 - удаление пробелов
 - метод для сравнения с другой строкой
 */
public class MyString {

    private char[] charArray;

    public MyString(){}

    public MyString(char[] charArray) {
        this.charArray = charArray;
    }

    public MyString(String str) {
        this.charArray = str.toCharArray();
    }

    @Override
    public String toString() {
        return new String(charArray);
    }

    // print MyString to console
    public void print() {
        System.out.println(toString());
    }

    // the concatenation MyString
    public MyString concatenation(MyString newString) {

        char[] chars = this.charArray;
        char[] newChars = newString.charArray;
        char[] result = new char[chars.length + newChars.length];
        System.arraycopy(chars, 0, result, 0, chars.length);
        System.arraycopy(newChars, 0, result, chars.length, newChars.length);
        return new MyString(result);

    }

    // upper case MyString
    public MyString toUpperCase() {
        String str = new String(charArray);
        return new MyString(str.toUpperCase());

    }

    // lower case MyString
    public MyString toLowerCase() {
        String str = new String(charArray);
        return new MyString(str.toLowerCase());
    }

    // substring MyString from index to end MyString
    public MyString substring(int firstIndex) {
        StringBuilder builder = new StringBuilder();
        for (int i = firstIndex; i < charArray.length; i++) {
            builder.append(charArray[i]);
        }
        return new MyString(builder.toString());
    }

    // substring MyString from first index to last index
    public MyString substring(int firstIndex, int lastIndex) {
        StringBuilder builder = new StringBuilder();
        for (int i = firstIndex; i < lastIndex; i++) {
            builder.append(charArray[i]);
        }
        return new MyString(builder.toString());
    }

    // trim MyString
    public MyString trim() {
        String str = new String(charArray);
        return new MyString(str.trim());
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        MyString myString = (MyString)obj;
        if (myString.charArray.equals(this.charArray)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash * 54 + charArray.hashCode();
        return hash;
    }


}
