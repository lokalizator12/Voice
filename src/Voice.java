public class Voice {
    String word = "Голос";

    static void voiceG(String word) {
        System.out.println(word);
    }

    static void voice() {
        voiceG("Голос");
    }

    static void voice(int i) {
        for (int x = 0; x < i; ++x) {
            voice();
        }
    }

    static void voice(int i, String words) {
        for (int x = 0; x < i; ++x) {
            voiceG(words);
        }
    }
}
