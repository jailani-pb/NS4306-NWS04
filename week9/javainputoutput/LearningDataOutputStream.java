package week9.javainputoutput;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class LearningDataOutputStream {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try(DataOutputStream output = 
				new DataOutputStream(
						new FileOutputStream("data.dat", true))) {
			output.writeUTF("Jailani");
			output.writeDouble(70.2);
			output.writeBoolean(true);
			output.writeUTF("Rahman");
			output.writeDouble(90.1);
			output.writeBoolean(false);
		}
	}
	
}
