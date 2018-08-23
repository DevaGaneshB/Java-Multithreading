import java.io.*;  

public class write1 {

public static void main(String args[])throws Exception{    
     PrintWriter fout=new PrintWriter("‪F:\\Chat History.xls");        
     String s="";
     int i;
     for(i=0;i<15;i=i+2){
    	 s=s+"\n"+i;
     }
        
     fout.write(s);   
     fout.close();    
     System.out.println("success");    
}    
 


}
