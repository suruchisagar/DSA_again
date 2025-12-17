public class MaximumNestingDepthOfParentheses {

    public static void main(String[] args) {
        String s="(1+(2*3)+((8)/4))+1";
        System.out.println(maxDepth(s));
    }
    public static int maxDepth(String s) {
       int ans=0;
       int n=s.length();
       int count=0;
       for(int i=0; i<n; i++){
        if(s.charAt(i)=='('){
            count++;
            ans= Math.max(ans, count);

        }
        if(s.charAt(i)==')'){
            count--;
        }
       } 
       return ans;
    }
}

