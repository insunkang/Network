package networkExam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyNetClient03 {

	public static void main(String[] args) {
		Socket socket;
		InputStream is = null;
		DataInputStream dis = null;
		OutputStream os=null;
		DataOutputStream dos = null;
		try {
			socket = new Socket("70.12.115.70",12346);
			is=socket.getInputStream();
			dis = new DataInputStream(is);
			
			os = socket.getOutputStream();
			dos = new DataOutputStream(os);
			
			String data = dis.readUTF();
			System.out.println(data);
			
			int intdata = dis.readInt();
			
			for (int i = 1; i <= 10; i++) {
				System.out.println(i+"*"+intdata+"="+i*intdata);								
			}									
			String gg= null;
			if (intdata%2==0) {
				gg = "짝수";
			}else {
				gg = "홀수";
			}
			dos.writeUTF(gg);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
