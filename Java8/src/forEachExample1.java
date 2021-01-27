import java.util.ArrayList;

public class forEachExample1 {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        l.add("Siri");
        l.add("Manali");
        l.add("Bala");
        l.add("Ritik");
        l.add("Kajal");
        l.add("Shristi");
        l.forEach((s)-> System.out.println(s));

    }
}
