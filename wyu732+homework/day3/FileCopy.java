package homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void copyFile(String src,String dest) throws IOException{
		File fileSrcFile=new File(src);
		if(!fileSrcFile.exists()) {
			fileSrcFile.createNewFile();
			System.out.println("源文件为空文件");
		}
		FileInputStream in=new FileInputStream(fileSrcFile);
		File file=new File(dest);
		if(!file.exists())
			file.createNewFile();
		FileOutputStream out=new FileOutputStream(file);
		int c;
		byte buffer[]=new byte[1024];
		while((c=in.read(buffer))!=-1){
		for(int i=0;i<c;i++)
		out.write(buffer[i]);
		}
		in.close();
		out.close();
	}
	public static void main(String[] args) throws IOException {
		String fileSrc="C:/IDEA/Idea1/myfile.txt";
		String fileDes="C:/IDEA/Idea1/myfile_cp.txt";
		copyFile(fileSrc,fileDes);//调用文件复制方法
		System.out.println("文件复制成功");
		}
	

}
