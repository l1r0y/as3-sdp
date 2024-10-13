package Assignment3.Mediator;

public class Main {
    public static void main(String[] args) {
        HomeMediator mediator = new HomeMediatorImpl();

        Sensor temperatureSensor = new TemperatureSensor(22);
        Sensor humiditySensor = new HumiditySensor(45);
        Sensor lightSensor = new LightSensor(300);

        temperatureSensor.setMediator(mediator);
        humiditySensor.setMediator(mediator);
        lightSensor.setMediator(mediator);

        temperatureSensor.sendData();
        humiditySensor.sendData();
        lightSensor.sendData();

        ((HomeMediatorImpl) mediator).printReport();
    }
}