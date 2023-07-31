package gov.iti.jets.array;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, Boolean> isVisited = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            List<String> list = new ArrayList<>();
            if( isVisited.get(strs[i])==null && isVisited.get(strs[i])){
                list.add(strs[i]);
                isVisited.put(strs[i],true);
                result.add(list);
                for(int j=i+1;j<strs.length;j++){
                    if( isVisited.get(strs[j])!=null && !isVisited.get(strs[j]) &&  isAnagram(strs[i], strs[j])  ){
                        isVisited.put(strs[j],true);
                        result.get(i).add(strs[j]);
                    }
                }
            }

        }
        return result;
    }

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        int[] freq = new int[130];
        Arrays.fill(freq, 0);

        for (int i = 0; i < s.length(); i++) {
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
