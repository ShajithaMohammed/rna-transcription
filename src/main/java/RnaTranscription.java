import java.util.Map;
import java.util.HashMap;

class RnaTranscription {

    private Map<Character, Character> conversionFactor = new HashMap<Character, Character>();

    public RnaTranscription() {
        conversionFactor.put('G', 'C');
        conversionFactor.put('C', 'G');
        conversionFactor.put('T', 'A');
        conversionFactor.put('A', 'U');
    }

    String transcribe(String dnaStrand) {

        String rnaStrand = new String();

        for (int i = 0; i < dnaStrand.length(); i++) {
            rnaStrand = rnaStrand + conversionFactor.get(dnaStrand.charAt(i));
        }

        return rnaStrand;

    }

}
