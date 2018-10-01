package com.briup.chap07.io.homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {
	public static void test(String name1,String name2) throws Exception{
		FileInputStream fis=new FileInputStream(name1);
		FileOutputStream fos=new FileOutputStream(name2);
		byte b[]=new byte[64];
		int len=-1;
		while((len=fis.read(b))!=-1){
			fos.write(b,0,len);
			fos.flush();
		}
		fis.close();
		fos.close();
		
	}

	public static void main(String[] args) throws Exception {
		test("file/a.txt","file/b.txt");

	}

}
