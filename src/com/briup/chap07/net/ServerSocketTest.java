package com.briup.chap07.net;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
public class ServerSocketTest {
	private static boolean flog=true;
	public static void main(String[] args) throws Exception {
		//������
		//int port=9999;
		//����ServerSocket����
		
		ServerSocket serversocket=new ServerSocket(8090);
		System.out.println("�������ѿ���");
		//����Socket����
		while(flog){
		Socket socket=serversocket.accept();
		//�������ݸ��ͻ���		
		OutputStream outputstream=socket.getOutputStream();
		PrintStream print=new PrintStream(outputstream);
		print.println("������");
		print.flush();
		print.close();
		outputstream.close();
		socket.close();
		}
		serversocket.close();
		
	}

}
