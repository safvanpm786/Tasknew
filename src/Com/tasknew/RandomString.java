package Com.tasknew;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileWriter;

public class RandomString {


	static String getAlphaNumericString()
	{

		 
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
				+ "0123456789"
				+ "abcdefghijklmnopqrstuvxyz";


		StringBuilder sb = new StringBuilder(100);

		for (int i = 0; i < 100; i++) {

			int index
			= (int)(AlphaNumericString.length()
					* Math.random());


			sb.append(AlphaNumericString
					.charAt(index));
		}



		return sb.toString();
	}

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		FileWriter myWriter = new FileWriter("D:\\Write\\filename.txt");
		int num = Integer.parseInt(reader.readLine());
		System.out.println(num);

		for (int i=0;i<num;i++) {
			System.out.println(RandomString
					.getAlphaNumericString());
			
			myWriter.write(RandomString.getAlphaNumericString()+"\n");	
	
		}
		
myWriter.close();
	}
	
}



