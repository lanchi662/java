package com.briup.chap07.io;

import java.io.PrintStream;


public class OutTest {
	public static void main(String[] args) throws Exception {
		//��������
		PrintStream p=System.out;
		//д����
		String info="lala";
		//���ַ���ת�����ֽ�
		byte[] str=info.getBytes();
		p.write(str);
		/*for(int i=0;i<str.length;i++){
		p.write(str[i]);
		}*/
		p.flush();
		p.close();
		
	}

}
