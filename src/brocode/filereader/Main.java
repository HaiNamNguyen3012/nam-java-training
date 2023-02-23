package brocode.filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// FileReader = read the contents of a file as a stream of characters. One by one
		//				read() returns an int value which contains the byte value
		//				when read() return -1, there is no more data to be read
		
		try {
			FileReader reader = new FileReader("src\\brocode\\filereader\\art.txt");
			int data = reader.read();
			while(data != -1) {
				System.out.print((char) data);
				data = reader.read();
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
