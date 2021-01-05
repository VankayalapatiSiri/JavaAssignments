class Car{
    int speed,noOfGear;
    void drive(){
        noOfGear=2;
        speed=120;

    }
    void display(){
        System.out.println("The speed of the car is :"+speed);
        System.out.println("The number of Gears in the car is :"+noOfGear);
    }
}
class SportCar extends Car{
    int initialSpeed,gearStatus;
    public void AirBallonType(){
        gearStatus=3;
        initialSpeed=150;

    }

    @Override
    void display() {
        super.display();
        System.out.println("The initial speed of Sport Car is :"+initialSpeed);
        System.out.println("The gear status of Sport Car is :"+gearStatus);
    }
}
public class Question5 {
    public static void main(String[] args) {
        SportCar sc=new SportCar();
        sc.drive();
        sc.AirBallonType();
        sc.display();
    }
}
