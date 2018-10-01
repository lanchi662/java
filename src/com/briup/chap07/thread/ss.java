package com.briup.chap07.thread;


import java.io.IOException;
import java.io.RandomAccessFile;

class XunThread extends Thread {
	private RandomAccessFile in;
	private RandomAccessFile out;
	private long start;
	private long end;

	public XunThread(RandomAccessFile in, RandomAccessFile out, long start, long end) {
		this.in = in;
		this.out = out;
		this.start = start;
		this.end = end;
	}

	public void run() {
		String name = getName();
		byte[] buf = new byte[1024];

		try {
			int len = 0;
			while (start < end) {
				synchronized (XunThread.class) {
					in.seek(start);
					out.seek(start);
					len = in.read(buf);
					if ((start + len) > end) {
						len = (int) (end - start);
						out.write(buf, 0, len);
						break;
					}
					System.out.println(name + " len:" + len);
					out.write(buf, 0, len);
					start += len;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
