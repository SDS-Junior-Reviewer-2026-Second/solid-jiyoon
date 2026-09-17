package weather;

public class WeatherTracker {
    String currentConditions;
    Notifier phoneNotifier;
    Notifier emailNotifier;

    public WeatherTracker() {
        this(new Phone(), new Email());
    }

    public WeatherTracker(Notifier phoneNotifier, Notifier emailNotifier) {
        this.phoneNotifier = phoneNotifier;
        this.emailNotifier = emailNotifier;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        if (weatherDescription == "rainy") {
            String alert = phoneNotifier.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
        if (weatherDescription == "sunny") {
            String alert = emailNotifier.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }
}
