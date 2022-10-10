import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class FileRead {
	

public static  void main(String[] asrgs) throws IOException{
	//represent a file
	File f= new File("C:\\Users\\Ak\\eclipse-workspace\\JavaPractice\\src\\text");
	//reading the text from thge file 
	//predefine classes required are "FileReadedr" and "BufferedReader"
	FileReader fr = new FileReader(f);
	try (BufferedReader br = new BufferedReader(fr)) {
		String str;
		while((str=br.readLine())!=null) {
			System.out.println(str);
		System.out.println(br.readLine());
		}
	}
}}
