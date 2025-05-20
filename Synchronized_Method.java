

class table
{
	void print_table(int n)
	{
		synchronized(this)
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(n*i);
				try {
					Thread.sleep(400);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
	}
}

class Mythread extends Thread{
	table T=new table();
	Mythread(table t)
	{
		this.T=t;
	}
	public void run()
	{
		T.print_table(5);
	}
}
class Mythread2 extends Thread
{
	table T=new table();
	Mythread2(table t)
	{
		this.T=t;
	}
	public void run()
	{
		T.print_table(100);
	}
}
public class Synchronized_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		table obj=new table();
		Mythread m1=new Mythread(obj);
		Mythread2 m2=new Mythread2(obj);
		m1.start();
		m2.start();
	}

}
