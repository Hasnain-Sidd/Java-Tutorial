import java.util.ArrayList;
import java.util.Random;

public class Array_List_Stack {
   static class Stack{
    static ArrayList<Integer> L=new ArrayList<>();
    public Boolean isEmpty(){
        return (L.size()==0);
    }
    public void Push(int data){
        L.add(data);
    }
    public int Pop(){
        int start=L.get(L.size()-1);
        L.remove(L.size()-1);
        return start;
    }
    public int Peek(){
        int start=L.get(L.size()-1);
        return start;
    }
   } 
   public static void main(String[] args) {
    Stack S=new Stack();
    Random R=new Random();
    for(int i=0; i<10; i++){
        S.Push(R.nextInt(100));
    }
    System.out.print("Elements In The Stack : ");
      System.out.print("{");
    while(S.isEmpty()!=true){
        System.out.print(S.Peek()+",");
        S.Pop();
    }
     System.out.print("}");
   }
}
