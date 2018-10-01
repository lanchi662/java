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
 * 基于TCP的Socket
 * Socket和serverSocket
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
			//接收键盘输进来的流
			InputStream is2=System.in;
			BufferedReader br=new BufferedReader(new InputStreamReader(is2));
			String str=br.readLine();
			//通过socket输出流，将键盘输入的流，输出到客户端
			dos.writeUTF(str);
			dos.flush();
			//socket接受客户端传进来的流
			InputStream is = sk.getInputStream();
			DataInputStream dis=new  DataInputStream(is);
			String read=dis.readUTF();
			System.out.println("客户端说："+read);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

