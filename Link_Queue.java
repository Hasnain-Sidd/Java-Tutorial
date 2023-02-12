import java.util.Scanner;

public class Link_Queue <L>{
    static  int size=0;
    static class Node<T>{
       
    T data;
    Node<T> next;
    Node(T data){
        this.data=data;
        this.next=null;
       
    }
    }
    static class Queue<M>{
       
        static Node head=null;
         static Node tail=null;
         public Boolean isEmpty(){
           return head==null && tail==null; 
         }
         public void Enqueue(M data){
            Node<M> New_Node=new Node<M>(data);
            if(tail==null){
                head=tail=New_Node;
            }
            tail.next=New_Node;
            tail=New_Node;
            size++;
         }
         
         public M Dequeue(){
            if(isEmpty()){
                System.out.println("Queue is Empty:");
                
            }
            M front =(M) head.data;
            head=head.next;
            size--;
            return front;

         }
         public void display(){
            if(isEmpty()){
                System.out.println("Queue is Empty:");
                
            }
            Node<M> Current=head;
            while(Current!=null){
                System.out.println(Current.data);
                Current=Current.next;
                }
            }
            // Finfind Mid Element in the List
            public   void midElement(Queue Q1){
                Node<M> Current=head;
                int element=Q1.getSize()/2;
                for(int i=1; i<=element; i++){
                    if(i==element){
                       System.out.println(Current.data); 
                       
                    } 
                    Current=Current.next;
            } 
                
            }
   // Take integer as String
         public String toString(){
            String Str=head.data.toString();
            return Str;
         }
         public int getSize(){
            return size;
         }
         // Search Method in  LinkQueue
         public void Search(M target){
           
                if(isEmpty()){
                    System.out.println("Queue is Empty");

                }
                else{
                    Node Temp=head;
                    int count=0;
                    while(Temp!=null){
                        if(Temp.data.equals(target)){
                          count++;
                           
                        }
                        Temp=Temp.next;
                    }
                    if(count>0){
                        System.out.println("Element is Found!");
                    }
                   else{
                        System.out.println("Element is Not Found!");
                    }
                }
         }
         
        
         
    }
    public static void main(String[] args) {
        Queue<String> Q1=new Queue<>();
        Q1.Enqueue("Babar Azam");
        Q1.Enqueue("Virat Kohli ");
        Q1.Enqueue("Steve Smith");
        Q1.Enqueue("Joe Root");
        Q1.Enqueue("Rohit Sharma");
        Q1.Enqueue("Quinton De Kock");
       System.out.println("This is Complete list of Top 6 Batters in The World:");
     Q1.display();
     System.out.print("Mid Element of The List:");
   Q1.midElement(Q1);
  Scanner Sc=new Scanner(System.in);
  System.out.print("Eneter The Batsman Name You want to  Search:");
  String t=Sc.nextLine();
  Q1.Search(t);
      Queue<Integer> Q2=new Queue<>();
      Q2.Enqueue(56);
      Q2.Enqueue(18);
      Q2.Enqueue(49);
      Q2.Enqueue(66);
      Q2.Enqueue(45);
      Q2.Enqueue(12);
      System.out.println("Shirt Numbers Of The Above Mentioned Cricketers:");
      while(Q2.isEmpty()!=true){
        System.out.println(Q2.toString());
        Q2.Dequeue();


      }

      
    }
}
