import java.util.Scanner;
public class OneDimensionalArray {
public static void main(String[] args) {
	int a;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter  Number Of Elements : ");
	a=sc.nextInt();
	int[] n=new int[a];
	/*for(int i=0; i<a; i++) {
		n[i] =sc.nextInt();
	}
	System.out.println("************Print The Array Element By For LOOP*******************");
	
	for(int i=0; i<a; i++) {
		System.out.println(n[i]);
	}*/
	/*int i=0;
	while(i<a) {
		n[i]=sc.nextInt();
		i++;
	}
	System.out.println("************Printing The Array Elements By While LOOP********************");
	int j=0;
	while(j<a) {
		System.out.println(n[j]);
		j++;
	}*/
	int i=0;
	do {
		n[i]=sc.nextInt();
		i++;
	}
	while(i<a);
	System.out.println("***************Printing The Array Elements By Do While LOOP***********");
	int j=0;
	do {
		System.out.println(n[j]);
		j++;
	}
	while(j<a);
}
}
