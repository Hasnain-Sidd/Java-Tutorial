
// Buble Sorting
import java.util.Arrays;

public class Sorting_Problems {
public static void  main(String[] args) {
	// By Using Sort Method
	int[] arr=new int[] {13,15,78,21,4};
	System.out.println("Elements Before Sorting ");
	for(int j=0; j<5; j++) {
		System.out.println(arr[j]);
	}
	Arrays.sort(arr);
	System.out.println("Elements After Sorting");
        for(int i=0; i<5; i++) {
        	System.out.println(arr[i]);
        }
        System.out.println("Sorting Without Using Sort Method");
        	// Without Using Sort Method in Ascending Order 
        	for(int k=0; k<arr.length; k++) {
        		for(int l=k+1; l<arr.length; l++) {
        			if(arr[k]>arr[l]) {
        				int temp=arr[k];
        				arr[k]=arr[l];
        				arr[l]=temp;
        			}
        		}
        		System.out.println(arr[k]);
        	}
        	// Sorting in Drescending Order 
        	System.out.println("Sorting in Descending Order !");
        	for(int k=0; k<arr.length; k++) {
        		for(int l=k+1; l<arr.length; l++) {
        			if(arr[k]<arr[l]) {
        				int temp=arr[k];
        				arr[k]=arr[l];
        				arr[l]=temp;
        			}
        		}
        		System.out.println(arr[k]);
        	}
        	
        
}
}
