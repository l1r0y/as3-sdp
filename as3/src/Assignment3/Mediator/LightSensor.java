package Assignment3.Mediator;

public class LightSensor implements Sensor {
    private HomeMediator mediator;
    private int lightLevel;

    public LightSensor(int lightLevel) {
        this.lightLevel = lightLevel;
    }

    @Override
    public void sendData() {
        mediator.notifySensor(this);
    }

    @Override
    public void setMediator(HomeMediator mediator) {
        this.mediator = mediator;
    }

    public int getLightLevel() {
        return lightLevel;
    }
}