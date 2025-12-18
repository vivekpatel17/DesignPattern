package BridgePattern;

public abstract class MediaPlayerAbstraction {
    protected MediaImplementor implementor;
    
    public MediaPlayerAbstraction(MediaImplementor implementor) {
        this.implementor = implementor;
    }
    
    public abstract void play();
}

class AudioPlayer extends MediaPlayerAbstraction {
    
    public AudioPlayer(MediaImplementor implementor) {
        super(implementor);
    }
    
    @Override
    public void play() {
        implementor.playAudio();
    }
}

class VideoPlayer extends MediaPlayerAbstraction {
    
    public VideoPlayer(MediaImplementor implementor) {
        super(implementor);
    }
    
    @Override
    public void play() {
        implementor.playVideo();
    }
}
