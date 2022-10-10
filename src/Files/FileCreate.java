package Files;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class FileCreate {


	public static void main(String[] args) throws Throwable {
	
		Thread.sleep(3000);
		File f=new File("D:\\file.txt");
		FileWriter fw =new FileWriter(f);
		BufferedWriter br= new BufferedWriter(fw);
		br.write("my name is ashok");
		br.newLine();
		br.write("my name is sunil");
		br.newLine();
		br.write("my name is ashok");
		br.newLine();
		br.write("my name is sunil");
		br.newLine();
		br.write("my name is ashok");
		br.newLine();
		br.write("my name is sunil");
		br.flush();
		br.close();
		
		
		
		
				}

}
