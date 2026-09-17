package greeter;

import java.util.HashMap;
import java.util.Map;

public final class GreetingRegistry {
    private GreetingRegistry() {
    }

    public static Map<String, Greeting> defaults() {
        Map<String, Greeting> greetings = new HashMap<>();
        greetings.put("formal", new FormalGreeting());
        greetings.put("casual", new CasualGreeting());
        greetings.put("intimate", new IntimateGreeting());
        return greetings;
    }
}
