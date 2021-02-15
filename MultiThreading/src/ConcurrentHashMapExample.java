import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("1","Siri");
        map.put("2","Kajal");
        map.put("3","Sameer");
        map.put("4","Ritik");
        map.forEach(1, (key, value) ->
                System.out.printf("key: %s; value: %s; thread: %s\n",
                        key, value, Thread.currentThread().getName()));

        String result = map.search(1, (key, value) -> {
            System.out.println(Thread.currentThread().getName());
            if ("1".equals(key)) {
                return value;
            }
            return null;
        });
        System.out.println("Result: " + result);

    }
}
