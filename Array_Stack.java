import java.util.Random;
interface Stack<E>{
public Boolean isEmpty();
public void Push(E element);
public E Pop();
public E Peek();
public int size();
}
public class Array_Stack <E> implements Stack<E>{
 private    E[] elements;
 private int size;
 public Boolean isEmpty(){
    return (size==0);
 }
 public Array_Stack(int capacity){
     elements=(E[])new Object[capacity];
 }
 public void  Push(E element){
   if(size==elements.length){
    System.out.println("Satck is Full");
   }
   else{
    elements[size++]=element;

   }
}
   public E Pop() {
    if(size==0){
        System.out.println("Stack is Empty!");
    }
    E top=elements[size-1];
    elements[--size]=null;
    return top;
   }
   public E Peek(){
    if(size==0){
        System.out.println("Stack is Empty!");
    }
    E top=elements[size-1];
    return top;
   }
   public int size(){
    return size;
   }
   // Returning Elelements of The Stacks As The String
   public String toString(){
    String str=elements[size-1].toString();
    return str;
   }
   // Push The Element at the Bottom of The Stack
   public void pushATBottom(E element,Array_Stack<E> S){
    if(S.isEmpty()){
        S.Push(element);
        return;
    }
    E top=(E) S.Pop();
    S.pushATBottom(element, S);
  S.Push(top);
}
// Comparing Two Stacks 
public static Boolean isEqual(Array_Stack<Integer> S1, Array_Stack<Integer> S2){
 if(S1.size()!=S2.size()){
    return false;
 }
 return true;
}
// Finding Mid Element in The Stack Method
public E midElement(){
   E mid=elements[size/2];
   return mid;
} 
// Reverse stack Method
public  void Reverse(Array_Stack<E> S){
    if(S.isEmpty()){
        return;
    }

   E  start =(E) S.Pop();
    
    Reverse(S);
    S.pushATBottom(start, S);
    
}
  
public static void main(String[] args) {
    Array_Stack<Integer>  AS=new Array_Stack<>(10);
    Array_Stack<Integer>  As=new Array_Stack<>(10);
    Array_Stack<String> ASS=new Array_Stack<>(5);
    System.out.println(args.length);
   
   Random R=new Random();
   // Question#01
   System.out.println(isEqual(AS,As)); 
    for(int i=1; i<10; i++){
       AS.Push(R.nextInt(100));
    }
   
    
    AS.pushATBottom(19, AS);
    System.out.println("Mid Element in the Stack is:"+AS.midElement()); 
    System.out.print("Elements in The form of String:");
  
    while(AS.isEmpty()!=true){
        System.out.print(" "+AS.toString()+" ");
        AS.Pop();
        }
        System.out.println();
    for(int i=10; i>=1; i--){
        As.Push(R.nextInt(100));
    }
    // Question#02  
    System.out.println("Mid Element in the Stack is:"+As.midElement()); 
System.out.print("Elements in the stack are : ");
while(As.isEmpty()!=true){
    System.out.print(" "+As.Peek()+" ");
    As.Pop();
}
     System.out.println();
     //Question#03 Reverse The Stack 
     ASS.Push("Babar Azam");
     ASS.Push("Virat Kohli");
     ASS.Push("David Warner");
     ASS.Push("JOE Root");
     ASS.Push("Quinton De Kock");
     ASS.Reverse(ASS);
     System.out.println("Mid String in the Stack is:"+ASS.midElement());
     System.out.println("Top 5 Batters in The World:");
     while(ASS.isEmpty()!=true){
        System.out.println(ASS.Peek());
        ASS.Pop();
     }
    
    
   }
 }


    