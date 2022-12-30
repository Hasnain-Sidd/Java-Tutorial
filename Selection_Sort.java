// Selection Sort 
import java.util.Scanner;
public class Selection_Sort {
    public static void Sorting(){
        String[] arr2={"Hasnain","Khurram","Izzah","Hoor","Zainab"};
        int  count;
        String temperory=" ";
        for(int i=0; i<arr2.length; i++){
            count=i;
            for(int j=i+1; j<arr2.length; j++){
            if(arr2[j].compareTo(arr2[count])<0){
              count=j;
            }
            }
            temperory=arr2[i];
            arr2[i]=arr2[count];
            arr2[count]=temperory;

        }
        System.out.println("This is String Sorted Array:");
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
    }
   public static void main(String[] args) {
    int[] arr=new int [5];
    System.out.print("Enter The Array Elements : ");
    Scanner Sc=new Scanner(System.in);
    for(int i=0; i<arr.length; i++){
        arr[i]=Sc.nextInt();

    }
   int min;
   int temp=0;
    for(int i=0; i<arr.length; i++){
        min=i;
       for(int j=i+1; j<arr.length; j++){
        if(arr[min]>arr[j]){
           
            min=j;
           
        }
    }
     temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        
    }
    System.out.println("This is Inetger Sorted Array:");
for(int i=0; i<arr.length; i++){
    System.out.print(arr[i]+" ");
}
System.out.println();
Sorting();
   } 
}
