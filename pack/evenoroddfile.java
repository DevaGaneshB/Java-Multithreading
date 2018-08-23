package pack;

 class Table {
	
			 synchronized void printTable(int n){//synchronized method  
			   for(int i=n;i<=10;i=i+2){  
				   try{    
			             FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
			             fout.write(65);    
			             fout.close();    
			             System.out.println("success...");    
			            }catch(Exception e){System.out.println(e);}    
			      }    try{  
			      Thread.sleep(400);  
		     }catch(Exception e){System.out.println(e);}  
			   }  
			  
			 }  
			}  
			  
			class MyThread1file extends Thread{  
			Table t;  
			MyThread1(Table t){  
			this.t=t;  
			}  
			public void run(){  
			t.printTable(0);  
		}  
			  
			}  
			class MyThread2file extends Thread{  
		Table t;  
			MyThread2(Table t){  
			this.t=t;  
			}  
			public void run(){  
			t.printTable(1);  
			}  
			}  
			  
			public class evenoroddfile{ 
		public static void main(String args[]){  
			Table obj = new Table();//only one object  
			MyThread1 t1=new MyThread1(obj);  
			MyThread2 t2=new MyThread2(obj);  
			t1.start();  
			t2.start();  
		}  
	  

}
