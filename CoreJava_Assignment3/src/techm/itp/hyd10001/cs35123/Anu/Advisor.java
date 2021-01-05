package techm.itp.hyd10001.cs35123.Anu;

import java.util.Random;

public class Advisor {
    String[] message = new String[5];

    public Advisor() {
        message = new String[]{"Stay Strong", "Never give up", "You are brave", "Stay calm", "Be honest"};
    }

    public void getAdvice() {
     //   Random random=new Random();
        String msg = message[(int)(Math.random() * message.length)];
        System.out.println("Advice :" +msg);
    }
}
