package Assignment3.Mediator;

public class TemperatureSensor implements Sensor {
    private HomeMediator mediator;
    private int temperature;

    public TemperatureSensor(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void sendData() {
        mediator.notifySensor(this);
    }

    @Override
    public void setMediator(HomeMediator mediator) {
        this.mediator = mediator;
    }

    public int getTemperature() {
        return temperature;
    }
}