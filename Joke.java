

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Joke {
	
	
	public String getJoke(){
		
		//The number of jokes is harcode due to optimization

		int random = (int) (Math.random() * 169);
		String line = new String();
		int number = 0;
		
		InputStream fis = getClass().getResourceAsStream("jokes.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		
		
			while (number != random) {
				// Deal with the line
				try {
					line = br.readLine();
				} catch (IOException e) {
					System.out.println("No line");
					e.printStackTrace();
				}
				number++;
			}


		// Done with the file
		try {
			br.close();
		} catch (IOException e) {
			System.out.println("Can't close");
			e.printStackTrace();
		}
		
		return line;		
	}
}