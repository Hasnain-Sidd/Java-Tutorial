import java.io.*;

public class BufferedOutputInputStream {
public static void main(String[] args) {
	try { 
		
		String g="The FileOutputStream class of the java.io package can be used to write data (in bytes) to the files";
		FileOutputStream FO=new FileOutputStream("C:\\Users\\City\\Desktop\\Question1.txt");
		BufferedOutputStream  BO=new BufferedOutputStream(FO);
		DataOutputStream DO=new DataOutputStream(FO);
	
		System.out.println("Data has been entered in the file");
		byte[] k=g.getBytes();
		DO.writeInt(67);
		DO.writeDouble(456.65);
		DO.writeChar('H');
		DO.writeBoolean(true);
		BO.write(k);
		BO.close();
		
	}
	catch(IOException T) {
		T.printStackTrace();
	}
	try {
		FileInputStream  FI = new FileInputStream("C:\\Users\\City\\Desktop\\Question1.txt");
		BufferedInputStream BI=new BufferedInputStream(FI);
		DataInputStream DI=new DataInputStream(FI);
		System.out.println("Number of Bytes in File Are:"+BI.available());
		int a=DI.readInt();
		double d=DI.readDouble();
		char c=DI.readChar();
		boolean b=DI.readBoolean();
		int i=0;
		while((i=BI.read())!=-1) {
			System.out.print((char)i);
			
		}
		System.out.println("Values:"+a+":"+":"+b+":"+":"+c+":"+d);
		System.out.println("Successfully Read...............");
		BI.close();
		
		}
	catch(IOException IT) {
		IT.printStackTrace();
	}
}
}
