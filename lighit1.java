import java.util.Arrays;
import java.util.List;

public class lighit1 implements Runnable {
	public enum Color {RED, ORANGE, GREEN}
	private List<Color> light = Arrays.asList(Color.GREEN, Color.ORANGE, Color.RED);
	
	private static volatile int counter = 0;
	private int i;
	
	private static final Object lock = new Object();
	
	public lighit1(Color color) {
		this.i = light.indexOf(color);
	}
	public void run() {
		try {
			synchronized(lock) {
				while(true) {
					while(counter % light.size() != i) lock.wait();
					System.out.println(Thread.currentThread().getName() + "::" + light.get(counter % light.size()));
					counter++;
					Thread.sleep(1000);
					lock.notifyAll();
				}
			}
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new lighit1(lighit1.Color.GREEN)).start();
		new Thread(new lighit1(lighit1.Color.ORANGE)).start();
		new Thread(new lighit1(lighit1.Color.RED)).start();
	}

}