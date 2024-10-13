package Assignment3.Command;

public class NextChannelCommand implements Command {
    private final Television television;

    public NextChannelCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.nextChannel();
    }
}