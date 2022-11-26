import java.io.*;
public class FileOutputInputStream {
public static void main(String[] args) {
	try {
	FileOutputStream FOP=new FileOutputStream("C:\\Users\\City\\Desktop\\Question2.txt");
	String  arr="It returns the name of the character "+"\nencoding being used by this stream.";
	//OutputStreamWriter OSW =new OutputStreamWriter(FOP);
	byte[] g=arr.getBytes();
	//FOP.write(g);
	FOP.write(g);;
	FOP.close();
	}
	catch(IOException IO) {
		IO.printStackTrace();
	}
	try {
		//char[] arr = new char[100];
		FileInputStream FIS =new FileInputStream("C:\\Users\\City\\Desktop\\Question2.txt");
		//InputStreamReader ISR = new InputStreamReader(FIS);
		
		System.out.println(FIS.read());
	}
	catch(IOException J) {
		J.printStackTrace();
	}
	
}
}
