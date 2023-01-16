package class9HW;

public class HW6 {
    public static void main(String[] args) {
        /* Create an array of countries. While retrieving all values from an array
        print capital for each country choose any five countries. */

        String country[] = {"USA", "France", "Canada", "Armenia", "Iraq"};

        for (int i = 0; i <= country.length; i++) {
            if (i == 0) {System.out.println("The capital of " + country[i] + " is Washington DC");
            } else if (i == 1) {
                System.out.println("The capital of " + country[i] + " is France");
            } else if (i == 2) {
                System.out.println("The capital of " + country[i] + " is Toronto");
            } else if (i == 3) {
                System.out.println("The capital of " + country[i] + " is Yerevan");
            } else if (i == 4) {
                System.out.println("The capital of " + country[i] + " is Baghdad");
            }
        }


        System.out.println("************");
        System.out.println();

        String countries[] = {"USA", "France", "Canada", "Armenia", "Iraq"};

        String[] capitals=new String[6];
        capitals[0]="DC";
        capitals[1]="Paris";
        capitals[2]="Toronto";
        capitals[3]="Yerevan";
        capitals[4]="Baghdad";

        for(int i =0; i < countries.length; i++){
            for(int j = 0; j < capitals.length; j++){
                System.out.println("The capital of " + countries[i] + " is "+capitals[i]);
                i++;
                j++;
            }

        }



    }
}