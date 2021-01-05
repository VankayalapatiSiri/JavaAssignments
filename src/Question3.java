import java.util.Random;

class Medicine {
    String name;
    String address;

    Medicine(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void displayLabel() {
        System.out.println("The name of the company is :" + name);
        System.out.println("The address of the company is :" + address);
    }
}

class Tablet extends Medicine {
    Tablet(String name, String address) {
        super(name, address);
    }

    @Override
    void displayLabel() {
        super.displayLabel();
        System.out.println("store in cold places only");
    }
}

class Syrup extends Medicine {
    Syrup(String name, String address) {
        super(name, address);
    }

    @Override
    void displayLabel() {
        super.displayLabel();
        System.out.println("Take under doctor's prescription");
    }
}

class Ointment extends Medicine {
    Ointment(String name, String address) {
        super(name, address);
    }

    @Override
    void displayLabel() {
        super.displayLabel();
        System.out.println("For external use only");
    }
}

public class Question3 {
    public static void main(String[] args) {
        Medicine[] medicines = new Medicine[10];
        Random random=new Random();
        for(int i=0;i<10;i++){
            int randomNumber=random.nextInt((3-1)+1)+1;
            if(randomNumber==1)
                medicines[i]=new Ointment("A","Bombay");
                System.out.println();
            if(randomNumber==2)
                medicines[i]=new Syrup("B","Kolkata");
                System.out.println();
            if(randomNumber==3)
                medicines[i]=new Tablet("C","Hyderabad");
                System.out.println();
            medicines[i].displayLabel();
        }
    }
}
