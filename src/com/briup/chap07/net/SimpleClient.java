package com.briup.chap07.net;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class SimpleClient {
	public static void main(String[] args) {
		try {
			
			Socket sk=new Socket("127.0.0.1",10001);
			while(true){
			//���շ������˴���������
			InputStream is = sk.getInputStream();
			DataInputStream dis=new DataInputStream(is);
			String read=dis.readUTF();
			System.out.println("��������˵��"+read);
			OutputStream os = sk.getOutputStream();
			DataOutputStream dos=new DataOutputStream(os);
			//���ռ���������
			InputStream is2=System.in;
			BufferedReader br=new BufferedReader(new InputStreamReader(is2));
			String str=br.readLine();
			//������������д��ȥ
			dos.writeUTF(str);
			dos.flush();
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
