import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new FileSystemXmlApplicationContext
                ("Spring.xml");
        Vehicle obj1 = (Vehicle)context.getBean("vehicle");
        Vehicle obj2=(Vehicle)context.getBean("bus");
        obj1.drive();
        obj2.drive();
    }
}
