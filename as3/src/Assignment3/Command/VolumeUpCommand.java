package Assignment3.Command;

public class VolumeUpCommand implements Command {
    private final Television television;

    public VolumeUpCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.volumeUp();
    }
}