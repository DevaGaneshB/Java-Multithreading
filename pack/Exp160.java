package pack;
import java.io.*;  

public class Exp160 {
	 public static void main(String args[])throws Exception{  
	  Exp3 s1 =new Exp3(211,"ravi");  
	  
	  FileOutputStream fout=new FileOutputStream("f.txt");  
	  ObjectOutputStream out=new ObjectOutputStream(fout);  
	  
	  out.writeObject(s1);  
	  out.flush();  
	  System.out.println("success");  
	 }  
 
}
