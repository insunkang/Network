package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyNetClient04 {

	public static void main(String[] args) {
		Socket socket;
		BufferedReader in = null;
		PrintWriter out = null;
		try {
			socket = new Socket("70.12.115.70",12345);
			System.out.println("서버접속완료"+socket);
			
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//생성할 때 autoflush 옵션을 설정
			out = new PrintWriter(socket.getOutputStream(),true);
			//통신시작
			//1.클라 <- 서버
			String msg = in.readLine();
			System.out.println("서버가 보내온 메시지:"+msg);
			
			//2. 클라 > 서버
			out.println("서버야 안녕 나는 클라야");
			//out.flush();
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
