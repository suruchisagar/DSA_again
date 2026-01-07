import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class ReverseList {

    public static void main(String[] args) {
         // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

       
    }
    public static ListNode reverseList(ListNode head) {
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
