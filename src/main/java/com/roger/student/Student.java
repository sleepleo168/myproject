package com.roger.student;

public class Student {
    String id;
    String name;
    int english;
    int math;
    static int pass = 60;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int highest(){
//        int max = ;
        /*if (english > math){
            max = english;
        } else {
            max = math;
        }*/
        return (english > math) ? english : math;
    }

    public void print(){
        int average = getAverage();
        System.out.print(name + "\t" + english + "\t" + math + "\t" + getAverage()
        +"\t" + ((getAverage() >= pass)? "PASS" : "FAILED"));
        char grading = 'F';
        switch (average/10){
            case 10:
            case 9:
                grading ='A';
                break;
            case 8:
                grading ='B';
                break;
            case 7:
                grading ='C';
                break;
            case 6:
                grading ='D';
                break;
            default:
                grading = 'F';

        }
        System.out.println("\t" + grading);
/*        if (average >= 90 && average <=100){
            grading = 'A';
        }else if(average >= 80 && average <90){
            grading = 'B';
        }else if(average >= 70 && average <80){
            grading = 'C';
        }else if(average >= 60 && average <70){
            grading = 'D';
        }else{
            grading = 'F';
        }*/

/*        if (getAverage() >= 60){
            System.out.println("\tPASS");
        } else {
            System.out.println("\tFAILED");
        }*/
    }
    public int getAverage(){
        return (english+math)/2;
    }
}
