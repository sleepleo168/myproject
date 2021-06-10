package com.roger;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World");
        String s = "abcde";
        System.out.println(s.charAt(3));
        System.out.println(s.substring(1,4));
        Person p = new Person("Roger",66.5f,1.7f);
        p.hello();
        System.out.println(p.bmi());
        int score = 88;
        System.out.println(score > 80 && score < 90);
        char c = 'A';
        System.out.println(c > 90);
/*
        int age = 19;
        Integer age2 = age;
        char c = '我';
        byte b = 120;
        float weight = 89.5f;
        float height = 1.76f;
        boolean adult = true;
        boolean enroll = false;
        String name = "Roger";
*/

    }
}
