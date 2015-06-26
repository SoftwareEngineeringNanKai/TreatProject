package cn.edu.nankai.translateexceltoclass.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import cn.edu.nankai.medicalproject.data.*;

public class GetAll {

	
	private static int whichType(String string){
		if(string.contains("增高") && string.contains("降低"))
			return 0;
		return 1;
		/*if(string.contains("阳性") && string.contains("阴性"))
			return 1;
		if(string.contains("增高") && string.contains("正常值范围"))
			return 2;
		if(string.contains("异常") && string.contains("正常值范围"))
			return 3;
		if(string.contains("增高") && string.contains("阴性"))
			return 4;*/
	}
	
	private static Handler handler;
	private static String module;
	private static Data data = Data.getInstance();
	private static void handleString(String str){
		
		//System.out.println("string: " + str/* + "str.length(): " + str.length()*/);
		if(str.length() == 0 || str.length() == 1){
		   //System.out.println("Null String");
			return;
		}
		Pattern p = Pattern.compile("\\s+");
		Matcher m = p.matcher(str);
		str = m.replaceAll("	");
		/*System.out.println("length: " + str.split("	").length);
		for(String tempString : str.split("\t")){
			System.out.println(tempString);
		}*/
		if(str.startsWith("板块")){
			module = str.split("、")[1];
			//System.out.println("module:" + module);
		}else if(str.split("\t").length == 2){
			if(handler != null){
				data.addItem(handler.getItem());
				}
			if(whichType(str) == 0){
				handler = new FirstHandler(module);
			}else {
				handler = new SecondHandler(module);
			}
			//handler.handleString(str);
		}else{
			handler.handleString(str);
		}
	}
	
	public static Data getInfo() {
		if(data.getItems().size() != 0){
			System.out.println("Not Changed");
			return data;
		}
			
		String fileName = "File/data.txt";
		String encoding = "UTF-8";
		TextReader textReader = new TextReader(fileName,encoding);
		
		while(!textReader.isLast()){
			handleString(textReader.readNext().trim());
			//System.out.println(textReader.readNext());
		}
		/*for(int i = 0;i < data.getItems().size();i++){
			System.out.println(data.getItems().get(i));
		}*/
		//Data tempData = data.clone();
		//data.clearItems();
		//data = new Data();
		return data;
	}
}
