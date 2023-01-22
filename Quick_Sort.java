public class Quick_Sort {
   public static int  Partition(int[] arr,int low,int high){
    int pivot=arr[high];
    int i=low-1;
    for(int j=low; j<high; j++){
        if(arr[j]<pivot){
            i++;
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
    i++;
    int temp=arr[i];
    arr[i]=arr[high];
    arr[high]=temp;
    return i;
   }
   public static void quick_sort(int[] arr,int low ,int high){
       if(low<high){
        int pivot_index=Partition(arr,low,high);
        quick_sort(arr, low, pivot_index-1);
        quick_sort(arr, pivot_index+1, high);
       }
   }
   public static void main(String[] args) {
    int arr[]={3,7,2,9,8,10,17};
    int n=arr.length;
    quick_sort(arr, 0, n-1);
    for(int i=0; i<arr.length; i++){
        System.out.print(" "+arr[i]+" ");
    }
   }
}
