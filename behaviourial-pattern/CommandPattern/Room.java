package CommandPattern;

public class Room {
    ICommand command;

    public void setCommand(ICommand command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
