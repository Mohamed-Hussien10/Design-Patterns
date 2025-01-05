public class MobileApp implements Observer {

    @Override
    public void update(float temperature, float humidity) {
        System.out.println("MobileApp - Temperature: " + temperature + "°C, Humidity: " + humidity + "%");
    }
    
}
