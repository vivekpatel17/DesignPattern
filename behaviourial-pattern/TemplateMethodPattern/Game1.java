package TemplateMethodPattern;

public class Game1 extends AbstractBaseGameLoader {
    @Override
    byte[] loadLocalData() {
        System.out.println("Loadind local data: Game1");
        byte[] data = new byte[100];
        return data;
    }

    @Override
    void createObjects(byte[] data) {
        System.out.println("Creating Objects: Game1");
    }

    @Override
    void downloadAdditionalFiles() {
        System.out.println("Downloading additional files: Game1");
    }

    @Override
    void initlizeProfile() {
        System.out.println("Initlizing profiles: Game1");
    }
}
