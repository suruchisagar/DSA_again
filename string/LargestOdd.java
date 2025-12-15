public class LargestOdd {
    
    public static void main(String[] args) {
        String s="52";
        System.out.println(Largest(s));
    }

    public static String Largest(String s){
        String res="";
        int n=s.length();
        int i=s.length()-1;
        while(i>=0){
            if((s.charAt(i)-'0')%2==1){
                break;
            }
            i--;
        }
        if (i < 0) {
            return "";
        }
        
        return s.substring(0, i + 1);
    }

}
