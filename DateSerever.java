import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DateSerever {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket s=new ServerSocket(5217);
		while(true) {
			System.out.println("Waitting for connection");
			Socket soc=s.accept();
			DataOutputStream out=new DataOutputStream(soc.getOutputStream());
			out.writeBytes("server Date:"+(new Date()).toString()+"\n");
			out.close();
			soc.close();
		}
	}

}
