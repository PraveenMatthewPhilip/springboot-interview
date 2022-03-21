package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		try  
		{  
		File file=new File("C:\\data\\data.txt");   
		FileReader fr=new FileReader(file);   
		BufferedReader br=new BufferedReader(fr);    
		String line;  
	   int count1 = 0;
		Map<String, Integer> map = new HashMap<String, Integer>();
		while((line=br.readLine())!=null)  
		{  
			count1++;
			line = line.replaceAll("\\d","");
		if(map.containsKey(line)) {
			
			map.put(line, map.get(line)+1);
		} else {
			map.put(line, 1);
		}
		
		}  
		for(String d : map.keySet()) {
			System.out.println("Code Rule : " + d + " : Count = "+map.get(d));
		}
		System.out.println("Total Code Rules Count : " + count1);
		fr.close();   
		}  
		catch(IOException e)  
		{  
		e.printStackTrace();  
		}  

	}

}
