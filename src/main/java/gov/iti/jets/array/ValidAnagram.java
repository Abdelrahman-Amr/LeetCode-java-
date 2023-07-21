package gov.iti.jets.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] freq =new int[130];
        Arrays.fill(freq,0);

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
            freq[t.charAt(i)]--;
        }
        for (int j : freq) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }
}
