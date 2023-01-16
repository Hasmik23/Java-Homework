package class9HW;

public class HW1 {
    public static void main(String[] args) {

        /*Create an array of chars and story grades in it: A B C D E F.
          Then print a grade B. (use two different ways to create an array). */

            char grade1[]={'A','B','C','D','E','F'};
            System.out.println("Grade "+grade1[1]);



            System.out.println("**********");
            char grade[]=new char[6];
            grade[0]='A';
            grade[1]='B';
            grade[2]='C';
            grade[3]='D';
            grade[4]='E';
            grade[5]='f';

            System.out.println("Grade "+grade[1]);


        }

    }
