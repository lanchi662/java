package com.briup.chap07.net.homework;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerSocketTest1 {
	private static boolean flog=true;
	public static void main(String[] args) throws Exception {
		ServerSocket serversocket=new ServerSocket(9999);
		File fi=new File("file/student.txt"); 
		boolean bo= fi.createNewFile();
		System.out.println("·þÎñÆ÷¿ªÆô");
		while(flog){
			Socket socket=serversocket.accept();
			InputStream in=socket.getInputStream();			
			ObjectInputStream ins=new ObjectInputStream(in);
			Student stu1=(Student)ins.readObject();
			Student stu2=(Student)ins.readObject();
			FileOutputStream file=new FileOutputStream("file/student.txt");
			ObjectOutputStream out1=new ObjectOutputStream(file);			
			out1.writeObject(stu1);
			out1.writeObject(stu2);
			out1.flush();
			socket.close();
			file.close();
			out1.close();
			in.close();
			ins.close();
		}
		serversocket.close();
	}
}
