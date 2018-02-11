import java.io.*;

public class StreamReader {

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str;
		
		try {
			while(!(str = in.readLine()).equals(""))
				System.out.println(str);
			in.close();
		} catch(IOException e) {e.printStackTrace();}
	}
}
