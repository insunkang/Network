package networkExam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;


public class MyNetServer03 {
	public static void main(String[] args) {
		Socket client = null;
		InputStream is  =null;
		DataInputStream dis = null;
		OutputStream os = null;
		DataOutputStream dos = null;
		 
		int v= (int) ((Math.random()*9)+2);
		try {
			ServerSocket server = new ServerSocket(12346);
			while(true) {
				client = server.accept();
				//InetAddress clientInfo = client.getInetAddress();
				is = client.getInputStream();
				dis = new DataInputStream(is);
				os = client.getOutputStream();
				dos = new DataOutputStream(os);
				
				
				dos.writeUTF("안녕하세요 클라이언트님");
				dos.writeInt(v);
				//int v = rand.nextInt(8)+2
				
				String data = dis.readUTF();
				
				System.out.println(data);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
