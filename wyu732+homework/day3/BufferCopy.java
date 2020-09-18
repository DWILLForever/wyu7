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
			System.out.println("Դ�ļ�Ϊ���ļ�");
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
			copyFile();//�����ļ����Ʒ���
			System.out.println("�ļ����Ƴɹ�");
			}
}
