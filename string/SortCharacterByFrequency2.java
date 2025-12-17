import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharacterByFrequency2 {

    public static void main(String[] args) {
        String s="tree";
        System.out.println(frequencySort(s));
          
    }
    public static String frequencySort(String s) {
        // code here
        StringBuilder ans= new StringBuilder();
        Map<Character, Integer> hm= new HashMap<>();
        
        for(char ch: s.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch,0) +1);
        }

        List<Character> list= new ArrayList<>(hm.keySet());
        list.sort((a, b) -> {
                if (hm.get(a) != hm.get(b)) {
                    return hm.get(a) - hm.get(b);   // frequency ascending
                }
                return a - b;                       // lexicographical ascending
            });

        for(char ch:list){
            for(int i=0; i<hm.get(ch); i++){
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}; 

