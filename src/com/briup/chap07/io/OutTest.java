package com.briup.chap07.io;

import java.io.PrintStream;


public class OutTest {
	public static void main(String[] args) throws Exception {
		//构建对象
		PrintStream p=System.out;
		//写数据
		String info="lala";
		//将字符串转换成字节
		byte[] str=info.getBytes();
		p.write(str);
		/*for(int i=0;i<str.length;i++){
		p.write(str[i]);
		}*/
		p.flush();
		p.close();
		
	}

}
