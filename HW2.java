package class9HW;

public class HW2 {
    public static void main(String[] args) {

        /*Create an array of names and store all names of your group.
          Then print your name. (use two different ways to create an array). */

        String name1[]={"Daniel","Jason","Jessica","Hasmik","Mohammad","Nafisa"};

        System.out.println(name1[3]);


        System.out.println("********");

        String[] name=new String[6];
        name[0]="Daniel";
        name[1]="Jason";
        name[2]="Jessica";
        name[3]="Hasmik";
        name[4]="Mohammad";
        name[5]="Nafisa";

        System.out.println(name[3]);

    }
}








