import java.util.Arrays;
import java.util.Scanner;
public class Binary_Search{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int size;
        int target;
        int start;
        int end;
        int mid=0;
        int count=0;
        System.out.print("Enter The Size Of An Array:");
        size=Sc.nextInt();
        int[] arr=new int[size];
         System.out.println("Enter The Elemnts in Array:");
         for(int i=0; i<size; i++){
            arr[i]=Sc.nextInt();
         }
         Arrays.sort(arr);
         System.out.println("This is Sorted Array:");
         for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
         }
         System.out.println("Enter The Element To be Search:");
         target=Sc.nextInt();
         start=0; 
         end=size-1;
         
         while(start<=end){
             mid=(start+end)/2;

            if(arr[mid]==target){
                count++;
                break;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
         }
         if(count>0){
            System.out.println("Element is Found at index:"+mid);
         }
         else{
            System.out.println("Element is not Found!");
         }
    }
}