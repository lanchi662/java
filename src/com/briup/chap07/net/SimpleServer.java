package com.briup.chap07.net;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ����TCP��Socket
 * Socket��serverSocket
 * @author Administrator
 *
 */
public class SimpleServer {
	public static void main(String[] args){
		try {
			ServerSocket ss=new ServerSocket(10001);
			Socket sk=ss.accept();
			while(true){
			OutputStream os = sk.getOutputStream();
			DataOutputStream dos=new DataOutputStream(os);
			//���ռ������������
			InputStream is2=System.in;
			BufferedReader br=new BufferedReader(new InputStreamReader(is2));
			String str=br.readLine();
			//ͨ��socket����������������������������ͻ���
			dos.writeUTF(str);
			dos.flush();
			//socket���ܿͻ��˴���������
			InputStream is = sk.getInputStream();
			DataInputStream dis=new  DataInputStream(is);
			String read=dis.readUTF();
			System.out.println("�ͻ���˵��"+read);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

