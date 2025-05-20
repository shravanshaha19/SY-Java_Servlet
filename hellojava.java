package abc;

import java.util.Scanner;

class mythread3 implements Runnable
{
	Thread t;
	public mythread3(String s) {
		t=new Thread(this,s);
		t.start();
	}
	public void run() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
		}
	}
}
public class hellojava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mythread3 m=new mythread3("Hello Java");
	}

}




