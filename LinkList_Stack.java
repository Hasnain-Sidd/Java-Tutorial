import java.util.Random;

public class LinkList_Stack{
   static class Node{
        int data; 
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }
    static class Stacks{
         public static  Node head;
        public static  Boolean isEmpty(){
            return (head==null);
        }
        public void Push(int data){
            Node New_Node=new Node(data);
            if(head==null){
              head=New_Node;
              return;
            }
            New_Node.next=head;
            head=New_Node;
        }
        public int Pop(){
            int top=head.data;
            head=head.next;
            return top;
        }
        public int peek(){
            int top=head.data;
            return top;
        }
      

    }
public static void main(String[] args) {
    Stacks S=new Stacks();
    Random R=new Random();
    for(int i=10; i<=50; i++){
        S.Push(R.nextInt(1000));
     
    }
    System.out.print("Elements in Stacks Are:"+"{");
    while(S.isEmpty()!=true){
        System.out.print(S.peek()+",");
        S.Pop();
    }
    System.out.print("}");
   
}
}