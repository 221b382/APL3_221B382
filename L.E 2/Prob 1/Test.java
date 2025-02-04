public class Test {
    public static void main(String[] args) {
        Voice voice = new Voice();
        Voice.Animal[] animals = voice.prepareVoice();
        voice.hear(animals);
    }
}