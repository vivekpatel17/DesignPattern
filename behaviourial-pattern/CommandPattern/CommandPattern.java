package CommandPattern;

public class CommandPattern {
    public static void main(String[] args) {
        Room livingRoom = new Room();

        ICommand switchOnLight = new SwitchLightOnCommand(new Light());
        ICommand switchOffLight = new SwitchLightOffCommand(new Light());

        livingRoom.setCommand(switchOnLight);
        livingRoom.executeCommand();

        livingRoom.setCommand(switchOffLight);
        livingRoom.executeCommand();
    }
}
