package techm.itp.hyd10001.cs35123.Anu;

public class Greeter {
    String name;
    public Greeter(String aName){
        name=aName;
        sayHello();
    }
    void sayHello(){
        System.out.println("Hello "+ name+"!");
    }
    public void sayGoodBye(){
        System.out.println("Good bye... "+name);
    }

}
