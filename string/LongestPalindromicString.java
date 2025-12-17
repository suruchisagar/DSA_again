public class LongestPalindromicString {


    public static void main(String[] args) {
        String s="babac";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
       int n=s.length();
       int start=0;
       int end=0;
       int max=0;
       for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            if(isPalindrome(s,i,j)==true){
                if((j-i+1)>max){
                    max=j-i+1;
                start=i;
                end=j;
                }
                
            }
        }
       }
       return s.substring(start, end+1);
    }

    public static boolean isPalindrome(String s, int i, int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
