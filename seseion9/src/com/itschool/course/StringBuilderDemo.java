package com.itschool.course;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("ionutz");
        sb.append("baur");
        sb.append("it-school");
        sb.append("11").append("ceva").append(5.9);
        System.out.println(sb);
    }
}
