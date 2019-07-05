import java.util.Map;
import java.util.HashMap;

class RnaTranscription {

    String transcribe(String dnaStrand) {
        Map<Character,Character> conversionFactor=new HashMap<Character,Character>();
        conversionFactor.put('G','C');
        conversionFactor.put('C','G');
        conversionFactor.put('T','A');
        conversionFactor.put('A','U');
        String rnaStrand="";
        for(int i=0;i<dnaStrand.length();i++){
           rnaStrand = rnaStrand +""+ conversionFactor.get(dnaStrand.charAt(i));
        }
     return rnaStrand;
    }

}