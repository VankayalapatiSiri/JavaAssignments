import java.util.Random;

abstract class Compartment {
    abstract void notice();
}

class FirstClass extends Compartment {
    @Override
    void notice() {
        System.out.println("FirstClass Compartment");
    }
}

class General extends Compartment {
    @Override
    void notice() {
        System.out.println("General Compartment");
    }
}

class Ladies extends Compartment {
    @Override
    void notice() {
        System.out.println("Ladies Compartment");
    }
}

class Luggage extends Compartment {
    @Override
    void notice() {
        System.out.println("Luggage Compartment");
    }
}

public class Question2 {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        Random random = new Random();
        int randonNumber;
        for (int i = 0; i < 10; i++) {
            randonNumber = random.nextInt((4 - 1) + 1) + 1;
            if (randonNumber == 1)
                compartments[i] = new FirstClass();
            else if (randonNumber == 2)
                compartments[i] = new General();
            else if (randonNumber == 3)
                compartments[i] = new Ladies();
            else if (randonNumber == 4)
                compartments[i] = new Luggage();

            compartments[i].notice();
        }
    }
}
