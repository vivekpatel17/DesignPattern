package TemplateMethodPattern;

public class Game2 extends AbstractBaseGameLoader {
    @Override
    byte[] loadLocalData() {
        System.out.println("Loadind local data: Game2");
        byte[] data = new byte[100];
        return data;
    }

    @Override
    void createObjects(byte[] data) {
        System.out.println("Creating Objects: Game2");
    }

    @Override
    void downloadAdditionalFiles() {
        System.out.println("Downloading additional files: Game2");
    }

    @Override
    void initlizeProfile() {
        System.out.println("Initlizing profiles: Game2");
    }
}
