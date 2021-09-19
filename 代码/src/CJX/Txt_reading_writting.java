package CJX;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Txt_reading_writting {
public String read(String str1) {
	try {
	    File readName = new File(str1); // 相对路径
	   
	    FileReader reader = new FileReader(readName);
	    BufferedReader in = new BufferedReader(reader);
	    StringBuilder sb=new StringBuilder();
	    String s="";
	    while((s=in.readLine())!=null)
	    	sb.append(s+"\n");
	    String str2=sb.toString();
	    in.read();
	    in.close();
	    return str2;
	} catch (IOException e) {
	    e.printStackTrace();
	    return str1;
	}		
}
public void write(double double3,String str4) {
	try {
	    File writeName = new File(str4); // 相对路径
	    if(!writeName.exists()) {
	        writeName.createNewFile(); // 创建新文件,有同名的文件的话直接覆盖
	    }
	    FileWriter writer = new FileWriter(writeName);
	    BufferedWriter out = new BufferedWriter(writer);
	    	   
		out.write(double3+"\r\n");
	    out.flush(); // 把缓存区内容压入文件
	    out.close();
	} catch (IOException e) {
	    e.printStackTrace();
	}	
}
}
