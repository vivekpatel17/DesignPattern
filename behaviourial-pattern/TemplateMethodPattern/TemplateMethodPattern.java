package TemplateMethodPattern;

public class TemplateMethodPattern {
    public static void main(String args[]) {
        AbstractBaseGameLoader game1 = new Game1();
        game1.load();

        AbstractBaseGameLoader game2 = new Game2();
        game2.load();

        AbstractBaseGameLoader game3 = new Game3();
        game3.load();
    }
}
