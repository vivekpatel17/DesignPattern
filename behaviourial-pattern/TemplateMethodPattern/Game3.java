package TemplateMethodPattern;

public class Game3 extends AbstractBaseGameLoader {
    @Override
    byte[] loadLocalData() {
        System.out.println("Loadind local data: Game3");
        byte[] data = new byte[100];
        return data;
    }

    @Override
    void createObjects(byte[] data) {
        System.out.println("Creating Objects: Game3");
    }

    @Override
    void downloadAdditionalFiles() {
        System.out.println("Downloading additional files: Game3");
    }

    @Override
    void initlizeProfile() {
        System.out.println("Initlizing profiles: Game3");
    }

    @Override
    protected void clearTemporaryFiles() {
        System.out.println("Cleaning Temporary Files Base Class => Game3");
    }
}
