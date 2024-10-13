package Assignment3.Command;

public class RemoteControl {
    private Command[] commands;

    public RemoteControl(int numberOfButtons) {
        commands = new Command[numberOfButtons];
    }

    public void setCommand(int slot, Command command) {
        commands[slot] = command;
    }

    public void pressButton(int slot) {
        if (commands[slot] != null) {
            commands[slot].execute();
        } else {
            System.out.println("Нет команды на этой кнопке.");
        }
    }
}