package BridgePattern;

public interface MediaImplementor {
    void playAudio();
    
    void playVideo();
}

class WindowsMediaImplementor implements MediaImplementor {
    @Override
    public void playAudio() {
        System.out.println("Playing audio with Windows implementation");
    }
    
    @Override
    public void playVideo() {
        System.out.println("Playing video with Windows implementation");
    }
}

class MacOSMediaImplementor implements MediaImplementor {
    @Override
    public void playAudio() {
        System.out.println("Playing audio with macOS implementation");
    }
    
    @Override
    public void playVideo() {
        System.out.println("Playing video with macOS implementation");
    }
}


