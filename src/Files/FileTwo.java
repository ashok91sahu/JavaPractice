package Files;
import java.io.BufferedReader;
import java.io.FileReader;


public class FileTwo {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Throwable {
		FileReader fr= new FileReader("D:\file.txt");
		BufferedReader br= new BufferedReader(fr);
		String str="";
		while ((str=br.readLine())!=null) {
			System.out.println(str);}
	}
}


