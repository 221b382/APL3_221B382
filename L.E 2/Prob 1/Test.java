public class Test {
    public static void main(String[] args) {
        Voice voice = new Voice();
        Animal[] animals = voice.prepareVoice();
        Voice.hear(animals);
    }
}
