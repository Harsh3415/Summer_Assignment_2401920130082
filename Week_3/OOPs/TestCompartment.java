import java.util.Random;

public class TestCompartment {

    public static void main(String[] args) {

        Compartment[] compartments = new Compartment[10];

        Random random = new Random();

        for(int i=0;i<10;i++) {

            int randomNumber = random.nextInt(4) + 1;

            if(randomNumber == 1) {
                compartments[i] = new FirstClass();
            }
            else if(randomNumber == 2) {
                compartments[i] = new Ladies();
            }
            else if(randomNumber == 3) {
                compartments[i] = new General();
            }
            else {
                compartments[i] = new Luggage();
            }
        }

        System.out.println("Railway Compartments:");

        for(int i=0;i<10;i++) {
            System.out.println("Compartment " + (i + 1) + ": "
                    + compartments[i].notice());
        }
    }
}