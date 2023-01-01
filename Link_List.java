public class Link_List {
  Node1 head;
  int count=0; // Size of A Link List 
  class Node1{
  
  String data; 
  Node1  next; 
  Node1(String data){
    this.data=data;
    this.next=null;
  count++;
  } 
  }

  public void AddStart(String data){
    Node1 New_Node=new Node1(data);
  
    if(head==null) //Corner Case
    {
     head=New_Node;
    }
    else{
        New_Node.next=head;
        head=New_Node;
    }
  }
  public void AddEnd(String data){
    Node1 New_Node=new Node1(data);
    Node1 temp=head;
    if(head==null)// Corner Case 
    {
      head=New_Node;
      return;
    }
    else{
        while(temp.next!=null){
            temp=temp.next;
            
        }
        temp.next=New_Node;
    }
  }
  public void Traverse(){
    Node1 CurrentNode=head;
    if(head==null)//Corner Case
    {
    System.out.println("Link List Does Not Exist");
    }
    else{
        System.out.println("This is Complete Link List :");
        while(CurrentNode!=null){
            System.out.print(CurrentNode.data+" ");
            CurrentNode=CurrentNode.next;
        }
        System.out.println();
    }
  }
  public void DeleteFirst(){
    
    if(head==null) // Corner Case
     {
      System.out.println("Link List Does Not Exists:");
      return;
    }
    else{
      count--;
      head=head.next;
    }
  }
  public void DeleteLast(){
    Node1 First=head;
    Node1 Second=head.next;
    if(head==null){
      System.out.println("Link List does not exists");
      return;
    }
    count--;
    if(head.next==null){
      head=null;
      return;
    }
    else{
      while(Second.next!=null){
        Second=Second.next;
        First=First.next;
      }
      First.next=null;
    }
  }
  public void AfterDletion(){
    Node1 CurrentNode=head;
    if(head==null)//Corner Case
    {
    System.out.println("Link List Does Not Exist");
    }
    else{
        System.out.println("This is Complete Link List After Deletion Operation :");
        while(CurrentNode!=null){
            System.out.print(CurrentNode.data+" ");
            CurrentNode=CurrentNode.next;
        }
        System.out.println();
    }
  }
  public void SizeOfLINK_LIST(){
    System.out.println("Size Of Link List :"+count);
  }
 
  
  public static void main(String[] args){
    Link_List N=new Link_List();
    N.AddStart("I love my university.I have been studying in this university for last 12 Months and these 12 months are best days of my life.The University have provided me platform applied form enlite myself.");
    N.AddEnd("I am keep loving my university rest of my life.");
    N.Traverse();
   
    N.DeleteFirst();
   // N.DeleteLast();
    N.AfterDletion();
    N.SizeOfLINK_LIST();
  }
}
