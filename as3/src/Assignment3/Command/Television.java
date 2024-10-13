package Assignment3.Command;

public class Television {
    public void turnOn() {
        System.out.println("Телевизор включён.");
    }

    public void turnOff() {
        System.out.println("Телевизор выключен.");
    }

    public void volumeUp() {
        System.out.println("Увеличение громкости.");
    }

    public void volumeDown() {
        System.out.println("Уменьшение громкости.");
    }

    public void nextChannel() {
        System.out.println("Смена канала на следующий.");
    }

    public void previousChannel() {
        System.out.println("Смена канала на предыдущий.");
    }
}