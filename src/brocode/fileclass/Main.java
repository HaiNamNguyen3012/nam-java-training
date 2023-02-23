package brocode.fileclass;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// file = An abstract representation of file and directory pathnames
		
		File file = new File("src\\brocode\\fileclass\\test.txt");
		
		if(file.exists()) {
			System.out.println("That file exist! :O!");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			
		} else {
			System.out.println("That file doesn't exist :(");
		}
	}

}
