import java.util.Random;

public class Linked_Queue {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Queue{
        public static Node head=null;
        public static Node tail=null;
public  Boolean isEmpty(){
    return( head==null & tail==null);
}
public static void Add(int data){
    Node New_node =new Node(data);
   if(tail==null){
    tail=head=New_node;
   }
   tail.next=New_node;
   tail=New_node;
}
public int Remove(){
    if(isEmpty()){
        System.out.println("Queue is Empty!");
        return -99;
    }
    int front=head.data;
    head=head.next;
    return front;

}
public int Front(){
    if(isEmpty()){
        System.out.println("Queue is Empty!");
        return -99;
    }
    return  head.data;
     
}
    }
    public static void main(String[] args) {
        Queue Q=new Queue();
       Random R=new Random();
       for(int i=0; i<10; i++){
        Q.Add(R.nextInt(100));
       }
       System.out.println("Complete List Of Queue is:");
       while(Q.isEmpty()!=true){
        System.out.println(Q.Front());
        Q.Remove();
       }
    }
}
