public class StackArrays {
    private int[] stack;
    private int capacity;
    private int top;

    public StackArrays(int size){
        capacity=size;
        stack= new int[capacity];
        top=-1;
    }

    public StackArrays(){
        this(1000);
    }


    //push operation
    public void push(int x){
        if(top==capacity-1){
            System.out.println("stack is already full");
        }

        stack[++top]=x;
    }

    //pop operation
    public int pop(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top--];
    }

    //top operation
    public int top(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        return stack[top];
    }

    public static void main(String[] args) {
        StackArrays stack= new StackArrays();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.top());
        System.out.println(stack.pop());

    }
}
