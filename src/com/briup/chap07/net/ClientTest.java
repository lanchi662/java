package com.briup.chap07.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientTest {
	public static void main(String[] args) throws Exception {
		//String host="127.0.0.1";
		//int port=9999;
		//����Socket����
		//127.0.0.1�����Լ�
		Socket socket=new Socket("127.0.0.1",8090);
		//���շ��������͵�����		
		InputStream in=socket.getInputStream();
		InputStreamReader read=new InputStreamReader(in);
		BufferedReader buffer=new BufferedReader(read);
		String str=buffer.readLine();
		System.out.println("���Ƿ�����������������:"+str);
		socket.close();
		in.close();
		read.close();
		buffer.close();
		
	}

}

