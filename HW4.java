package class9HW;

public class HW4 {
    public static void main(String[] args) {

        /*Create an array that can store names of cars and store 6 elements into it.
        Print all values from the array.*/

       /* String car[]={"BMW","Toyota","VW","Ferrari","Maserati","Mercedes"};

        for (int i = 0; i <= car.length; i++){
            System.out.println(car[i]);
        }


        System.out.println("************");*/

        String[] cars=new String[6];
        cars[0]="BMW";
        cars[1]="Toyota";
        cars[2]="VW";
        cars[3]="Ferrari";
        cars[4]="Maserati";
        cars[5]="Mercedes";

        for (int i = 0; i <= cars.length; i++){
            System.out.println(cars[i]);
        }

    }
}



