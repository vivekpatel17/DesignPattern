package BridgePattern;

public class BridgePattern {
    
    public static void main(String[] args) {
        // MediaImplementor windowsImpl = new WindowsMediaImplementor();        
        // windowsImpl.playAudio();
        // windowsImpl.playVideo();
        
        // MediaImplementor macImpl = new MacOSMediaImplementor();
        // macImpl.playAudio();
        // macImpl.playVideo();
        
        // Using abstraction with different implementations

        MediaImplementor windowsImpl = new WindowsMediaImplementor();
        MediaImplementor macImpl = new MacOSMediaImplementor();

        MediaPlayerAbstraction audioPlayer = new AudioPlayer(windowsImpl);
        MediaPlayerAbstraction videoPlayer = new VideoPlayer(macImpl);
        
        audioPlayer.play();
        videoPlayer.play();
    }
}
