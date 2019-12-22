package mB2.ch8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class P12 {
public static void main(String[] str) throws IOException {
//	File f= new File("c:\book\java");
	File f=new File("c:\\book\\java");
	File f2=new File("c:/book/java");
	
	 // logger for replace gmdn code
    String basePath = "C:" + File.separator + "temp";
    SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
    String path1 = basePath + File.separator + "DataExtracted"
            + formatter.format(new Date()) + ".txt";
    File f4 = new File(path1);
    f.getParentFile().mkdirs();
    f.createNewFile();
    FileWriter logFW = new FileWriter(f);
}

private void echo() throws IOException {
try (FileReader fileReader = new FileReader("zoo-data.txt");
BufferedReader bufferedReader = new BufferedReader(fileReader)) {
System.out.println(bufferedReader.readLine());
}
}
}
