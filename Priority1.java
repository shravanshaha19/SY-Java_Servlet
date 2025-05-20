package abc;

class mythread15 extends Thread{
	mythread15(String s){
		super (s);
		start();
	}
	public void run() {
		for(int i=0;i<3;i++) {
			Thread cur=Thread.currentThread();
			cur.setPriority(Thread.MIN_PRIORITY);
			int p=cur.getPriority();
			System.out.println(Thread.currentThread().getName());
			System.out.println("Thread Priority"+cur);
		}
	}
}
class mythread2 extends Thread{
	mythread2(String s){
		super (s);
		start();
	}
	public void run() {
		for(int i=0;i<3;i++) {
			Thread cur=Thread.currentThread();
			cur.setPriority(Thread.MAX_PRIORITY);
			int p=cur.getPriority();
			System.out.println(Thread.currentThread().getName());
			System.out.println("Thread Priority"+cur);
		}
	}
}
public class Priority1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mythread15 m1=new mythread15("mythread1");
		mythread2 m2=new mythread2("mythread2");
	}

}