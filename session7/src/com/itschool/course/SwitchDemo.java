package com.itschool.course;

public class SwitchDemo {
    public static void main(String[] args) {
        int var = 1;
        //classicSwitch(var);
        enhachedSwitch(var);
    }

    private static void classicSwitch(int variable) {
        switch (variable) {
            case 1:
                System.out.println("value is 1");
                break;
            case 2:
                System.out.println("value is 2");
                break;
            case 5:
                System.out.println("value is 5");
                break;
            default:
                System.out.println("valuea unknow");
        }
    }

    private static void enhachedSwitch (int variable) {
        switch ( variable) {
            case 1 -> System.out.println("value is 1");
            case 2 -> System.out.println("value is 2");
            case 5 -> System.out.println("value is 5");
                default -> System.out.println("value unknow");

     }
    }
}
