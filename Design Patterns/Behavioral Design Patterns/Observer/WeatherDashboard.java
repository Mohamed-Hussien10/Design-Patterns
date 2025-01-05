public class WeatherDashboard implements Observer{

    @Override
    public void update(float temperature, float humidity) {
        System.out.println("WeatherDashboard - Temperature: " + temperature + "°C, Humidity: " + humidity + "%");
    }
    
}
