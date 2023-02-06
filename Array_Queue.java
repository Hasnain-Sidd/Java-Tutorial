public class Array_Queue{
    static class Queue{
        static int arr[];
        static int size;
        static int rear=-1;
        public Queue(int size){
            arr=new int[size];
            this.size=size;
        }
        public static Boolean isEmpty(){
            return (rear==-1);
        }
        public static void Add(int data){
            if(rear==size-1){
                System.out.println("Queue is Full");
                return;
            }
            rear++;
            arr[rear]=data;
        }
        public static int Remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty!");
                
            }
            int front=arr[0];
            for(int i=0; i<rear; i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        public static int Front(){
            if(isEmpty()){
                System.out.println("Queue is Empty!");
                
            }
            int front =arr[0];
            return front;
        }
        public int Sum(){
            int sum=0;
            for(int i=0; i<size; i++){
                   sum+=Front();
            }
            return sum;
        }
    }
    public static void main(String[] args) {
        Queue Q=new Queue(5);
        Q.Add(9);
        Q.Add(19);
        Q.Add(12);
        Q.Add(32);
        Q.Add(87);
        System.out.println("Total Sum:"+Q.Sum());
        while(Q.isEmpty()!=true){
            System.out.println(Q.Front());
            Q.Remove();
        }
        
    }
}