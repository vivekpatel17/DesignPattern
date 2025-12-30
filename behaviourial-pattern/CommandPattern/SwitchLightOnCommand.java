package CommandPattern;

public class SwitchLightOnCommand implements ICommand {
    private Light light;

    public SwitchLightOnCommand(Light light) {
        this.light = light;
    }
    
    public void execute() {
        light.switchLightOn();
    }
}
