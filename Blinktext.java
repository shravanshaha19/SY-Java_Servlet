
import java.awt.Label;
import javax.swing.JFrame;

public class Blinktext extends JFrame implements Runnable {
	Thread t;
	Label l1;
	int f;
	JFrame frame;
	public Blinktext() {
		t=new Thread(this);
		t.start();
		setLayout(null);
		l1=new Label("HELLO JAVA");
		l1.setBounds(100,100,100,40);
		add(l1);
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f=0;
	}
	public void run()
	{
		try {
			if(f==0) {
				t.sleep(200);
				l1.setText("");
				f=1;
			}
			if(f==1) {
				t.sleep(200);
				l1.setText("Hello Java");
				f=0;
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		run();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new Blinktext();
	}

}
