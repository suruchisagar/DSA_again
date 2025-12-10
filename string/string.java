import java.util.*;

public class string{
    public static void main(String[] args) {
        char[] arr={'s','a','g','a','r'};
        for(char ele: arr){
            System.out.print(ele+" ");
            
        }
        System.out.println();

        String s="My name is sagar";
        System.out.println(s);

        Scanner sc= new Scanner(System.in);
        String t= sc.nextLine();
        System.out.println(t);

        String v=sc.next();
        System.out.println(v);


        //count no of vowels in a given string
        String a="abcba";
        int count=0;
        for(int i=0; i<a.length();i++){
            char ch=a.charAt(i);
            if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println(count);

        //check palindrome
        System.out.println(palindrome(a));
    }

    //palindrome string
    
    static boolean palindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}