import java.io.PushbackInputStream;
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
    public void pushATBottom(int data,Stack S){
        if(S.isEmpty()){
            S.Push(data);
            return;
        }
        int top=S.Pop();
        S.pushATBottom(data, S);
      S.Push(top);
    }
   } 
   public static void main(String[] args) {
    Stack S=new Stack();
    Random R=new Random();
    S.Push(8);
    S.Push(89);
    S.Push(78);
    S.Push(190);
    S.Push(56);
    S.pushATBottom(18, S);
    System.out.print("Elements In The Stack : ");
      System.out.print("{");
    while(S.isEmpty()!=true){
        System.out.print(S.Peek()+",");
        S.Pop();
    }
     System.out.print("}");
   }
}
