package greeter;

import java.util.Map;

public class Greeter {
    private final Map<String, Greeting> greetings;
    private final Greeting defaultGreeting;
    private String formality;

    public Greeter() {
        this(GreetingRegistry.defaults(), new DefaultGreeting());
    }

    public Greeter(Map<String, Greeting> greetings, Greeting defaultGreeting) {
        this.greetings = greetings;
        this.defaultGreeting = defaultGreeting;
    }

    public String greet() {
        return this.greetings.getOrDefault(this.formality, this.defaultGreeting).greet();
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}
