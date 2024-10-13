package Assignment3.Mediator;

import java.util.ArrayList;
import java.util.List;

public class HomeMediatorImpl implements HomeMediator {
    private List<String> reports = new ArrayList<>();

    @Override
    public void notifySensor(Sensor sensor) {
        if (sensor instanceof TemperatureSensor) {
            reports.add("Temperature Sensor Data: " + ((TemperatureSensor) sensor).getTemperature());
        } else if (sensor instanceof HumiditySensor) {
            reports.add("Humidity Sensor Data: " + ((HumiditySensor) sensor).getHumidity());
        } else if (sensor instanceof LightSensor) {
            reports.add("Light Sensor Data: " + ((LightSensor) sensor).getLightLevel());
        }
    }

    @Override
    public void printReport() {
        System.out.println("Sensor Report:");
        for (String report : reports) {
            System.out.println(report);
        }
    }
}