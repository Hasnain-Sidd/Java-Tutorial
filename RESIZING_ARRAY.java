public class RESIZING_ARRAY{
    public static  void Original_Array(int[] x){
        System.out.println("Origanl Array Size: "+x.length);
        for(int i=0; i<x.length; i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();
    }
    public static int[] Resize(int[] x,int j){
        int[] temp=new int[j];
        int k=0;
        while(k<x.length){
            temp[k]=x[k];
            k++;
        }
        return temp;
    }
    public static  void Print_Array(int[] x){
        System.out.println("Traversing Of Resizing Array: ");
        for(int i=0; i<x.length; i++){
            System.out.print(x[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
     int[] original={15,76,89,90,43};
     Original_Array(original);
     original = Resize(original,10);
     System.out.println("Size Of An Array After Resizing:"+original.length);
     original[5]=78;
     original[6]=90;
     original[7]=100;
     original[8]=342;
     original[9]=2000;
     Print_Array(original);

    }
}