package Assignment3.Command;

public class VolumeDownCommand implements Command {
    private final Television television;

    public VolumeDownCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.volumeDown();
    }
}