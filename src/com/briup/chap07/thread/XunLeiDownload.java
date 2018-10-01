package com.briup.chap07.thread;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class XunLeiDownload {
	public static void main(String[] args) {

		RandomAccessFile in = null;
		RandomAccessFile out = null;

		String path = "src/com/briup/jd1806/chap10/IOex06/file.txt";
		File file = new File(path);
		long length = file.length();

		try {
			in = new RandomAccessFile(file, "r");
			out = new RandomAccessFile("src/com/briup/jd1806/chap10/IOex06/fileDownload.txt", "rw");

			XunThread t1 = new XunThread(in, out, 0, length / 2);
			XunThread t2 = new XunThread(in, out, length / 2, length);
			t1.start();
			t2.start();

			t1.join();
			t2.join();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (in != null)
					in.close();
				if (out != null)
					out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
