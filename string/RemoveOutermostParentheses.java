class RemoveOutermostParentheses{
    public static void main(String[] args) {
        String s="(()())(())";
        System.out.println(removeOuterParentheses(s));
    }
    static String removeOuterParentheses(String s) {
        String res="";
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                count++;
                if(count>1){
                    res+='(';
                }
            }
            if(s.charAt(i)==')'){
                count--;
                if(count>0){
                    res+=')';
                }
            }
        }
        return res;
    }
}