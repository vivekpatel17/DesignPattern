package CommandPattern;

public class SwitchLightOffCommand implements ICommand {
    private Light light;

    public SwitchLightOffCommand(Light light) {
        this.light = light;
    }
    
    public void execute() {
        light.switchLightOff();
    }
}
