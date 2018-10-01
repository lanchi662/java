package com.briup.chap07.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {
	public static void readFromFile(String name){

		FileInputStream file=null;
		try {
			//1.创建文件输入流对象
				file=new FileInputStream(name);
			//2.读文件		
				byte[] b=new byte[1024];
				while((file.read(b))!=-1){
					//将字节转化成String
					String str=new String(b);
					System.out.println(str);
					
				}
								
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally{
			//关闭资源
			if(file!=null){
			try {
				file.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			}
		}
		
	}
	public static void wtiteToFile(String name){
		//创建输出流对象
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream(name);
			//往出写数据
			String info="七夕！！！！";
			byte []b=info.getBytes();
			fos.write(b);
			fos.flush();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally{
			if(fos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public static void copyFile(String sourceFile,String name) throws IOException{
		//文件拷贝输入流输出流
		FileInputStream fis=new FileInputStream(sourceFile);
		FileOutputStream fos=new FileOutputStream(name);
		//读 写
		int len=-1;
		byte[] b=new byte[64];
		while((len=fis.read(b))!=-1){
			fos.write(b,0,len);
			fos.flush();
		}
		fis.close();
		fos.close();
	}
	public static void main(String[] args) throws IOException {
		//readFromFile("file/text.txt");
		//wtiteToFile("file/test.txt");
		copyFile("file/text.txt", "file/text2.txt");
		
	}

}
