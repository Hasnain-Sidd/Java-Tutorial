public class Concatenation_In_Arrays {
public static void main(String[] args) {
	int[] arr1= {13,87,90,51,89,870,123};
	int[] arr2= {78,413,531,890,761,190};
	float arr1_length=arr1.length;
	int arr2_length=arr2.length;
	int  arr3_length=(int) (arr1_length+arr2_length);
	int [] arr3=new int[arr3_length];
	for(int i=0; i<arr1.length; i++) {
		arr3[i]=arr1[i];
	}
	for(int i=0; i<arr2.length; i++) {
		arr3[arr1.length+i]=arr2[i];
	}
	
	System.out.print("Resultant Array is :");
	for(int i=0; i<arr3.length; i++) {
		
		
		System.out.print("  "+arr3[i]+"   ");
	}
	System.out.println();
	System.out.print("THIS IS SORTED ARRAY:");
	for(int i=0; i<arr3.length; i++) {
	for(int j=i+1; j<arr3.length; j++ ) {	
		if(arr3[i]>arr3[j]) {
			int temp=arr3[i];
			arr3[i]=arr3[j];
			arr3[j]=temp;
		}
	}
	System.out.print("  "+arr3[i]+"  " );
	}
	
	
	System.out.println();
	
	int mid;
      mid=arr3.length/2;
     
      
	System.out.println("Mid Of Resultant Array is:"+arr3[mid]);
			}
}
