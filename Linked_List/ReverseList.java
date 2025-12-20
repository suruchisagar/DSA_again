import java.util.Stack;

public class ReverseList {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> stack= new Stack<>();
        ListNode temp= head;
        while(temp!=null){
            stack.push(temp.val);
            temp=temp.next;
        }
        temp=head;
        while(stack.isEmpty()==false){
            temp.val= stack.pop();
            temp=temp.next;
        }
        return head;
    }
}
