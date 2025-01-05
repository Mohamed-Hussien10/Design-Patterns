public class Main {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        // Create observers
        MobileApp mobileApp = new MobileApp();
        WeatherDashboard weatherDashboard = new WeatherDashboard();

        // Register observers
        weatherStation.registerObserver(mobileApp);
        weatherStation.registerObserver(weatherDashboard);

        // Set weather data, which triggers notifications to all observers
        weatherStation.setWeatherData(25.5f, 65.0f);
        weatherStation.setWeatherData(28.0f, 70.0f); // Update the data, observers are notified again
    }
}