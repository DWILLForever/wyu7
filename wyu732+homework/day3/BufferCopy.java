package homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferCopy {
	public static void copyFile() throws IOException{
		File fileSrcFile=new File("C:/IDEA/Idea1/myfile.txt");
		if(!fileSrcFile.exists()) {
			fileSrcFile.createNewFile();
			System.out.println("源文件为空文件");
		}
		BufferedReader br=new BufferedReader(new FileReader(fileSrcFile));
		File file=new File("C:/IDEA/Idea1/myfile_cp.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		BufferedWriter bWriter=new BufferedWriter(new FileWriter(file));
		String line;
		while((line=br.readLine())!=null) {
			bWriter.write(line);;
			bWriter.newLine();
		}
		br.close();
		bWriter.close();
	}
		public static void main(String[] args) throws IOException {
			copyFile();//调用文件复制方法
			System.out.println("文件复制成功");
			}
}
