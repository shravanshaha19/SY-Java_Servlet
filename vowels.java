package abc;

import java.util.Scanner;
import java.lang.Thread;

class mythread1 extends Thread{
	String s1;
	mythread1(String s){
		s1=s;
		start();
	}
	public void run() {
		System.out.println("Vowels are");
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
				System.out.println(" "+ch);
			}
		}
	}
}

public class vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String str=sc.nextLine();
		mythread1 v=new mythread1(str);
	} 

}




