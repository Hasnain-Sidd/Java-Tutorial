import java.io.*;
public class BufferedWriterReader {
public static void main(String[] args) {
	try {
	FileWriter FW=new FileWriter("C:\\Users\\City\\Desktop\\Question3.txt");
	BufferedWriter BFW=  new BufferedWriter(FW);
	BFW.write("A chunk of characters is read from the disk and stored in the internal buffer. \n "
			       + "And from the internal buffer characters are read individually.");
	BFW.close();
	}
	catch(IOException IT) {
		IT.printStackTrace();
	}
	try {
		FileReader FR =new FileReader("C:\\\\Users\\\\City\\\\Desktop\\\\Question3.txt");
		BufferedReader BFR = new BufferedReader(FR);
		System.out.println(BFR.read());
		int i=0;
		while((i=BFR.read())!=-1) {
			System.out.print((char)i);
			
	}
		
		BFR.close();
	}
	catch(IOException ec) {
		ec.printStackTrace();
	}
}
}
