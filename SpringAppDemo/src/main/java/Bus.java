import org.springframework.stereotype.Component;

@Component
public class Bus implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Bus is being driven");
    }
}
