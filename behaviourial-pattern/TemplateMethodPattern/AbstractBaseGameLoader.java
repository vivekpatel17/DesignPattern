package TemplateMethodPattern;

public abstract class AbstractBaseGameLoader {
    public void load() {
        byte[] data = loadLocalData();
        createObjects(data);
        downloadAdditionalFiles();
        initlizeProfile();
        clearTemporaryFiles();

        System.out.println("\n");
    }


    abstract byte[] loadLocalData();
    abstract void createObjects(byte[] data);
    abstract void downloadAdditionalFiles();
    abstract void initlizeProfile();
    
    protected void clearTemporaryFiles() {
        System.out.println("Cleaning Temporary Files Base Class");
    }
}
