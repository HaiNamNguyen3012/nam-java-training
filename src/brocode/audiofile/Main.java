package brocode.audiofile;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import javax.sound.sampled.*;

public class Main {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		URL file = new URL("https://www.wavsource.com/snds_2020-10-01_3728627494378403/sfx/air_raid.wav");
		File file1 = new File("src\\air_raid.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file1);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		String response = "";
		
		while(!response.equals("Q")) {
			System.out.println("P = play, S = Stop, R = Reset, Q = Quit");
			System.out.print("Enter your choice: ");
			response = sc.next();
			response = response.toUpperCase();
			switch(response) {
				case("P"): clip.start();
				break;
				case("S"): clip.stop();
				break;
				case("R"): clip.setMicrosecondPosition(0);
				break;
				case("Q"): clip.close();
				break;
				default: System.out.println("Not a valid response");
			}
		}
		System.out.println("Byeee!");
	}

}
