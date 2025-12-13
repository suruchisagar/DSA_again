
import java.util.*;

public class ReverseStringBrute {

    public static void main(String[] args) {
        String s="the sky  is blue ";
        System.out.println(Reverse(s));
        
    }

    static String Reverse(String s){
        
        List<String> words= new ArrayList();
        int n=s.length();
        int i=0;
        while(i<n){

            while(i<n && (s.charAt(i)==' ')){
                i++;
            }

            if(i<n){
                int start=i;
                while(i<n && s.charAt(i)!=' '){
                    i++;
                }
                words.add(s.substring(start,i));
            }
        }

        Collections.reverse(words);

        return String.join(" ",words);
        
    }
}