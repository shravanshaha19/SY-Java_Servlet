package abc;

public class Current_Thread_Slip17 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S;
		int p;
		Thread t=Thread.currentThread();
		S=t.getName();
		System.out.println("\n Current Thread name:"+S);
		p=t.getPriority();
		System.out.println("\n Current Thread name:"+p);
		t.setName("My Thread");
		S=t.getName();
		System.out.println("\n Changed Name:"+S);
		t.setPriority(2);
		p=t.getPriority();
		System.out.println("\n Changed Priority:"+p);
	}
}
