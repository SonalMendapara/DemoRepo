package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTextFile {

	public static void main(String[] args) throws IOException {

		//create new file
		File f = new File("C:\\testing\\temp.txt");
		f.createNewFile();
		
		//write into file
		FileWriter w = new FileWriter(f);
		BufferedWriter out = new BufferedWriter(w);
		
		out.write("This is 1st line");
		out.newLine();
		out.write("This is 2nd line");
		out.newLine();
		out.write("This is 3rd line");
		out.newLine();
		out.write("This is 4th line");
		out.newLine();
		out.write("This is 5th line");
		out.flush();
		
		//read from file
		FileReader r = new FileReader(f);
		BufferedReader rd = new BufferedReader(r);
		
//		System.out.println(rd.readLine());
//		System.out.println(rd.readLine());
//		System.out.println(rd.readLine());
//		System.out.println(rd.readLine());
//		System.out.println(rd.readLine());
//		System.out.println(rd.readLine());
//		System.out.println(rd.readLine());
		
		String s;
		int i = 0;
		while((s = rd.readLine()) != null) {
			System.out.println(s);
			i++;
		}
		System.out.println("number of line : "+ i);
	
		
		/*String s = rd.readLine();
		
		while(s != null) {
			System.out.println(s);
			s = rd.readLine();
		}*/

		
		

		
	}

}
