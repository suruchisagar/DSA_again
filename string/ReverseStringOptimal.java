public class ReverseStringOptimal {
    public static void main(String[] args) {
        String s=" the sky  is blue ";
        System.out.println(Reverse(s));
        
    }

    public static String Reverse(String s){
        String res="";
        int n=s.length();
        int i=s.length()-1;
        while(i>=0){
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
            // if (i < 0) break;
            int last=i;

            while(i>=0 && s.charAt(i)!=' '){
                i--;
            }
            int start=i+1;

            if(!res.isEmpty()){
                res= res+ " "+(s.substring(start,last+1));
            }else{
                res=res+(s.substring(start, last+1));
            }
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
        }
        return res;
    }
}
