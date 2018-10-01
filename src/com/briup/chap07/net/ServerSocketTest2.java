package com.briup.chap07.net;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest2 {
	public static void main(String[] args) throws IOException {
		ServerSocket serversocket=new ServerSocket(8090);
		while(true){
			Socket socket=serversocket.accept();
			FileInputStream file=new FileInputStream("file/dongtu.gif");
			BufferedInputStream buffer=new BufferedInputStream(file);
			byte b[]=new byte[1024];
			int len=-1;
			while((len=buffer.read(b))!=-1){
				OutputStream out=socket.getOutputStream();
				PrintStream print=new PrintStream(out);
				print.write(b, 0, len);
				print.flush();
				socket.close();
				file.close();
				out.close();
				print.close();
				buffer.close();
			}			
		}
		
		
	}

}
