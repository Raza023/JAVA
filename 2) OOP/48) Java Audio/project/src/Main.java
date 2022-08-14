import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class Main
{
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException
    {
        // audio file must be .wav to play it.

        Scanner scanner = new Scanner(System.in);

        File file = new File("audiofile.wav");
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);

        String line = "";
        while(!(line.equals("Q")))
        {
            System.out.println("P = PLAY, S = STOP, R = RESET, Q = QUIT");
            System.out.print("Enter your choice: ");
            
            line = scanner.next();
            line = line.toUpperCase();

            if(line.equals("P"))
            {
                clip.start();
            }
            else if(line.equals("S"))
            {
                clip.stop();
            }
            else if(line.equals("R"))
            {
                clip.setMicrosecondPosition(0);
            }
            else if(line.equals("Q"))
            {
                clip.close();
                System.out.println("Ok then bye!");
            }
            else
            {
                System.out.println("Please enter correct choice.");
            }
        }
        scanner.close();
    }
}
