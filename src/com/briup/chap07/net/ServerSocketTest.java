package com.briup.chap07.net;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
public class ServerSocketTest {
	private static boolean flog=true;
	public static void main(String[] args) throws Exception {
		//服务器
		//int port=9999;
		//构建ServerSocket对象
		
		ServerSocket serversocket=new ServerSocket(8090);
		System.out.println("服务器已开启");
		//接收Socket请求
		while(flog){
		Socket socket=serversocket.accept();
		//发送数据给客户端		
		OutputStream outputstream=socket.getOutputStream();
		PrintStream print=new PrintStream(outputstream);
		print.println("服务器");
		print.flush();
		print.close();
		outputstream.close();
		socket.close();
		}
		serversocket.close();
		
	}

}
