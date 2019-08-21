package Program;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.*;

public class FileStreamExam {

	public static void main(String[] args) {
		byte[] b = new byte[1204];
		FileInputStream fis;
		FileOutputStream fos;
		try {
		fis = new FileInputStream("src/tin.txt"); //FileNotFoundException
		fos = new FileOutputStream("src/tout.txt"); //FileNotFoundException
		fis.read(b); //
		fos.write(b);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
		}
	}
}
