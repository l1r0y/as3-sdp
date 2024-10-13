package Assignment3.Mediator;

public class HumiditySensor implements Sensor {
    private HomeMediator mediator;
    private int humidity;

    public HumiditySensor(int humidity) {
        this.humidity = humidity;
    }

    @Override
    public void sendData() {
        mediator.notifySensor(this);
    }

    @Override
    public void setMediator(HomeMediator mediator) {
        this.mediator = mediator;
    }

    public int getHumidity() {
        return humidity;
    }
}