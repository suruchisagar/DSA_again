import java.util.Arrays;

public class LongestCommonPrefix{
    public static void main(String[] args) {
        String[] arr={"flower", "fluid", "fleww"};
        System.out.println(longestCommonPrefix(arr));
        
    }
    public static String longestCommonPrefix(String strs[]) {
        // code here
        Arrays.sort(strs);
        String s1=strs[0];
        String s2= strs[strs.length-1];

        String ans="";
        int n1=s1.length();
        int n2=s2.length();

        int n=Math.min(n1,n2);
        int i=0;
        while (i < n && s1.charAt(i) == s2.charAt(i)) {
            i++;
        }
        ans=s1.substring(0,i);
        return ans;
    }
}