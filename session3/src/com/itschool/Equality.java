package com.itschool;

public class Equality {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;

        boolean isEqual = a == b;
        System.out.println(isEqual);

        String x = "ionutz";
        String y = "ionutz";

        System.out.println(x == y);

        String aName = new String("ionutz");
        String anotherName = new String("ionutz");
        System.out.println("Printing String Hashes");
        System.out.println( aName.hashCode());
        System.out.println(anotherName.hashCode());
        System.out.println(aName.equals(anotherName));
        System.out.println(y.equals(y));
    }

    static void comparePerson () {
        


    }
}
