package com.briup.chap07.net;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Arrays;


public class CilentTest2 {
	public static void main(String[] args) throws  IOException {
		Socket socket=new Socket("127.0.0.1",8090);
		InputStream in=socket.getInputStream();
		BufferedInputStream buffer=new BufferedInputStream(in);
		byte b[]=new byte[1024];
		int len=-1;
		while((len=buffer.read(b))!=-1){
			//System.out.println(Arrays.toString(b));	
			FileOutputStream file=new FileOutputStream("file/dongtu1.gif");
			PrintStream print=new PrintStream(file);
			print.write(b, 0, len);
			file.close();
			print.close();
		}
		socket.close();
		in.close();
		buffer.close();
		
	}

}
