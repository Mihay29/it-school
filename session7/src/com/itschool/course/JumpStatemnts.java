package com.itschool.course;

public class JumpStatemnts {
    private static final int LUCKY_NUMBER=3;
    public static void main(String[] args) {
        //breackStatement();
        //continueStatement();
        list();

    }
    private static void breackStatement(){
        int[] aray = {1,2,3,4,4};
        for ( int elemnet : aray) {
            System.out.println("At start elemnt is " + elemnet);
            if (elemnet == LUCKY_NUMBER) {
                System.out.println("Found my lucky number! I don't care about the rest");
                break;
            }
            System.out.println("At end element is: "+ elemnet);
        }
        System.out.println("=======program end======");

    }
    private static void continueStatement(){
        int[] aray = {1,2,3,4,4};
        for ( int elemnet : aray) {
            System.out.println("At start elemnt is " + elemnet);
            if (elemnet == LUCKY_NUMBER) {
                System.out.println("Found my lucky number! I don't care about the rest");
                continue;
            }
            System.out.println("At end element is: "+ elemnet);
        }
        System.out.println("=======program end======");

    }
    private static void list(){
        int [][] list = {{1,13,5},{1,2,5},{2,7,2}};
        int searchValue = 2;
        int positionX = 0;
        int positionY = 0;
        PARENT_LOOP:
        for (int i = 0 ; i < list.length; i++) {
            for ( int j = 0; j < list[i].length; j++ );{
                int j = 0;
                if(list[i][j]== searchValue){
                    positionX = i;
                    positionY = j;
                    break PARENT_LOOP;
                }
            }
        }
        if (positionX == 0 || positionY ==0) {
            System.out.println("Value" + searchValue + "not found");
        }else {
            System.out.println("Value" + searchValue + "found at:" + "(" + positionX + "," + positionY +")");


}}}
