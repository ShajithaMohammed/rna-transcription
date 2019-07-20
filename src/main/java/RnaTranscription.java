import java.util.Map;
import java.util.HashMap;

class RnaTranscription {
    private static final Map<Character, Character> conversionFactor = new HashMap<Character, Character>() {
        {
            put('G', 'C');
            put('C', 'G');
            put('T', 'A');
            put('A', 'U');
        }
    };

    String transcribe(String dnaStrand) {
        String rnaStrand = "";
        for (int i = 0; i < dnaStrand.length(); i++) {
            rnaStrand = rnaStrand + conversionFactor.get(dnaStrand.charAt(i));
        }
        return rnaStrand;
    }

}
