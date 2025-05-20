package abc;

public class Alphabets extends Thread{
	char c;
	public void run()
	{
		for(c='A';c<='Z';c++)
		{
			System.out.println(""+c);
			
		}
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alphabets  t=new Alphabets();
		t.start();
	}

}
