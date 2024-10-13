package Assignment3.Command;

public class Main {
    public static void main(String[] args) {
        Television television = new Television();
        RemoteControl remote = new RemoteControl(6);

        remote.setCommand(0, new TurnOnCommand(television));
        remote.setCommand(1, new TurnOffCommand(television));
        remote.setCommand(2, new VolumeUpCommand(television));
        remote.setCommand(3, new VolumeDownCommand(television));
        remote.setCommand(4, new NextChannelCommand(television));
        remote.setCommand(5, new PreviousChannelCommand(television));

        remote.pressButton(0);
        remote.pressButton(2);
        remote.pressButton(4);
        remote.pressButton(3);
        remote.pressButton(1);
    }
}