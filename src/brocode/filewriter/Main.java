package brocode.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Roses are red \n Nguyen Hai Nam \n Nguyen Thuc anh");
			writer.append("\n(A poem by Nam)");
			writer.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
